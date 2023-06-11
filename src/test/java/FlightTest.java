import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;

    @Before
    public void setUp(){
        flight = new Flight("JA123", "IBZ", "MIA", "1500");
        passenger1 = new Passenger("Jamie", 2);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("JA123", flight.getFlightNumber());
    }

    @Test
    public void canGetFlightDestination(){
        assertEquals("IBZ", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("MIA", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("1500", flight.getDepartureTime());
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(500, flight.availableSeats());
    }

    @Test
    public void canAddPassengerToFlight(){
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        flight.addPassengerToFlight(passenger1);
        assertEquals(499, flight.availableSeats());
    }

}
