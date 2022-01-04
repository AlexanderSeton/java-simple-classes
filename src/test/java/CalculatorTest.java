import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator();
    }

    @Test
    public void canAdd() {
        int output = testCalculator.add(5, 10);
        assertEquals(15, output);
    }

    @Test
    public void canSubtract() {
        int output = testCalculator.subtract(5, 10);
        assertEquals(-5, output);
    }

    @Test
    public void canMultiply() {
        int output = testCalculator.multiply(500, 2);
        assertEquals(1000, output);
    }

    @Test
    public void canDivide() {
        double output = testCalculator.divide(10.0, 3.3);
        assertEquals(3.03, output, 0.01);
    }

}
