import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class GarageDoorCloseCommand implements Command {

    private final GarageDoor garageDoor;

    @Override
    public void execute() {
        log.info("executing command for garage door close : {}.", garageDoor);
        garageDoor.down();
        log.info("executed garage door close command. Light : {}.", garageDoor);
    }

    @Override
    public void undo() {
        log.info("executing undo command for garage door close : {}.", garageDoor);
        garageDoor.up();
        log.info("executed undo garage door close command. Light : {}.", garageDoor);
    }
}
