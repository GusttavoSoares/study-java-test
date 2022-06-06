package demogradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{

    @Test
    public void testAppHasGretting(){
        App classUnderTest = new App(); // instância de app
        assertNotNull("app shoud have a greeting", classUnderTest.getGretting());  // verifica se a chamada classUnderTest.getGreeting() não está retornando nulo
    }
}
