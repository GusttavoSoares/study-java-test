package demogradle.FigurasGeometricas;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuadradoTest {

    //TODO: testar criação de um quadrado com valor de lado válido

    @ParameterizedTest
    @ValueSource(ints = { 0, -2 })
    public void testSetLadoDoesNotAssignValueWhenLadoEqualsOrLessThanZero(int lado) {

        assertThrows(IllegalArgumentException.class, () ->  new Quadrado(lado));
    }

    @Test
    public void testSetLadoThrowsExceptionWithCorrectMessage() {
        Quadrado classUnderTest = new Quadrado();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> classUnderTest.setLado(-2));

        assertEquals(Quadrado.ERROR_MESSAGE, exception.getMessage());
    }

    @Test
    public void testCalcularArea() {
        Quadrado quadrado = sampleQuadrado();


        int actual = quadrado.calcularArea();

        int expected = 25;
        assertEquals( expected, actual);
    }

    @Test
    public void testCalcularPerimetro() {
        Quadrado quadrado = sampleQuadrado();

        int actual = quadrado.calcularPerimetro();

        int expected = 20;
        assertEquals(expected, actual);
    }

    public static Quadrado sampleQuadrado(){
        return new Quadrado(5);
    }

}