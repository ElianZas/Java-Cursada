package com.objeto.herencia1;
class DemoAnimales {
    public static void main(String[] args) {
        Animales a =  new Humano();
        Animales b = new Perro();
        Animales c = new Vaca(); 
        System.out.println(a.Respirar());
        System.out.println(b.Respirar());
        System.out.println(c.Respirar());


    }
}