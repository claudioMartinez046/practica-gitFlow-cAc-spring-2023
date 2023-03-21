package clases;

public class Perro extends Animal { //extiende o hereda de animal

    public Perro() {
        this.tipo = "perro"; // ya se lo seteo desde el contructor
    }

    public Perro(String nombre, String raza, int edad, String color, String tipo) {
        super(nombre, raza, edad, color, tipo);
    }

    @Override
    public String moverse(){

        return "El perro empiza a correr";
    }
    //sobre carga de metodos: tener 2 metodos del mismo
    //nombre pero diferente firma.
    //un metodo o funcion se divide en dos partes
    //1. firma = va desdeel modificador de acceso hasta los parametros
    //2. Cuerpo = es lo que va entre llaves{....}

    public String moverse(int cantPatas){
        return "";
    }
}
