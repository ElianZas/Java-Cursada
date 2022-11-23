package com.objeto.herencia1;
public class Vaca extends Animales {
    private String raza;
    private boolean vacalechera;
    private boolean ganado;

    public Vaca() {
        super();
        this.raza = "bovine";
        this.vacalechera = true;
        this.ganado = true;
    }

    public Vaca(String newraza, boolean newvacalechera, boolean newganado, float newAltura, float newpeso,
            int newaños, boolean newvivo) {
        super(newAltura, newpeso, newaños, newvivo);
        this.raza = newraza;
        this.vacalechera = newvacalechera;
        this.ganado = newganado;
    }

    public boolean Respirar(){
        return this.vivo = true;
    }

    void Ordeñar(String nacionalidad) {
        if (this.vacalechera == true && this.ganado == true && nacionalidad == "Argentino") {
            System.out.println("20 Litros");
        }
    }
    public String toString(){
        return "Raza: "+raza+" Vaca lechera?: "+" Pertenece a un ganado?: "+ganado;
    }
}

class DemoVaca {
    public static void main(String[] args) {
        Vaca a = new Vaca();
        Humano a2 = new Humano();
        System.out.println(a.toString());
        a.Ordeñar(a2.getNacionalidad());
        Vaca b2 = new Vaca("No bovina", false, false, 50, 40, 10, true);
        Humano b = new Humano("Azules", "Argentino", false, 1.68f, 58, 16, true);
        System.out.println(b2.toString());
        a.Ordeñar(b.getNacionalidad());




    }
}
