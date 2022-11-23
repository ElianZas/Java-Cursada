package com.objeto.herencia2;

/*2) Crear una clase colectivo que tenga los atributos pasajeros, maxPasajeros, antiguedad.
con un metodo cargarPasajero que recibe como parametro cantidad de pasajeros y los suma a los pasajeros sin pasarse del maximo y si la antiguedad es menor a 20 años. Y un metodo fueraDeServicio que devuelva la frase "FUERA DE SERVICIO" cuando la antiguedad sea mayor a 20.*/

public class Colectivo {
    protected int pasajeros;
    protected int maxpasajeros;
    protected int antiguedad;

    public Colectivo(){
        this.antiguedad = 5;
        this.maxpasajeros= 50;
        this.pasajeros = 30;
    }
    public Colectivo(int newpasajeros, int newmaxpasajeros, int newantiguedad){
        this.antiguedad = newantiguedad;
        this.maxpasajeros = newmaxpasajeros;
        this.pasajeros = newpasajeros;
    }
    void cargarPasajero(int cantidadpasajeros){
        this.pasajeros += cantidadpasajeros;
        if (this.pasajeros <= maxpasajeros && antiguedad<20){
            System.out.println("Pasajeros nuevos: "+cantidadpasajeros);
        }else{
            System.out.println("Supera la cantidad de pasajeros soportada o supera los años de antigüedad");
        }
    }
    void fueraDeServicio(){
        if (this.antiguedad>20){
            System.out.println("FUERA DE SERVICIO");
        }
    }
    public  String toString(){
        return "\nAntigüedad: "+this.antiguedad+"\nCapacidad máxima: "+this.maxpasajeros+"\nPasajeros actuales: "+this.pasajeros;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}

class DemoColectivo{
    public static void main(String[] args) {
        Colectivo uno = new Colectivo();
        System.out.println(uno.toString());
        uno.cargarPasajero(20);
        Colectivo dos = new Colectivo(12, 35, 30);
        System.out.println(dos.toString());
        dos.cargarPasajero(26);


    }
}
