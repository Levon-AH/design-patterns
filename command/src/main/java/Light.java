import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Light {
    private boolean isOn;

    public void on() {
        log.info("Light is on");
        isOn = true;
    }

    public void off() {
        log.info("Light is off");
        isOn = false;
    }
}
