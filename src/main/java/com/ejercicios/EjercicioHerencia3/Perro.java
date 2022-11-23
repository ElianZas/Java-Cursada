package com.objeto.herencia1;

/*Crear una clase Perro hija de animal que tenga los atributos raza, tamaño y domestico.
con un metodo Ladrar que devuelva un ladrido cuando exista un humano menor de edad y el perro no sea domestico. */

public class Perro extends Animales {
    private String raza;
    private String tamaño;
    private boolean domestico;

    public Perro() {
        super();
        this.raza = "Dálmata";
        this.tamaño = "Grande";
        this.domestico = false;
    }

    public Perro(String newraza, String newtamaño, boolean newdomestico, float newAltura, float newpeso, int newaños,boolean newvivo) {
        super(newAltura, newpeso, newaños, newvivo);
        this.raza = newraza;
        this.tamaño = newtamaño;
        this.domestico = newdomestico;
    }

    public boolean Respirar(){
        return this.vivo = false;
    }

    void Ladrar(boolean adulto) {
        if (domestico == false && adulto==false){
            System.out.println("LADRIDO");
    }else {
        System.out.println("---------");
    }
    }
    public String toString() {
        return "Raza: "+this.raza+" Tamaño: "+this.tamaño+" Domestico?: "+this.domestico+" Altura: "+this.Altura+" Peso: "+this.peso+" Años: "+this.años+" Vivo?: "+this.vivo+"\n";
    }
    
}

class DemoPerro {
    public static void main(String[] args) {
        Perro a = new Perro();
        Perro b = new Perro("Mestizo", "Mediano", false, 50, 25, 5, true);
        Humano a2 = new Humano();
        System.out.println(a.toString());        
        System.out.println(b.toString());
        a.Ladrar(a2.getadulto());
    }
}
