import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3));
        assertEquals(-1, calc.suma(-2, 1));
        assertEquals(0, calc.suma(0, 0));
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.resta(5, 3));
        assertEquals(-5, calc.resta(-2, 3));
        assertEquals(0, calc.resta(5, 5));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicacion(2, 3));
        assertEquals(-6, calc.multiplicacion(2, -3));
        assertEquals(0, calc.multiplicacion(5, 0));
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.division(6, 3));
        assertEquals(-2, calc.division(6, -3));
        assertEquals(0, calc.division(0, 5));
        assertThrows(ArithmeticException.class, () -> calc.division(5, 0));
    }
}

