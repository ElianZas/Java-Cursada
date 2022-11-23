package com.objeto.sueltossintaxis;
/*4) Crear una clase PedirPrestamo con sus atributos numero_cuenta, titular, mora, valor_prestamo y cantidad_cuotas.
Tendra 3 metodos:
Deudor: Si la cuenta tiene mora, la consola debe devolver un mensaje que diga "PRESTAMO RECHAZADO" + numero_cuenta + titular.
Calcular: Si la cuenta no tiene mora, calcular el valor de las cuotas en base a la cantidad_cuotas y valor_prestamo*1.50 (se debera devolver el 50% mas del valor original del prestamo)
Depositar: se le acredita valor_prestamo a la cuenta, mostrar el deposito impactado en la cuenta */

public class PedirPrestamo {
    private long numero_cuenta;
    private String titular;
    private float mora;
    private float valor_prestamo;
    private int cantidad_cuotas;
    private float saldo_cuenta;
    public float porcentaje = 1.50f;
    public float moranueva;
    public float valor_cuota;


    public PedirPrestamo(){
        this.numero_cuenta = 1324567846127L;
        this.titular = "Gerardo";
        this.mora = 0;
        this.valor_prestamo = 60000;
        this.cantidad_cuotas = 3;
        this.saldo_cuenta = 10000;
        this.moranueva = 0;
        this.valor_cuota = 0;
    }
    public PedirPrestamo(long paramnumero_cuenta, String paramtitular, int paramora, int paramvalor_prestamo, int paramcantidad_cuotas, float paramsaldo_cuenta){
        this.numero_cuenta = paramnumero_cuenta;
        this.titular = paramtitular;
        this.mora = paramora;
        this.valor_prestamo = paramvalor_prestamo;
        this.cantidad_cuotas = paramcantidad_cuotas;
        this.saldo_cuenta = paramsaldo_cuenta;
    }
    void Deudor(){
        if (mora>0){
            System.out.println(" PRESTAMO RECHAZADO "+"Cuenta: "+numero_cuenta+" Titular: "+titular);
        }else {
            System.out.println("PRESTAMO ACEPTADO "+" Cuenta: "+numero_cuenta+" Titular: "+titular);
        }
    }
    void Calcular(){
        if (mora == 0){
            this.moranueva = valor_prestamo*porcentaje;
            this.valor_cuota = this.moranueva/cantidad_cuotas;
            System.out.println("Devolver: "+this.moranueva+" Valor cuota: "+this.valor_cuota);
        }
    }
    void Depositar(){
        if (mora == 0){
            this.saldo_cuenta= saldo_cuenta+valor_prestamo;
            System.out.println("SALDO+DEPOSITO: "+this.saldo_cuenta);
        }
    }
    public int getCantidad_cuotas() {
        return cantidad_cuotas;
    }
    public float getMora() {
        return mora;
    }
    public long getNumero_cuenta() {
        return numero_cuenta;
    }
    public float getPorcentaje() {
        return porcentaje;
    }
    public float getSaldo_cuenta() {
        return saldo_cuenta;
    }
    public String getTitular() {
        return titular;
    }
    public float getValor_prestamo() {
        return valor_prestamo;
    }
    public float getMoranueva() {
        return moranueva;
    }
    public float getValor_cuota() {
        return valor_cuota;
    }

    public void setCantidad_cuotas(int cantidad_cuotas) {
        this.cantidad_cuotas = cantidad_cuotas;
    }
    public void setMora(float mora) {
        this.mora = mora;
    }
    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
    public void setSaldo_cuenta(float saldo_cuenta) {
        this.saldo_cuenta = saldo_cuenta;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setValor_prestamo(float valor_prestamo) {
        this.valor_prestamo = valor_prestamo;
    }
    public void setMoranueva(float moranueva) {
        this.moranueva = moranueva;
    }
    public void setValor_cuota(float valor_cuota) {
        this.valor_cuota = valor_cuota;
    }
    public String toString(){
        return "Cuotas: "+cantidad_cuotas;
    }

}
class DemoPedirPrestamo{
    public static void main( String[] args )
{
    PedirPrestamo a =new PedirPrestamo();
    a.Deudor();
    System.out.println(a.toString());
    a.Calcular();
    a.Depositar();

}
}