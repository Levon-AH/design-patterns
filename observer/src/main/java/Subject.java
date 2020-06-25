public interface Subject<T> {
    void addObserver(Observer<T> observer);

    void removeObserver(Observer<T> observer);

    void notifyObservers();

    void notifyObservers(T data);

    void alreadyChanged();
}
