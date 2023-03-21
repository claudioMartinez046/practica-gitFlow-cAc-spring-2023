package clases;

public class Tamagotchi {
    //atributos
    private String nombre;
    private Integer nivel;
    //TODO: cambniar el estado de String a Enum
    private String estado;
    private Integer tiempoEnMinutos;

    //constructor
    public Tamagotchi(){
        this.nivel = 0;
        this.tiempoEnMinutos = 0;
    }
    public Tamagotchi(String nombre){
        this.nombre = nombre;
    }
    //metodos

    public void comer(){
        switch (this.estado){
            case "hambrienta":
                this.estado = "contenta";
                break;
            case "contenta":
                this.nivel ++;
                break;
            case "aburrida":
                if (this.tiempoEnMinutos > 80){
                    this.estado = "contenta";
                }
                break;
            default:
                System.out.println("Estado desconocido");
                break;
        }
    }
    public void jugar(){
        if (this.puedeJugar()){
            switch (this.estado){
                case "contenta":
                    this.nivel += 2;//ej.this.nivel =this.nivel + 2
                    break;
                case "aburrida":
                    this.estado = "contenta";
                    break;
               default:
                    System.out.println("Estado desconocido");
                    break;
            }
        }
    }
    public boolean puedeJugar(){
        return this.estado.equals("hambrienta")? false : true;//forma ternaria
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        if (nivel < 0){
            this.nivel = 0;
        }
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(Integer tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }
}
