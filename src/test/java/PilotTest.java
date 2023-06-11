import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = Pilot.CAPTAIN;
    }

    @Test
    public void pilotHasName(){
        assertEquals("Zoe", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void canGetLicence(){
        assertEquals("A12345", pilot.getLicence());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("This is your Captain speaking", pilot.flyPlane());
    }

}
