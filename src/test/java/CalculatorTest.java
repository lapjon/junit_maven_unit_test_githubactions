import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Addition 4 + 6 = 10")
    public void testAddition1(){
        assertEquals(10, calculator.add(4, 6));

    }
    @Test
    @DisplayName("Test Addition 8 + 9 = 10")
    public void testAddition2(){
        assertEquals(17, calculator.add(8, 9));

    }

    @Test
    @DisplayName("Test Subtraction 10 - 6 = 4")
    public void testSubtraction1(){
        assertEquals(4, calculator.subtract(10,6));
    }

    @Test
    @DisplayName("Test Subtraction 36 - 14 = 22")
    public void testSubtraction2(){
        assertEquals(22, calculator.subtract(36,14));
    }

    @Test
    @DisplayName("Test 20 * 4 = 80")
    public void testMultiplication1(){
        assertEquals(80, calculator.multiply(20, 4));

    }
    @Test
    @DisplayName("Test 5 * 25 = 125")
    public void testMultiplication2(){
        assertEquals(125, calculator.multiply(5, 25));

    }

    @Test
    @DisplayName("Test 30 / 5 = 6")
    public void testDivision1(){
        assertEquals(6, calculator.divide(30, 5));
    }

    @Test
    @DisplayName("Test divide by Zero")
    public void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            double actual = calculator.divide(9,0);
        });
        assertEquals("Can't divide with 0", exception.getMessage());
    }


    @Test
    @DisplayName("Test Area of 25 meter circle")
    public void testGetArea() {
        assertEquals(1963.50, calculator.getArea(25));

    }

    @Test
    @DisplayName("Test Circumference of 20 meter circle")
    public void testGetCircumference() {
        assertEquals(125.66, calculator.getCircumference(20));

    }

}
