package exception.test2;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//the goal of this exercise is to filter only Object that in Main have True as argument
//and add them to the final Map filterMap
//if an Object have value False it shoudent be added to this final Map
public class FlightChecker {

    Boolean trueOrFalse;

    public Map <String,Boolean> findFlight (Flight flight, Boolean trueOrFalse)  {
        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put(flight.getArrivalAirport(), trueOrFalse );
        flightList.put(flight.getDepartureAirport(), trueOrFalse );

        Map <String,Boolean> filterMap = filterByValueFlight(flightList, Boolean -> Boolean == true);
        System.out.println(filterMap);

        return filterMap;
    }

    static <String,Boolean> Map <String,Boolean> filterByValueFlight(Map<String,Boolean> map, Predicate<Boolean> predicate){
        return map.entrySet().stream()
                .filter(entry -> predicate.test(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }

}
