package clases;

import java.util.Date;

public class Persona {
    //caracteristica o propiedades
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    // contante en JAVA palabra "final"
    // hay que darle un dato obligado final Date fechaNacimiento = new Date(Date.parse("1981-07-01"));

    //constructor con valores inicales
    public Persona(String nombre,String apellido,int edad,int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
    public Persona(){}//constructor por defecto lo crea el mismo ide
    //comportamientos- - metodos
    public void saludar(){
        System.out.println("hola soy " + nombre+" "+ apellido);
    }
    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
