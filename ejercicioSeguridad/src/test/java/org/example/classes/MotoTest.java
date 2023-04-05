package org.example.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MotoTest {
    private Moto moto;

    @Before
    public void setUp(){
         moto = new Moto(2, 120);
    }

    @Test
    public void testQuePruebaQuePuedoCrearUnaMoto(){
        Assert.assertNotNull(moto);
    }
    @Test
    public void testQuePruebaSiUnaMotoEsSegura(){
        Assert.assertTrue(moto.esSegura());
    }
}
