public class App {
    public static void main(String[] args) {
        Beverage houseLand = new HouseBland();
        houseLand.setCost(1.99);
        Beverage kampuchea = new Soy(.56, new Mocha(.97, houseLand));

        System.out.println(kampuchea.calcCost());
    }
}
