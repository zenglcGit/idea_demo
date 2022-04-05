import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '+');
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturn0When1Sub1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '-');
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

}