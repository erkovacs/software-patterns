public class ExecutiveFlight extends FlightDecorator {
    public ExecutiveFlight(Flight flight) {
        super(flight);
    }

    @Override
    public String _getClass() {
        return "Executive";
    }

    @Override
    public String getFoodServed() {
        return super.getFoodServed() + ", RED ANGUS STEAK WITH MUSHROOM SAUCE, CHAMPAGNE";
    }

    @Override
    public double getCost() {
        return super.getCost() + 350.50;
    }
}
