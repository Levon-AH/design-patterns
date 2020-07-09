public class Mocha extends CondimentBeverageDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
        final String condimentName = Mocha.class.getSimpleName();
        description = String.format("%s %s", condimentName, "for beverage");
    }

    public Mocha(double cost, Beverage beverage) {
        super(cost, beverage);
        final String condimentName = Mocha.class.getSimpleName();
        description = String.format("%s %s", condimentName, "for beverage");
    }

    @Override
    public double calcCost() {
        return cost + beverage.calcCost();
    }
}
