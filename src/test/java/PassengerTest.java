import AbClass.Customer.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest{


Passenger passenger;




@Before
public void SetUp() {
    passenger = new Passenger("Loki the Cat", 3);


}


@Test
    public void hasName(){
    assertEquals("Loki the Cat",passenger.getName());
}@Test
    public void hasBags(){
        assertEquals(3,passenger.getNumberOfBags());
    }
}