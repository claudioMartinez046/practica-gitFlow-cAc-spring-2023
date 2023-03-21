package clases;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        /*System.out.println(5 +5 );
        //como intanciar una clase
        Persona ruben = new Persona();
        //construimos un objeto con valores inciales
        Persona maria = new Persona("Maria","jose",23,234567765);
        System.out.println(maria.getNombre() + " tiene " + maria.getEdad() + " años ");
        //le modificamos la edad a maria
        maria.setEdad(25);
        System.out.println(maria.getNombre() + " tiene " + maria.getEdad() + " años ");
        //le pasamos los valores al objeto ruben
        ruben.setNombre("Ruben");
        ruben.saludar();
        //generamos animales
        Animal perro1 = new Animal();
        perro1.setTipo("perro");
        Perro perro2 = new Perro("lolo", "dogo", 12, "marron", "perro");
        Gato gato1 = new Gato("michi", "mestiza",4);
        Pez pez1 =new Pez(20);
        pez1.setNombre("pipi");

        //polimorfismo = ejecutar ese mismo metodo de distintas formas
        System.out.println(perro2.moverse());
        System.out.println(gato1.moverse());
        System.out.println(pez1.getNombre());
        System.out.println(pez1.moverse());
        System.out.println(pez1.getCantEscamas());
        */
        //tamagotchi

        Tamagotchi tama1 =new Tamagotchi();

        tama1.setNombre("cacho");
        tama1.setEstado("hambrienta");
        //consulta estado de tama1
        System.out.println(tama1.getNombre() + " esta " + tama1.getEstado());
        // le damos de comer
        tama1.comer();
        //consulta estado de tama1 despues de comer
        System.out.println("despues de comer el estado de " +tama1.getNombre()+ " es " + tama1.getEstado());


    }

}
