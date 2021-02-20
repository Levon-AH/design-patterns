public class App {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Swim swim = new BirdAdapter(bird);
        swim.swim();
    }
}
