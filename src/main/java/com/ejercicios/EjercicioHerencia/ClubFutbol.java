/*3) Crear una clase ClubFutbol que tenga los atributos ubicacion, nombre del club, nombre del estadio, fecha de fundacion y colores.
con un metodo camisetaAlternativa que reciba por parametro corolesAlternativos y cambie el estado de colores por los colores alternativos. Y un metodo capacidadEstadio que reciba un parametro de capacidad y devuelva la capacidad mas el nombre del estadio. */

package com.objeto.herencia3;

public abstract class ClubFutbol {
    protected String ubicacion;
    protected String nombreClub;
    protected String nombreEstadio;
    protected String fechafundación;
    protected String colores;

    public ClubFutbol(){
        this.ubicacion = "Av.Coronel Díaz 1234";
        this.nombreClub =  "Club Díaz ";
        this.nombreEstadio = "Estadio D";
        this.fechafundación = "11/10/1988";
        this.colores = "Azul y blanco";
    }
    public ClubFutbol(String newubicacion, String newnombreClub, String newnombreEstadio, String newfechafundacion, String newcolores){
        this.ubicacion = newubicacion;
        this.nombreClub = newnombreClub;
        this.nombreEstadio = newnombreClub;
        this.fechafundación = newfechafundacion;
        this.colores = newcolores;
    }

    String camisetaAlternativa(String coloresAlternativos){
        return this.colores = coloresAlternativos;
    }
    void CapacidadEstadio(int capacidad){
        System.out.println(capacidad+nombreEstadio);
    }
    public abstract void NombreClub();

    public String getNombreClub() {
        return this.nombreClub;
    }
    
}
