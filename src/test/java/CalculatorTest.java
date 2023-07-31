import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(6, 3);
        assertEquals(2.0, result, 0.01);
    }
}

