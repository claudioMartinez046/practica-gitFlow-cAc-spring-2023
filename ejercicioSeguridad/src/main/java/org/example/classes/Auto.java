package org.example.classes;

public class Auto extends Vehiculo{
    private boolean tieneruedaAux;

    public Auto(boolean tieneruedaAux, Integer velocidadPropia){
        super(velocidadPropia);
        this.tieneruedaAux = tieneruedaAux;
    }
}
