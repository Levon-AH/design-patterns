import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BirdAdapter implements Swim {
    private final Flyable bird;

    @Override
    public void swim() {
        bird.fly();
        log.info("I'm flying under sea");
    }
}
