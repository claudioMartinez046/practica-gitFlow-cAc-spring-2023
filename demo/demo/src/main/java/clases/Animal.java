package clases;

public class Animal {
    protected String nombre;
    protected String raza;
    protected int edad;
    protected  String color;
    protected String tipo;

    public Animal() {
    }

    public Animal(String nombre, String raza, int edad, String color, String tipo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.tipo = tipo;
    }

    //metodos
    public String moverse(){
     /*switch(this.tipo){
        case "Ave":
            return "El animal vuela";
         case "Mamifero":
             return  "El animal camina";
         case "reptil":
             return "El animal se arrastra";
         case "Pez":
             return "El animal nada";
        default:
            return "El animal se mueve";
    }*/
        return "El animal se mueve";
    }

         public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getRaza () {
            return raza;
        }

        public void setRaza (String raza){
            this.raza = raza;
        }

        public int getEdad () {
            return edad;
        }

        public void setEdad ( int edad){
            this.edad = edad;
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }

        public String getTipo () {
            return tipo;
        }

        public void setTipo (String tipo){
            this.tipo = tipo;
        }
    }
