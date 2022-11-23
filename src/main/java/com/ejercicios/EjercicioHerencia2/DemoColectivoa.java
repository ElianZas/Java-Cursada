package com.objeto.herencia2;

class DemoColectivoa{
    public static void main(String[] args) {
        Colectivo uno = new Colectivo();
        System.out.println(uno.toString());
        uno.cargarPasajero(20);
        Colectivo dos = new Colectivo(12, 35, 30);
        System.out.println(dos.toString());
        dos.cargarPasajero(26);
    }
}