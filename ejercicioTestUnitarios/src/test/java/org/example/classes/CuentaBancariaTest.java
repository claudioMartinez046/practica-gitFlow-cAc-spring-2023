package org.example.classes;
//practica de test TDD se plica los test
//antes de las funcionalidades
//se plican los test primero, y luego se refactoriza

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CuentaBancariaTest {
    private CuentaBancaria cuenta;
    private Usuario titular;
    private Usuario titular2;
    private final double SALDO_AGREGADO = 500;
    @Before
    public void setUp(){
        titular = new Usuario();
        titular2 = new Usuario("Claudio", "Martinez");
        titular.setNombre("Carlos");
        titular.setApellido("Charly");
        cuenta = new CuentaBancaria(titular);// no se tiene q crear un nuevo usuario
                                                //se tiene que usar el mismo usuario instanciado
                                                //en el test, refactorizar el getusuario, para que devuleva algo puntual y no algo generico

    }

    @Test
    public void testGetUsuario(){
        Assert.assertEquals(titular, cuenta.getUsuario());
    }

    @Test
    public void testSetUsuario(){
        cuenta.setUsuario(titular2);
        Assert.assertEquals(titular2, cuenta.getUsuario());
    }
    @Test
    public void testSetSaldo(){
        cuenta.setSaldo(SALDO_AGREGADO);
        Assert.assertEquals(SALDO_AGREGADO, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testDepositar(){
        cuenta.depositar(500.0);
        Assert.assertEquals(500.0, cuenta.getSaldo(),0.01);
    }
    @Test(expected = IllegalArgumentException.class)//se aclara cuando se espera una exepcion
    public void testDepositarcantidadNegativa(){
        cuenta.depositar(-500);
    }



}
