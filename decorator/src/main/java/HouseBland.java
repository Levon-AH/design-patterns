public class HouseBland extends Beverage {
    public HouseBland() {
        description = "HouseBland";
    }

    public HouseBland(double cost){
        super(cost);
        description = "HouseBland";
    }

    @Override
    public double calcCost() {
        return cost;
    }
}
