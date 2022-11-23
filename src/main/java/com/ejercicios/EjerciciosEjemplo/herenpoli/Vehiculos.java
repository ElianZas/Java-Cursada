package com.objeto.herenpoli;


public abstract/*clase abstracta */ class Vehiculos /*PADRE*/ {
    protected String motor;
    protected String color;
    protected int peso;

    public Vehiculos(){
        this.motor = "V8";
        this.color = "negro";
        this.peso = 1000;
    }
    public Vehiculos(String newMotor, String newColor, int newpeso){
        this.motor = newMotor;
        this.color = newColor;
        this.peso = newpeso;
    }
    public int pesoNeto(int pesoCarga/*PARAMETROS*/){
        return pesoCarga+peso;
    }
    public abstract void patente();/*son metodos a los cuales se les define su forma cuando se llaman a los hijos. Los hijos
    pueden hacer distintas cosas, la patente de un auto puede ser distinta a la de un barco, etc */
}
