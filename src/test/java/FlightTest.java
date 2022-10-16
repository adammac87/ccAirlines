import AbClass.Customer.Passenger;
import AbClass.Staff.CrewMember;
import AbClass.Staff.Pilot;
import Plane.Flight;
import org.junit.Before;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Pilot pilot;
    CrewMember crewMember1;
    CrewMember crewMember2;


    @Before
    public void setUp(){
    flight = new Flight();
    pilot = new Pilot("Bob", "Captain", "BRG1");
    crewMember1 = new CrewMember("Louise", "cabinCrew");
    crewMember2 = new CrewMember("Tina", "Head Steward");
    passenger1 = new Passenger("Linda", 1);
    passenger2= new Passenger("Gene", 6);


    }
}
