public class Soy extends CondimentBeverageDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        final String condimentName = Mocha.class.getSimpleName();
        description = String.format("%s %s", condimentName, "for beverage");
    }

    public Soy(double cost, Beverage beverage) {
        super(cost, beverage);
        final String condimentName = Mocha.class.getSimpleName();
        description = String.format("%s %s", condimentName, "for beverage");
    }

    @Override
    public double calcCost() {
        return cost + beverage.calcCost();
    }
}
