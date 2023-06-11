import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = Plane.BOEING747;
    }

    @Test
    public void hasCapacityValue(){
        assertEquals(500, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(5000, plane.getTotalWeight());
    }
}
