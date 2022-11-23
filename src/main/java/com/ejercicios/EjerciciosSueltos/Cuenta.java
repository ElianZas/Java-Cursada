package com.objeto.sueltossintaxis;

/*1) Crear una clase Cuenta, sus atributos van a ser titular, CBU , saldo.
Tendrá 2 métodos:
depositar: agrega un valor al saldo (si es una cantidad negativa no hace nada).
retirar: se resta un valor al saldo, (se comprueba que la cantidad a retirar no sea mayor a la disponible).*/
public class Cuenta{
    public String titular;
    private Long CBU;
    private int saldo;
    private int depositasaldo;
    private int retirasaldo;

    public Cuenta(){
        this.titular =  "Fernando Perez";
        this.CBU = 1241234567894568752L;
        this.saldo = 100000;
        this.depositasaldo = 30000;
        this.retirasaldo = 50000;
    }   
    public Cuenta(String paramtitular, Long paramCBU, int paramsaldo, int paramdepositasaldo, int paramretirasaldo){
        this.titular =  paramtitular;
        this.CBU = paramCBU;
        this.saldo = paramsaldo;
        this.depositasaldo=paramdepositasaldo;
        this.retirasaldo=paramretirasaldo;

    }
    
    void saldodepositado(){
        if (saldo>=0){
            this.saldo = saldo+depositasaldo;
            System.out.print(" Con depósito: "+this.saldo);
         }
    }
    void saldoretirado(){
        if (retirasaldo<=saldo){
            this.saldo = saldo-retirasaldo;
            System.out.print(" Con retiro: "+this.saldo);
        }else{
            System.out.print(" NO ES POSIBLE RETIRAR. El saldo es: "+this.saldo);
        }
    }
    public Long getCBU() {
        return CBU;
    }
    public int getDepositasaldo() {
        return depositasaldo;
    }
    public int getRetirasaldo() {
        return retirasaldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setCBU(Long cBU) {
        CBU = cBU;
    }
    public void setDepositasaldo(int depositasaldo) {
        this.depositasaldo = depositasaldo;
    }
    public void setRetirasaldo(int retirasaldo) {
        this.retirasaldo = retirasaldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String toString() {
        return "\nTitular: "+titular;
    }
}

class demoCuenta{
    public static void main( String[] args ){
    Cuenta a = new Cuenta();
    Cuenta b = new Cuenta("Ramón Hernández", 4564613987456456751L,50000,3000,70000);
    System.out.print(" " +a.toString());
    a.saldodepositado();
    a.saldoretirado();
    System.out.print(" " +b.toString());
    b.saldodepositado();
    b.saldoretirado();

}
}
