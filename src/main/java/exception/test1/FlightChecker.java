package exception.test1;

import exception.test1.Flight;

import java.util.HashMap;
import java.util.Map;


public class FlightChecker {
    Map<String, Boolean> flightList = new HashMap<>();
    Map<String, Boolean> availableFlight = new HashMap<>();
    Boolean trueOrFlaseDeparture;
    Boolean trueOrFlaseArrival;

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        flightList.put("Warszawa", true);
        flightList.put("Krakow", true);
        flightList.put("Poznan", true);
        flightList.put("Lodz", false);
        flightList.put("Gdansk", false);

        for (Map.Entry<String, Boolean> map : flightList.entrySet()) {
            availableFlight.put(map.getKey(), map.getValue());
            if (flightList.containsKey(flight.getDepartureAirport()) || flightList.containsKey(flight.getArrivalAirport())) {
                trueOrFlaseDeparture = flightList.get(flight.getDepartureAirport());
                trueOrFlaseArrival = flightList.get(flight.getArrivalAirport());
            } else {
                throw new RouteNotFoundException();
            }
        }
        return availableFlight;
    }
}