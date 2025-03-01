import data.PlanesList;
import planes.Plane;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Plane> planes = PlanesList.createPlanesList();
        Airport airport = new Airport(planes);
        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());
        Airport passengerAirport = new Airport(airport.getPassengerPlane());
        System.out.println("Military airport sorted by max distance: " + militaryAirport
            .sortByMaxDistance()
            .toString());
        System.out.println("Passenger airport sorted by max speed: " + passengerAirport
            .sortByMaxSpeed()
            .toString());

        System.out.println(
            "Plane with max passenger capacity: " + passengerAirport.getPassengerPlaneWithMaxPassengersCapacity());
    }
}
