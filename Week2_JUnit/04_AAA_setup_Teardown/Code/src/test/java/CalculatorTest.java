import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @After
    public void tearDown() {
        System.out.println("Test completed.");
    }

    @Test
    public void testAdd() {
        int a = 2, b = 3;
        int result = calculator.add(a, b);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 5);
        assertEquals(20, result);
    }
}
