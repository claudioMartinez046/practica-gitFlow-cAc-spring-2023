package clases;

public class Pez extends Animal{

    int cantEscamas;

    public Pez(int cantEscamas){
        this.cantEscamas = cantEscamas;
    }

    public int getCantEscamas() {
        return cantEscamas;
    }

    public void setCantEscamas(int cantEscamas) {
        this.cantEscamas = cantEscamas;
    }
}
