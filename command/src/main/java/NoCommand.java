import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoCommand implements Command {
    @Override
    public void execute() {
        log.info("No Command");
    }

    @Override
    public void undo() {
        log.info("No Undo Command");
    }
}
