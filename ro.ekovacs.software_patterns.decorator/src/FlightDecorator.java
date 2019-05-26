public abstract class FlightDecorator implements Flight {
    private Flight flight;

    public FlightDecorator(Flight flight){
        this.flight = flight;
    }

    @Override
    public String _getClass() {
        return flight._getClass();
    }

    @Override
    public String getFoodServed() {
        return flight.getFoodServed();
    }

    @Override
    public double getCost() {
        return flight.getCost();
    }
}
