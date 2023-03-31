package org.example.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
    private Usuario usuario1;

    @Before
    public void setUp() {
        usuario1 = new Usuario("Juan","Cachila");
    }
    @Test
    public void testDeGetNombre(){
        Assert.assertEquals("Juan",usuario1.getNombre());
    }
    @Test
    public void testDeGetApellido(){
        Assert.assertEquals("Cachila",usuario1.getApellido());
    }
    @Test
    public void testElToString(){
        Assert.assertEquals("Usuario{nombre='Juan', apellido='Cachila'}", usuario1.toString());
    }
}
