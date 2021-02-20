import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Bird implements Flyable {
    @Override
    public void fly() {
        log.info("I'm flying");
    }
}
