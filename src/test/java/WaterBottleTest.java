import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void checkVolumeStarts100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void takes10(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void fillBottle(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }
}
