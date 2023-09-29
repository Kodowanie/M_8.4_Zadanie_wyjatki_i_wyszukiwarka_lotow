package exception.test1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warszawa", "Krakow");
        Flight flight2 = new Flight("Gdansk", "Warszawa");
        Flight flight3 = new Flight("Lodz", "Gdansk");
        Flight flight4 = new Flight("Berlin", "Poznan");
        Flight flight5 = new Flight("Warszawa", "Berlin");
        Flight flight6 = new Flight("Berlin", "Nowy York");

        FlightChecker flightChecker = new FlightChecker();

        try{
            flightChecker.findFlight(flight5);
            System.out.println(
                "Route departure airport '" + flight5.getDepartureAirport()
                + "' status '" + flightChecker.trueOrFlaseDeparture + "'" + '\n'
                + "the arrival airport will be '" + flight5.getArrivalAirport()
                + "' status '" + flightChecker.trueOrFlaseArrival + "'" + '\n');
            System.out.println("Route exist");
        } catch (RouteNotFoundException e){
            System.out.println("Route don't exist" + '\n');
        }

        System.out.println("Map of availableFlight : " +"\n"+ flightChecker.availableFlight);

    }
}