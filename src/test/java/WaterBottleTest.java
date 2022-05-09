import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle watterBottle;

    @Before
    public void before(){
        watterBottle = new WaterBottle();
    }

    @Test
    public void testDrink(){
        assertEquals(90, watterBottle.drink());

    }

    @Test
    public void testEmpty(){
        assertEquals(0, watterBottle.empty());
    }

    @Test
    public void testFill(){
        watterBottle.empty();
        assertEquals(100, watterBottle.fill());
    }

}
