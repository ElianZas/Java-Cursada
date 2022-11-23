package com.objeto.sueltossintaxis;
/*Crear una clase libro que tenga título, autor, nro de ejemplares, y nro de ejemplares prestados con un Método prestamo, modifica los atributos correspondientes devuelve TRUE si se pudo hacer la operación y sino FALSE.  */

public class Libro
{
     String titulo;
     String autor;
     int Ejemplares;
     int EjemplaresPrestados;

     public Libro(){
        this.titulo = "El Principito";
        this.autor = "Antoine de Saint-Exupér";
        this.Ejemplares = 20;
        this.EjemplaresPrestados = 100; 
     }
     public Libro(String paramtitulo, String paramautor, int paramEjemplares, int paramEjemplaresPrestados){
        this.titulo=paramtitulo;
        this.autor=paramautor;
        this.Ejemplares=paramEjemplares;
        this.EjemplaresPrestados=paramEjemplaresPrestados;
     }
     int EjemplaresFinales(){
        return Ejemplares-EjemplaresPrestados;
    }

     boolean Prestamo(){
        if (EjemplaresFinales()>=1) {
            return true;
        } else {
            return false;
        }
    }
}

class DemoLibro{
    public static void main( String[] args ){
    Libro a = new Libro();
    System.out.println(a.Prestamo());
}
}

