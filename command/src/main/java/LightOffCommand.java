import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LightOffCommand implements Command {

    private final Light light;

    @Override
    public void execute() {
        log.info("executing command for light off : {}.", light);
        light.off();
        log.info("executed light off command. Light : {}.", light);
    }

    @Override
    public void undo() {
        log.info("executing undo command for light off : {}", light);
        light.on();
        log.info("executed light off undo command. Light : {}.", light);
    }
}
