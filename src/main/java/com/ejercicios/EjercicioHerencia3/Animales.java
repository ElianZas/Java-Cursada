package com.objeto.herencia1;

/*1) Crear una clase Animal que tenga los atributos Altura, peso, años,  vivo.
con un metodo Respirar que recibe como parametro un boolean y si es false, cambia el estado de vivo a false.*/

public abstract class Animales {
    protected float Altura;
    protected float peso;
    protected int años;
    protected boolean vivo;

    public Animales() {
        this.Altura = 1.40f;
        this.peso = 50f;
        this.años = 20;
        this.vivo = false;
    }

    public Animales(float newAltura, float newpeso, int newaños, boolean newvivomuerto) {
        this.Altura = newAltura;
        this.peso = newpeso;
        this.años = newaños;
        this.vivo= newvivomuerto;
    }

    public abstract boolean Respirar(); 

    public String toString(){
        return "Altura : "+this.Altura+" Años: "+this.años+" Peso: "+this.peso+" Vivo?: "+this.vivo+"\n";
    }



}

