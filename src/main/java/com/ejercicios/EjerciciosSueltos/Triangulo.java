package com.objeto.sueltossintaxis;

/*1)Crear una clase triángulo que tenga 3 lados y un metoo que saque el perimetro */

public class Triangulo
{
    private String tipo;
    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulo(){
        this.tipo = "Equilátero";
        this.lado1 = 3;
        this.lado2 = 3;
        this.lado3 = 3;
    }

    public Triangulo(String paramTipo, int paramLado1, int paramLado2, int paramLado3){

        this.tipo = paramTipo;
        this.lado1 = paramLado1;
        this.lado2 = paramLado2;
        this.lado3 = paramLado3;
    }
    public String getTipo(){
        return tipo; 
    }
    public int getLado1(){
        return lado1;
    }
    public int getLado2(){
        return lado2;
    }
    public int getLado3(){
        return lado3;
    }
    public void setTipo(String newTipos){
        this.tipo = newTipos;
    }
    public void setLado1(int newLados1){
        this.lado1 = newLados1;
    }
    public void setLado2(int newLados2){
        this.lado2 = newLados2;
    }
    public void setLado3(int newLados3){
        this.lado3 = newLados3;
    }

    public int Perimetro(){
         return lado1+lado2+lado3;
    }  
    public String toString(){
        return " "+tipo+" "+lado1+" "+lado2+" "+lado3;
    }

}

class DemoTriangulo{
        public static void main( String[] args )
    {
        Triangulo a =new Triangulo();
        System.out.println(a.toString());
}
}
