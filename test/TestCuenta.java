
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class TestCuenta {

    Cuenta cuenta;

    public TestCuenta() {
    }

    public static void setUpClass() {
    }

    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cuenta = new Cuenta("0001.0002.12.1234567890", "Fulano de Tal", 0);
    }

    public void tearDown() {
    }

    @Test
    public void testRetirar() {

        cuenta.retirar(500);
        assertEquals(cuenta.getSaldo(), -500);

    }

    @Test
    public void testIngresar() {

        cuenta.ingresar(500);
        assertEquals(cuenta.getSaldo(), 500);

    }

}
