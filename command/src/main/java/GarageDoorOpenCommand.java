import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class GarageDoorOpenCommand implements Command {
    private final GarageDoor garageDoor;

    @Override
    public void execute() {
        log.info("executing command for garage door open : {}.", garageDoor);
        garageDoor.up();
        log.info("executed garage door open command. Light : {}.", garageDoor);
    }

    @Override
    public void undo() {
        log.info("executing undo command for garage door open : {}.", garageDoor);
        garageDoor.down();
        log.info("executed undo garage door open command. Light : {}.", garageDoor);
    }
}
