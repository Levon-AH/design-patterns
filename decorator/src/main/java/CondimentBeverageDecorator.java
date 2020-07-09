public abstract class CondimentBeverageDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentBeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
        description = "condiment for beverage";
    }

    public CondimentBeverageDecorator(double cost, Beverage beverage) {
        super(cost);
        this.beverage = beverage;
        description = "condiment for beverage";
    }

    public abstract double calcCost();
}
