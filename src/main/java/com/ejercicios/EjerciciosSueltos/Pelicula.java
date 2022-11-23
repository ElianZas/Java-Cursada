package com.objeto.sueltossintaxis;
/*2) Crear una clase pelucula que tenga titulo, directo, pais y año y un metodo que devuelva el turulo+director */

public class Pelicula
{
     private String titulo;
     private String director;
     private String pais;
     private int año;

     public Pelicula(){
        this.titulo = "Pinocho";
        this.director = "Robert Zemeckis";
        this.pais = "Francia";
        this.año = 1998;
     }
     public Pelicula(String paramtitulo, String paramdirector, String parampais, int paramaño){
        this.titulo = paramtitulo;
        this.director = paramdirector;
        this.pais = parampais;
        this.año = paramaño;
     }

    public int getAño() {
        return año;
    }
    public String getDirector() {
        return director;
    }
    public String getPais() {
        return pais;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String toString() {
        return "Titulo: "+titulo;
    }
}

class DemoPelicula{

    public static void main( String[] args )
    {
        Pelicula a =new Pelicula();
        Pelicula b =new Pelicula("Alicia", "Javier Hernandez", "Argentina", 1988);
        System.out.println(a.toString()); 
        System.out.println(b.toString()); 
}
}
