package clases;

public class Gato extends Animal {
    // constructor
    public  Gato(String nombre, String raza, int edad){
            super();//contructor de la clase padre, y si va con parametros se
                                        // lo pasa a la clase padre.hay que definirlo en la clase padre
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
    }

    public String ronroneo(){
        return "roarrr roarr";
    }
    @Override
    public String moverse() {
        return "El gato empieza a desplzarse";
    }
}
