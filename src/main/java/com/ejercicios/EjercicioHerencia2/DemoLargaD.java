package com.objeto.herencia2;
class LargaD{
    public static void main(String[] args) {
        LargaDistancia c = new LargaDistancia ();
        LargaDistancia d = new LargaDistancia("Verdes srl", false, "cama", 400, 10,30,50);
        System.out.println(c.toString());
        c.valorPasaje();
        c.controlPolicial();
        System.out.println(d.toString());
        d.valorPasaje();
        d.controlPolicial();
        d.fueraDeServicio();
        d.cargarPasajero(20);
    }
}
