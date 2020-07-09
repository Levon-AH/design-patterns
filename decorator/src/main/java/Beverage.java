public abstract class Beverage {
    protected String description;
    protected double cost;

    public Beverage() { }

    public Beverage(double cost) {
        if (cost <= 0) {
            throw new IllegalArgumentException("cost must be positive");
        }
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract double calcCost();
}
