/*crear una clase humano hija de animal que tenga los atributos colorOjos, nacionalidad, mayor de edad.
Con un metodo votar que ingrese el nombre de un candidato y si es mayor de edad tiene que devolver el nombre del candidato que eligio. */

package com.objeto.herencia1;

public class Humano extends Animales {
    private String colorojos;
    private String nacionalidad;
    private boolean adulto;

    public Humano() {
        super();/*Estados iniciales de Animales */
        this.colorojos = "Marrón";
        this.nacionalidad = "Argentino";
        this.adulto = true;
    }

    public Humano(String newcolorojos, String newnacionalidad, boolean newadulto, float newAltura, float newpeso, int newaños, boolean newvivo) {
        super(newAltura, newpeso, newaños, newvivo);
        this.adulto = newadulto;
        this.colorojos = newcolorojos;
        this.nacionalidad = newnacionalidad;
    }
    public boolean Respirar(){
        return this.vivo = true;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public boolean getadulto(){
        return adulto;
    }

    public String votar() {
        String newCandidato = "Pedro Gómez";
        if (this.adulto == true) {
            return newCandidato;
        } else {
            return "NO PUEDE VOTAR. ES MENOR";
        }

    }
    

    public String toString() {
        return "Color Ojos: " + this.colorojos + " Nacionalidad: " + this.nacionalidad + " " + this.adulto + " Altura: " + this.Altura + " Peso: " + this.peso+ " Edad: " + this.años + " Está vivo?:" + this.vivo + "\n"+votar()+"\n";
    }



}

class DemoHumano {
    public static void main(String[] args) {
        Humano a = new Humano();
        Humano b = new Humano("Azules", "Italiano", false, 1.68f, 58, 16, true);
        Animales a2 = new Humano("Verdes", "Argentino", true, 1.68f, 58, 20, true);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a2.toString());

    }
}
