import AbClass.Customer.Passenger;
import AbClass.Staff.CrewMember;
import AbClass.Staff.Pilot;
import Plane.Flight;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Pilot pilot;
    CrewMember crewMember1;
    CrewMember crewMember2;


    @Before
    public void setUp(){
    flight = new Flight("123", "Edi","Abr","12:50");
    pilot = new Pilot("Bob", "Captain", "BRG1");
    crewMember1 = new CrewMember("Louise", "cabinCrew");
    crewMember2 = new CrewMember("Tina", "Head Steward");
    passenger1 = new Passenger("Linda", 1);
    passenger2= new Passenger("Gene", 6);


    }
    @Test
    public void hasDepartureTime(){
        assertEquals("12:50", flight.getDepartureTime());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals("123", flight.getFlightNumber());
    }
    @Test
    public void hasDepartureAirport(){
        assertEquals("Abr", flight.getDepartureAirport());
    }
    @Test
    public void hasDestinationAirport(){
        assertEquals("Edi", flight.getDestinationAirport());
    }



    @Test
    public void CanAddPilot(){
        flight.addPilot(pilot);
        assertEquals(1,flight.getPilots());
    }

    @Test
    public void CanAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1,flight.getPassengers());
    }

    @Test
    public void CanAddCrewMember(){
        flight.addCrewMember(crewMember1);
        assertEquals(1,flight.getCrewMembers());
    }




}
