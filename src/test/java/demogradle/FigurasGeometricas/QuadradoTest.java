package demogradle.FigurasGeometricas;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class QuadradoTest {



    @Test
    @DisplayName("SetLado  não atribui valor quando o lado é igual ou menor que zero")
    public void setLado_Nao_Atribui_Valor_Quando_Lado_E_Iguai_Ou_Menor_Que_Zero(){
        Quadrado classUnderTest = new Quadrado(-2); // instância de Quadrado
        Quadrado classUnderTest2 = new Quadrado(0);
        Assert.assertNotSame(classUnderTest.getLado(), -2 );
        Assert.assertNotSame(classUnderTest2.getLado(), 0 );
    }

    @Test
    @DisplayName("SetLado lança exceção com a mensagem correta quando lado é igual ou menor que zero")
    public void testSetLadoThrowsExceptionWithCorrectMessage(){
        IllegalArgumentException exceptionMessage = assertThrows(
                IllegalArgumentException.class,
                () -> { throw new IllegalArgumentException("Erro: número menor ou igual a 0"); }
        );

        assertEquals("Erro: número menor ou igual a 0", exceptionMessage.getMessage());
    }

    @Test
    @DisplayName("CalcularArea retorna o valor correto")
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