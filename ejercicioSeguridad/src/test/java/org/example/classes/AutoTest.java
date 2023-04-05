package org.example.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AutoTest {

    private Auto auto;

    @Before
    public void setUp(){
        auto = new Auto(true, 100);
    }

    @Test
    public void testQuePruebaQuePuedoCrearUnAuto(){
        Assert.assertNotNull(auto);
    }

}
