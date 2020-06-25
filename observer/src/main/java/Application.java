import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Subject<String> subject = new DefaultSubject<>("Hi!!!, welcome to chat");
        subject.addObserver(new DefaultObserver<>());
        subject.alreadyChanged();
    }
}
