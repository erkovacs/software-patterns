public class DecoratorMain {
    public static void main(String[] args){
        Flight flight = new BasicFlight();
        System.out.println(String.format("Basic flight: %s %s %.2f", flight.getClass(), flight.getFoodServed(), flight.getCost()));
        Flight businessFlight = new BusinessFlight(flight);
        System.out.println(String.format("Business flight: %s %s %.2f", businessFlight.getClass(), businessFlight.getFoodServed(), businessFlight.getCost()));
        Flight executiveFlight = new ExecutiveFlight(businessFlight);
        System.out.println(String.format("Executive flight: %s %s %.2f", executiveFlight.getClass(), executiveFlight.getFoodServed(), executiveFlight.getCost()));
    }
}
