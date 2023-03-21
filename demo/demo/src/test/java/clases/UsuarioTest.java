package clases;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
    //aplicamos metodologia TDD:Primero creamos los casos/prueba
    //antes de crear la funcionalidad o el codigo original
    @Test
    public void testQuePruebaQuePuedoCrearUnUsuario(){
        Usuario user = new Usuario();
        Assert.assertNotNull(user);
    }

    @Test
    public void testQuePruebaQueElUsuarioTieneNombre(){
        //pasos para crear un test
        //1) definimos los datos necesarios para el test
        //obgeto creado
        Usuario user = new Usuario();

        //2) ejecutamos la prueba
        user.setNombre("Homero");

        //3)validamos que la prueba obtenga el resultado esperado
        Assert.assertEquals("Homero",user.getNombre());
    }
}
