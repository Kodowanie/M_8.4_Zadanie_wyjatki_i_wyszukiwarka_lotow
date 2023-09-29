package exception.test2;

public class Main {
    public static void main(String[] args) {

       FlightChecker flightChecker = new FlightChecker();

       Flight flight1 = new Flight("Warszawa","Kraków");
       Flight flight2 = new Flight("Warszawa","Gdansk");

        flightChecker.findFlight(flight1,true);
        flightChecker.findFlight(flight2,false);






    }
}