/*Crear una clase PuntosClub hija de ClubFutbol que tenga los atributos partidos ganados, partidos perdidos y partidos empatados.
Con un metodo Puntos que calcule los puntos en base a los partidos ganados = 3puntos, partidos perdidos = 0 puntos, partidos empatados = 1 punto.
Y un metodo que sea descenso que reciba como parametros el nombre del club y los puntos obtenidos y devuelva en pantalla nombre del club: descenso cuando puntos sea menores a 20. */
package com.objeto.herencia3;

public class PuntosClub extends ClubFutbol {
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;

    public PuntosClub(){
        super();
        this.partidosGanados = 1;
        this.partidosEmpatados = 2;
        this.partidosPerdidos = 1;
    }
    public PuntosClub(int newpartidosGanados, int newpartidosPerdidos, int newpartidosEmpatados,  String newubicacion, String newnombreClub, String newnombreEstadio, String newfechafundacion, String newcolores){
        super(newubicacion, newnombreClub, newnombreEstadio, newfechafundacion, newcolores);
        this.partidosGanados = newpartidosGanados;
        this.partidosPerdidos = newpartidosPerdidos;
        this.partidosEmpatados = newpartidosEmpatados;
    }
    @Override 
    public void NombreClub() {
        /*forma del método abstract, comportamiento*/
        System.out.println(nombreClub);
    }
    int Puntos(){
        return partidosGanados * 3+ partidosEmpatados *1+partidosPerdidos*0;
    }
    /*Un metodo que sea campeonn que reciba como parametros el nombre del club y los puntos obtenidos y devuelva en pantalla nombre del club: campeon cuando puntos sea mayor a 40. */
    void Campeon(String nombreClub, int puntosObtenidos){
        if (puntosObtenidos>40){
            System.out.println(nombreClub+"Campeón");
        }
    }
    void Descenso(String nombreClub, int puntosObtenidos){
        if (puntosObtenidos<20){
            System.out.println(nombreClub+"Descenso");
        }
    }
 }
