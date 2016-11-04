
import static org.junit.Assert.*;

import Treballadors.CostPersonal;
import Treballadors.DatosIncorrectos;
import Treballadors.Treballador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJUnit_Viejo {

    public TestJUnit_Viejo() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCostPersonal() throws DatosIncorrectos {
        Treballador treballadors[] = new Treballador[3];

        treballadors[0] = new Treballador(Treballador.DIRECTOR, -1000, 0);
        treballadors[1] = new Treballador(Treballador.SUBDIRECTOR, 2500, 7);
        treballadors[2] = new Treballador(Treballador.SUBDIRECTOR, 2300, 5);

        float costTotal = CostPersonal.CostDelPersonal(treballadors);
        assertEquals("Error!", 8500, costTotal, 0);
    }

}
