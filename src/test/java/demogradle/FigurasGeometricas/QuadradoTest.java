package demogradle.FigurasGeometricas;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class QuadradoTest {



    @Test
    public void testSetLadoDoesNotAssignValueWhenLadoEqualsOrLessThanZero(){
        Quadrado classUnderTest = new Quadrado(-2); // instância de Quadrado
        Quadrado classUnderTest2 = new Quadrado(0);
        Assert.assertNotSame(classUnderTest.getLado(), -2 );
        Assert.assertNotSame(classUnderTest2.getLado(), 0 );
    }

    @Test
    public void testSetLadoThrowsExceptionWithCorrectMessage(){
        IllegalArgumentException exceptionMessage = assertThrows(
                IllegalArgumentException.class,
                () -> { throw new IllegalArgumentException("Erro: número menor ou igual a 0"); }
        );

        assertEquals("Erro: número menor ou igual a 0", exceptionMessage.getMessage());
    }

    @Test
    public void testCalcularArea(){
        Quadrado classUnderTest = new Quadrado(); // instância de Quadrado
        classUnderTest.setLado(5);
        int valorEsperado = 25;
        Assert.assertEquals(classUnderTest.calcularArea(), valorEsperado);
    }

    @Test
    @DisplayName("CalcularPerimetro retorna o valor correto")
    public void testCalcularPerimetro(){
        Quadrado classUnderTest = new Quadrado(); // instância de Quadrado
        classUnderTest.setLado(5);
        int valorEsperado = 20;
        Assert.assertEquals(classUnderTest.calcularPerimetro(), valorEsperado);
    }

}