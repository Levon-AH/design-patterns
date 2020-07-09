public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public Espresso(double cost) {
        super(cost);
        description = "Espresso";
    }

    @Override
    public double calcCost() {
        return cost;
    }
}
