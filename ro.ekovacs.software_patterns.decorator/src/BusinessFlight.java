public class BusinessFlight extends FlightDecorator {
    public BusinessFlight(Flight flight) {
        super(flight);
    }

    @Override
    public String _getClass() {
        return "Business";
    }

    @Override
    public String getFoodServed() {
        return super.getFoodServed() + ", CHICKEN PAELLA, WINE";
    }

    @Override
    public double getCost() {
        return super.getCost() + 350.50;
    }
}
