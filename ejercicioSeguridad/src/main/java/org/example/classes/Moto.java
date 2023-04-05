package org.example.classes;

public class Moto extends Vehiculo{
    private Integer cantEspejos;
    private boolean motoSegura;

    //constrctor
    public Moto(Integer cantEspejos, Integer velocidadPropia){
        super(velocidadPropia);//hereda atributo de la clase padre
        this.cantEspejos = cantEspejos;
        this.motoSegura = false;
    }
    public boolean esSegura(){
        //validar si una moto es segura
        return motoSegura;
    }
}
