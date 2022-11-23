package com.objeto.herencia3;

class DemoClub{
    public static void main(String[] args){
        PuntosClub a2 = new PuntosClub();
        PuntosClub a3 = new PuntosClub (22, 1, 3,  "Av.Corrientes 123", "Club Cero", "Estadio CeroTres", "1/1/12", "Rojo y amarillo" );
        a2.Campeon(a2.getNombreClub(),  a2.Puntos());
        a2.Descenso(a2.getNombreClub(),   a2.Puntos());
        System.out.println(a2.Puntos());
        a3.Campeon(a3.getNombreClub(),a3.Puntos());
        a3.Descenso(a3.getNombreClub(),  a3.Puntos());
        System.out.println(a3.Puntos()+"\n");
        a2.NombreClub();
        a3.NombreClub();
        
    }
 }