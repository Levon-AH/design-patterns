import java.util.Observable;

public interface Observer<T> {
    void update(Subject<T> observable, T state);
}
