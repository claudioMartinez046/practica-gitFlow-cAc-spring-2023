package org.example.classes;

public class CuentaBancaria {
    private Usuario titular;
    private double saldo;

    public CuentaBancaria(Usuario usuario){
        titular = usuario;
    }
    public void depositar(double saldoADepositar){
        if (saldoADepositar <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero");//throw captura errores para no romper el programa y continue
        }
        saldo += saldoADepositar; // saldo=saldo+saldoADepositar
    }
    public Usuario getUsuario() {
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setUsuario(Usuario titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
