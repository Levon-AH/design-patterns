import lombok.extern.slf4j.Slf4j;

import java.util.EnumMap;
import java.util.Map;

@Slf4j
public class RemoteController {
    private Map<Button, Command> commands;
    private Command undoCommand;

    public RemoteController() {
        commands = new EnumMap<>(Button.class);
        undoCommand = new NoCommand();
    }

    public RemoteController(EnumMap<Button, Command> commands, Command undoCommand) {
        this.commands = commands;
        this.undoCommand = undoCommand;
    }

    public void pressButton(Button button) {
        if (button == null) {
            log.warn("No button is available for this action");
            return;
        }
        undoCommand = commands.get(button);
        commands.get(button).execute();
    }

    public void undo() {
        undoCommand.undo();
    }

    public Map<Button, Command> getCommands() {
        return commands;
    }

    public void setCommands(Map<Button, Command> commands) {
        this.commands = commands;
    }

    public void addCommand(Button button, Command command) {
        if (commands == null) {
            commands = new EnumMap<>(Button.class);
        }
        commands.put(button, command);
    }

    public void removeCommand(Button button) {
        if (commands == null) {
            return;
        }
        commands.remove(button);
    }

    @Override
    public String toString() {
        return "RemoteController{" +
                "commands=" + commands +
                '}';
    }
}
