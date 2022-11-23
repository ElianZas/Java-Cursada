package com.objeto.herencia2;


/*crear una clase LargaDistancia hija de colactivo que tenga los atributos empresa, internacional, tipoAsientos, kilometros.
Con un metodo controlPolicial que devuelva la leyenda "Control obligatorio" para los micros que tengan destino internacional.
Y un metodo valorPasaje que devuelva */

public class LargaDistancia extends Colectivo{
    private String empresa;
    private boolean internacional;
    private String tipoAsientos;
    private int kilometros;
    private int valorPasaje;

    public LargaDistancia(){
        super();
        this.empresa = "Pepito srl";
        this.internacional = true;
        this.tipoAsientos = "semi-cama";
        this.kilometros = 1200;
    }
    public LargaDistancia(String newempresa, boolean newinternacional, String newtipoAsientos, int newkilometros, int newpasajeros, int newmaxpasajeros, int newantiguedad){
        super(newpasajeros, newmaxpasajeros, newantiguedad);
        this.empresa = newempresa;
        this.internacional = newinternacional;
        this.tipoAsientos = newtipoAsientos;
        this.kilometros = newkilometros;
    }
    void controlPolicial(){
        if (internacional == true){
            System.out.println("Control Obligatorio");
        }
    }
    void valorPasaje(){
        if (internacional ==true && tipoAsientos == "cama" && kilometros> 1000){
             System.out.println("Valor del Pasaje: 12000");
        }
        if (internacional ==true && tipoAsientos == "semi-cama" && kilometros> 1000){
            System.out.println("Valor del Pasaje: 10000");
        }
        if (internacional ==true && tipoAsientos == "cama" && kilometros< 1000){
            System.out.println("Valor del Pasaje: 8000");
        }
        if (internacional ==true && tipoAsientos == "semi-cama" && kilometros< 1000){
            System.out.println("Valor del Pasaje: 7000");
        }
        if (internacional ==false && tipoAsientos == "semi-cama" && kilometros> 800){
            System.out.println("Valor del Pasaje: 5000");
        }
        if (internacional ==false && tipoAsientos == "común" && kilometros> 800){
            System.out.println("Valor del Pasaje: 4000");
        }
        if (internacional ==false && tipoAsientos == "semi-cama" && kilometros< 800){
             System.out.println("Valor del Pasaje: 3000");
        }
        if (internacional ==false && tipoAsientos == "común" && kilometros< 800){
            System.out.println("Valor del Pasaje: 3000");
        }
    }
    public int getValorPasaje() {
        return valorPasaje;
    }
    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
    public String toString(){
        return "\nEmpresa: "+this.empresa+" Internacional?: "+this.internacional+" Tipo: "+this.tipoAsientos+" Kilómetros: "+this.kilometros;
    }
    public String getEmpresa() {
        return empresa;
    }
    public int getKilometros() {
        return kilometros;
    }
    public String getTipoAsientos() {
        return tipoAsientos;
    }
}