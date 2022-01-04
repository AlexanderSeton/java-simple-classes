import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle testWaterBottle;

    @Before
    public void before() {
        testWaterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, testWaterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        testWaterBottle.drink();
        assertEquals(90, testWaterBottle.getVolume());
    }

    @Test
    public void canEmpty() {
        testWaterBottle.empty();
        assertEquals(0, testWaterBottle.getVolume());
    }

    @Test
    public void canFill() {
        testWaterBottle.fill();
        assertEquals(100, testWaterBottle.getVolume());
    }

}
