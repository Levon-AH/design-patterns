public class Whip extends CondimentBeverageDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
        final String condimentName = Whip.class.getSimpleName();
        description = String.format("%s %s", condimentName, "for beverage");
    }

    public Whip(double cost, Beverage beverage) {
        super(cost, beverage);
        final String condimentName = Whip.class.getSimpleName();
        description = String.format("%s %s", condimentName, "for beverage");
    }

    @Override
    public double calcCost() {
        return cost + beverage.calcCost();
    }
}
