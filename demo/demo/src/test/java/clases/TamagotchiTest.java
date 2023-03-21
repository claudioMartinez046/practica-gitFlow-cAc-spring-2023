package clases;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {
    Tamagotchi masco1;
    /*void setUp(){
        //Tamagotchi masco1 = new Tamagotchi(); forma q originalmente va,siempre siempre dentro del mismo scope
        masco1 = new Tamagotchi();// opcional
    }*/
    @Test
    public void testDePruebaQuePuedoCreaUnTamaConNombre(){
        Tamagotchi masco2 = new Tamagotchi("tama");//por lo general se crea todo en el mismo ambito

        Assert.assertEquals(masco2.getNombre(), "tama");
    }

    @Test
    public void testQuePruebaQueAlComerEstadoHambrientoCambiaElEstadoAContenta(){
        Tamagotchi masco1 = new Tamagotchi();
        masco1.setNombre("Tama1");
        masco1.setEstado("hambrienta");
        masco1.comer();
        Assert.assertEquals(masco1.getEstado(),"contenta");

    }
}
