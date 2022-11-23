package com.objeto.Integrador;
/*Crear una clase abstracta legislador que tenga los atributos nombre, apellido, edad y provincia.*/

public abstract class legislador {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String provincia;

    public legislador(){
        this.nombre = "Juan";
        this.apellido = "Pérez";
        this.edad = 35;
        this.provincia = "México";
    }

    public legislador(String newnombre,String newapellido, int newedad, String newprovincia){
        this.nombre = newnombre;
        this.apellido = newapellido;
        this.edad = newedad;
        this.provincia = newprovincia;
    }

    /*con dos metodo abstracto que sea asistencias y otro que sea asistenciaPorPartido. 
    Un metodo que sea asistencia por provincia que devuelva el nombre de la provincia y la cantidad de legisladores.*/
    public abstract int asistencias(int cantidadDiputados);
    public abstract  void asistenciaPorPartido(int cantidadDiputados);

    public void asistenciaPorProvincia(int cantidadlegisladores){
        System.out.println("Nombre Provincia: "+this.provincia+" Cantidad Legisladores: "+cantidadlegisladores);
    }

}
