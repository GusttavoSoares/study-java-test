package demogradle.FigurasGeometricas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RetanguloTest {

    //TODO: testar criação de um retangulo com valor de base e altura válidos
    @Test
    public void testConstructorDoesNotAssignValueWhenLadoEqualsOrLessThanZero() {

        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-2, 5));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(5, -2));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(5, -0));

    }

    @Test
    public void testSetAlturaThrowsExceptionWithCorrectMessage() {
        Retangulo classUnderTest = new Retangulo();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> classUnderTest.setAltura(-1));

        assertEquals("Erro: número menor ou igual a 0", exception.getMessage());
    }

    @Test
    public void testSetBaseThrowsExceptionWithCorrectMessage() {
        Retangulo classUnderTest = new Retangulo();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> classUnderTest.setBase(-1));

        assertEquals("Erro: número menor ou igual a 0", exception.getMessage());
    }

    @Test
    public void testCalcularArea() {
        Retangulo classUnderTest = new Retangulo(4, 8);
        int valorEsperado = 32;
        assertEquals(classUnderTest.calcularArea(), valorEsperado);
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo classUnderTest = new Retangulo(4, 8);
        int valorEsperado = 24;
        assertEquals(classUnderTest.calcularPerimetro(), valorEsperado);
    }

}
