import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember chiefPurser;
    CabinCrewMember purser;
    CabinCrewMember flightAttendant;


    @Before
    public void before(){
        chiefPurser = CabinCrewMember.CHIEFPURSER;
        purser = CabinCrewMember.PURSER;
        flightAttendant = CabinCrewMember.FLIGHTATTENDANT;
    }

    @Test
    public void hasName(){
        assertEquals("Ewan", chiefPurser.getName());
        assertEquals("Connie", purser.getName());
        assertEquals("Richard", flightAttendant.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Chief Purser", chiefPurser.getRank());
        assertEquals("Purser", purser.getRank());
        assertEquals("Flight Attendant", flightAttendant.getRank());
    }

    @Test
    public void canChatWithPassengers(){
        assertEquals("Would you like a slice of lemon with that?", flightAttendant.cabinBanter());
    }
}
