import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void sum() {
        int a = 5, b = 8, expected = 13;
        Assertions.assertEquals(expected, Calculator.sum(a, b));
    }

    @Test
    void div() {
        int a = 40, b = 6, expected = 7;
        Assertions.assertEquals(expected, Calculator.div(a, b));
    }

    @Test
    void mult() {
        int a = 5, b = 8, expected = 40;
        Assertions.assertEquals(expected, Calculator.mult(a, b));
    }

    @Test
    void mod() {
        int a = 5, b = 8, expected = 5;
        Assertions.assertEquals(expected, Calculator.mod(a, b));
    }
}
