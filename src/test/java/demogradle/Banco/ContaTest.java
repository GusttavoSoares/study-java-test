package demogradle.Banco;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    public void testSetCodigoDoesNotAssignValueWhenCodigoEqualsOrLessThanZero() {
        Conta classUnderTest = new Conta();

        assertThrows(IllegalArgumentException.class, () -> classUnderTest.setCodigo(-1));
        assertThrows(IllegalArgumentException.class, () -> {
            classUnderTest.setCodigo(0);
        });
    }

    @Test
    public void testSetCodigoThrowsExceptionWithCorrectMessage() {
        Conta classUnderTest = new Conta();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> classUnderTest.setCodigo(-1));
        assertEquals("Erro: número menor ou igual a 0", exception.getMessage());
    }

    @Test
    public void testSetLimiteDoesNotAssignValueWhenLimiteEqualsOrLessThanZero() {
        Conta classUnderTest = new Conta();

        assertThrows(IllegalArgumentException.class, () -> classUnderTest.setLimite(0));
        assertThrows(IllegalArgumentException.class, () -> classUnderTest.setLimite(-1));
    }

    @Test
    public void testSetLimiteAssignsCorrectValue() {
        Conta classUnderTest = new Conta();

        classUnderTest.setLimite(100.0);
        assertEquals(100.0, classUnderTest.getLimite(), 0);
    }

    @Test
    public void testSetLimiteThrowsExceptionWithCorrectMessage() {
        Conta classUnderTest = new Conta();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> classUnderTest.setLimite(-1));
        assertEquals("Erro: número menor ou igual a 0", exception.getMessage());
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> classUnderTest.setLimite(-1));
        assertEquals("Erro: número menor ou igual a 0", exception2.getMessage());
    }

    @Test
    public void testDepositarReturnsFalseWhenValorLessThanZero() {
        Conta classUnderTest = new Conta();

        assertFalse(classUnderTest.depositar(-100));
    }

    @Test
    public void testDepositarAssignSaldoValue() {
        Conta classUnderTest = new Conta();

        classUnderTest.depositar(100);
        assertEquals(100, classUnderTest.getSaldo(), 0);
    }

    @Test
    public void testSacarReturnsFalseWhenValorIsBiggerThanSaldoOrValorisBiggerThanZero() {
        Conta classUnderTest = new Conta();

        classUnderTest.depositar(100);
        assertFalse(classUnderTest.sacar(101));
        assertFalse(classUnderTest.sacar(0));
        assertFalse(classUnderTest.sacar(-1));
    }

    @Test
    public void testTransferirReturnsFalseWhenValorEqualsOrLessThanSaldoPlusLimiteOrValorEqualsAndLessThanZero() {
        Conta classUnderTest = new Conta();
        Conta classUnderTest2 = new Conta();

        classUnderTest.depositar(100);
        assertFalse(classUnderTest.transferir(classUnderTest2, 101));
        assertFalse(classUnderTest.transferir(classUnderTest2, 0));
        assertFalse(classUnderTest.transferir(classUnderTest2, -1));

    }

    @Test
    public void testTransferirRemoveContaSaldoWhenSuccess() {
        Conta classUnderTest = new Conta();
        Conta classUnderTest2 = new Conta();

        classUnderTest.depositar(100);
        classUnderTest.transferir(classUnderTest2, 100);
        assertEquals(0, classUnderTest.getSaldo(), 0);
    }

    @Test
    public void testTransferirAssignsValorWhenSuccess() {
        Conta classUnderTest = new Conta();
        Conta classUnderTest2 = new Conta();

        classUnderTest.depositar(100);
        classUnderTest.transferir(classUnderTest2, 100);
        assertEquals(100, classUnderTest2.getSaldo(), 0);
    }

    @Test
    public void testTransferirAssignsValorPlusSaldoWhenSuccess() {
        Conta classUnderTest = new Conta();
        Conta classUnderTest2 = new Conta();

        classUnderTest.depositar(100);
        classUnderTest2.depositar(200);
        classUnderTest.transferir(classUnderTest2, 100);
        assertEquals(300, classUnderTest2.getSaldo(), 0);
    }
}