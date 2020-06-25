import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
@EqualsAndHashCode
public class DefaultObserver<T> implements Observer<T> {
    private T data;
    private Subject<T> subject;

    public DefaultObserver() {

    }

    @Override
    public void update(Subject<T> subject, T state) {
        this.data = state;
        doSomethingWithState();
    }

    private void doSomethingWithState() {
        log.info("you have new data: {}", data);
    }
}
