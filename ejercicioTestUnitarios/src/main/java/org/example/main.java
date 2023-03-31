package org.example;

import org.example.classes.Usuario;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to" );
        Usuario u = new Usuario();
        u.setNombre("jose");
        u.setApellido("bolainas");
        System.out.println(u.toString());

        String dias[] = new String[7];

        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miercoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sabado";
        // recorrer el array forma tradicional
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        System.out.println("los dias de la semana son " + dias.length);

    }
}
