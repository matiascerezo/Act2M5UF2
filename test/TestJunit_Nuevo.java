/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Herencias.Director;
import Herencias.Operario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sandra
 */
public class TestJunit_Nuevo {
    
    public TestJunit_Nuevo() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
        @Test
    public void calcularNominaOperari() {
        Operario o = new Operario("N", 2040F, 2F);
        assertEquals(2040F, o.getNomina(), 0);
        assertTrue(o.getNomina() == 2040F);
    }

    @Test
    public void calcularNominaDirectiu() {
        Director d = new Director("N", 2000F);
        assertEquals(2000F, d.getNomina(), 0);
        assertTrue(d.getNomina() == 2000F);
    }
}
