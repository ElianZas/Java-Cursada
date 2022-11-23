package com.objeto.herenpoli;

class Auto extends Vehiculos/* HIJO *//* Herencia */ {
    private int puertas;
    private String marca;
    private boolean cerokm;
    private String fechaFabricacion;

    public Auto() {
        super();/* Trae el constructur inicial del padre y asigna los estados a atributos */
        this.puertas = 5;
        this.marca = "ford";
        this.cerokm = false;
        this.fechaFabricacion = "17/08/1990";
    }

    public Auto(int newPuerta, String newMarca, Boolean newCeroKM, String newFechaFabricacion, String newMotor,
            String newColor, int newpeso) {
        super(newMotor, newColor, newpeso);/* Trae el constructur inicial del padre y asigna los estados a atributos */
        this.puertas = newPuerta;
        this.marca = newMarca;
        this.cerokm = newCeroKM;
        this.fechaFabricacion = newFechaFabricacion;
    }

    @Override /*sindicara al compilador que se trata de un metodo que esta
    en la clase principal y se sobreescribirá en el momento.
    Se hereda de una clase super . Lo colocamos debajo del constructor*/
    public void patente() {
        /*forma del método abstract, comportamiento*/
        System.out.println("ABC 123");
    }

    private int kilometraje(boolean ceroKM) {
        if (ceroKM) {
            return 0;
        } else {
            return 10000;
        }
    }

    public void modelo() {
        System.out.println(kilometraje(cerokm));
    }

    public int getPuertas() {
        return puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setPuertas(int newPuertas) {
        this.puertas = newPuertas;
    }

    public void setMarca(String newMarca) {
        this.marca = newMarca;
    }

    public String toString() {
        return this.puertas + " " + this.marca + " " + this.cerokm + " " + this.fechaFabricacion
                + /* se aladen los nuevos atributos que se traen para que se muestre */" " + this.motor + " "
                + this.color + "/n " + this.peso;
    }
}

class DemoAuto {
    public static void main(String[] args) {
        Auto a = new Auto();
        Auto a2 = new Auto(3, "fiat", true, "20/05/2022", "1.6", "gris", 900);
        Vehiculos a3 = new Auto(4, "ferrari", false, "10/07/1980", "V6", "rojo", 7000); /*
                                                                                         * la asignacion se hace desde
                                                                                         * el padre
                                                                                         */
        System.out.println(a.toString());
        a.modelo();
        a.setPuertas(4);
        System.out.println(a.getPuertas());
        System.out.println(a2.getMarca());
        a2.setMarca("Mercedes");
        System.out.println(a2.toString());
        a2.modelo();
        System.out.println(a2.pesoNeto(10));
        System.out.println(a3.toString());
        a3.patente();
        
    }
}