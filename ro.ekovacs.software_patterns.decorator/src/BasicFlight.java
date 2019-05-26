public class BasicFlight implements Flight {

    private static final String CLASS = "";
    private static final String FOOD_SERVED = "WATER";
    private static final double COST = 45.50;

    private String _class;
    private String foodServed;
    private double cost;

    public BasicFlight() {
        _class = CLASS;
        foodServed = FOOD_SERVED;
        cost = COST;
    }

    public void setClass(String _class) {
        this._class = _class;
    }

    public void setFoodServed(String foodServed) {
        this.foodServed = foodServed;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String _getClass() {
        return _class;
    }

    @Override
    public String getFoodServed() {
        return foodServed;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
