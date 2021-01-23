import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class GarageDoor {
    private final Light light;

    public void up() {
        log.info("Garage Door is Open");
    }

    public void down() {
        log.info("Garage Door is Close");
    }

    public void stop() {
        log.info("Garage Door is Stop");
    }

    public void lightOn() {
        light.on();
        log.info("Garage Door's Light is On");
    }

    public void lightOff() {
        light.off();
        log.info("Garage Door's Light is Off");
    }
}
