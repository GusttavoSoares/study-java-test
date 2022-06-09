package demogradle.FigurasGeometricas;

import org.junit.Assert;
import org.junit.Test;


public class RetanguloTest {

    @Test
    public void testConstructorDoesNotAssignValueWhenLadoEqualsOrLessThanZero() {

        Assert.assertThrows(IllegalArgumentException.class, () -> new Retangulo(-2, 5));
        Assert.assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 5));
        Assert.assertThrows(IllegalArgumentException.class, () -> new Retangulo(5, -2));
        Assert.assertThrows(IllegalArgumentException.class, () -> new Retangulo(5, -0));

    }

    @Test
    public void testSetAlturaThrowsExceptionWithCorrectMessage() {
        Retangulo classUnderTest = new Retangulo();
        Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> classUnderTest.setAltura(-1));

        Assert.assertEquals("Erro: número menor ou igual a 0", exception.getMessage());
    }

    @Test
    public void testSetBaseThrowsExceptionWithCorrectMessage() {
        Retangulo classUnderTest = new Retangulo();
        Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> classUnderTest.setBase(-1));

        Assert.assertEquals("Erro: número menor ou igual a 0", exception.getMessage());
    }

    @Test
    public void testCalcularArea() {
        Retangulo classUnderTest = new Retangulo(4, 8);
        int valorEsperado = 32;
        Assert.assertEquals(classUnderTest.calcularArea(), valorEsperado);
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo classUnderTest = new Retangulo(4, 8);
        int valorEsperado = 24;
        Assert.assertEquals(classUnderTest.calcularPerimetro(), valorEsperado);
    }

}
