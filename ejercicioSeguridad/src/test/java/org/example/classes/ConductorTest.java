package org.example.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConductorTest {
    private Conductor conductor;
    @Before
    public void setUp(){
        conductor = new Conductor("Cristian","Jose", true);
    }

    /*@Test
    public void testBuiltConductor(){

        Assert.assertNotNull(conductor);
    }*/
    @Test
    public void testGetNombreDelConductor(){

        Assert.assertEquals("Cristian", conductor.getNombre());
    }
    @Test
    public void testSetNuevoNombreaUnConductor(){
        conductor.setNombre("Carlos");
        Assert.assertEquals("Carlos", conductor.getNombre());
    }
    @Test
    public void testQuePruebaQueUnConductorEsSeguro(){
        Boolean conductorSeguro = conductor.esSeguro();
        Assert.assertTrue(conductorSeguro);
    }
}
