import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class App {
    public static void main(String[] args) {
        final Light light = new Light();
        final GarageDoor garageDoor = new GarageDoor(new Light());
        final RemoteController remoteController = new RemoteController();
        log.info("Slot : {}", remoteController);
        remoteController.addCommand(Button.LIGHT_OFF_BUTTON, new LightOffCommand(light));
        remoteController.addCommand(Button.LIGHT_ON_BUTTON, new LightOnCommand(light));
        remoteController.addCommand(Button.GARAGE_DOOR_CLOSE, new GarageDoorCloseCommand(garageDoor));
        remoteController.addCommand(Button.GARAGE_DOOR_OPEN, new GarageDoorOpenCommand(garageDoor));
        final MacroCommand macroCommand = new MacroCommand(
                new ArrayList<>(remoteController.getCommands().values())
        );
        log.info("Slot : {}", remoteController);
        remoteController.pressButton(Button.GARAGE_DOOR_OPEN);
        remoteController.undo();
        remoteController.pressButton(Button.LIGHT_ON_BUTTON);
        remoteController.undo();
        remoteController.pressButton(Button.LIGHT_OFF_BUTTON);
        remoteController.pressButton(Button.GARAGE_DOOR_CLOSE);
        remoteController.undo();
        remoteController.pressButton(Button.LIGHT_OFF_BUTTON);

        log.info("//////////////////////////////////////////////////////");

        macroCommand.execute();

        log.info("//////////////////////////////////////////////////////");

        macroCommand.undo();
    }
}
