import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@ToString
public class DefaultSubject<T> implements Subject<T> {

    private T data;
    private final Set<Observer<T>> observers;
    private boolean changed;

    public DefaultSubject(T data) {
        this.observers = new HashSet<>();
        this.data = data;
    }

    public DefaultSubject(T data, Set<Observer<T>> observers) {
        this.data = data;
        this.observers = observers;
    }

    @Override
    public void addObserver(Observer<T> observer) {
        final boolean added = observers.add(observer);
        final String loggingMsg = added ? String.format("%s %b", "Successfully added observer: ", observer) :
                String.format("%s %b", "This observer isn't added: ", observer);
        log.info(loggingMsg);
    }

    @Override
    public void removeObserver(Observer<T> observer) {
        final boolean removed = observers.remove(observer);
        final String loggingMsg = removed ? String.format("%s %b", "Successfully removed observer: ", observer) :
                String.format("%s %b", "This observer isn't present: ", observer);
        log.info(loggingMsg);
    }

    @Override
    public void notifyObservers() {
        if (changed && observers.size() != 0) {
            log.info("The state of subject isn't changed: {}", this);
            observers.forEach(observer -> {
                observer.update(this, null);
            });
            changed = false;
        }
        log.info("The state of subject isn't changed: {}", this);
    }

    @Override
    public void notifyObservers(T data) {
        if (changed && observers.size() != 0) {
            log.info("The state of subject isn't changed: {}", this);
            observers.forEach(observer -> {
                observer.update(this, data);
            });
            changed = false;
        }
        log.info("The state of subject isn't changed: {}", this);
    }

    @Override
    public void alreadyChanged() {
        changed = true;
        notifyObservers(data);
    }

    public T getData() {
        return data;
    }

    public Set<Observer<T>> getObservers() {
        return observers;
    }

    public void setData(T data) {
        this.data = data;
        this.alreadyChanged();
        this.notifyObservers(data);
    }
}
