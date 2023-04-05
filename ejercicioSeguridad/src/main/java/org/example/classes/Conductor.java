package org.example.classes;

public class Conductor {
    private String nombre;
    private String apellido;
    private Integer dni;
    //private Licencia licencia
    private boolean varEsSeguro;


    public Conductor(){}
    public Conductor(String nombre, String apellido, boolean varEsSeguro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.varEsSeguro = varEsSeguro;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean esSeguro(){
        return varEsSeguro;
    }
}
