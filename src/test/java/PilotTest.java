import AbClass.Staff.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void SetUp(){
        pilot = new Pilot("Navi", "Pilot","ABC1");
    }

    @Test
    public void hasName(){ assertEquals("Navi", pilot.getName());}
    @Test
    public void hasRank(){ assertEquals("Pilot", pilot.getRank());}
    @Test
    public void hasPilotsLicense(){ assertEquals("ABC1", pilot.getPilotsLicense());}



}
