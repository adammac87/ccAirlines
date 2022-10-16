import AbClass.Staff.CrewMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    CrewMember crewMember;


    @Before
    public void setUp(){
        crewMember = new CrewMember("Moogle", "Steward");
    }


    @Test
    public void hasName(){assertEquals("Moogle", crewMember.getName());}

    @Test
    public void hasRank(){assertEquals("Steward", crewMember.getRank());}

    @Test
    public void hasMessage(){assertEquals("message", crewMember.relayMessage());}
;}
