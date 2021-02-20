import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Fish implements Swim {
    @Override
    public void swim() {
        log.info("I'm swimming");
    }
}
