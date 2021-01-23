import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LightOnCommand implements Command {
    private final Light light;

    @Override
    public void execute() {
        log.info("executing command for light on : {}.", light);
        light.on();
        log.info("executed light on command. Light : {}.", light);
    }

    @Override
    public void undo() {
        log.info("executing undo command for light on : {}", light);
        light.off();
        log.info("executed light on undo command. Light : {}.", light);
    }
}
