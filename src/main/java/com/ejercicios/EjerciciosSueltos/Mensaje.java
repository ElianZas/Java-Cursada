package com.objeto.sueltossintaxis;

/*2) Crear una clase Mensaje con sus atributos contenidoMensaje, fecha, Receptor, emisor.
Trendra 2 metodos:
Editar: se podra editar el contenido del mensaje (solo acepta string).
enviar: devuelve por consola el mensaje con fecha y emisor.*/

public class Mensaje {
    private String mensaje;
    private String fecha;
    private String receptor;
    private String emisor;

    public Mensaje() {

        this.mensaje = "¡Hola! ¿Cómo estás?";
        this.fecha = "06/09/2022";
        this.receptor = "Fernanda";
        this.emisor = "Jorge";
    }

    public Mensaje(String paramensaje, String paramfecha, String paramreceptor, String paramemisor) {
        this.mensaje = paramensaje;
        this.fecha = paramfecha;
        this.receptor = paramreceptor;
        this.emisor = paramemisor;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    String Editar() {
        return this.mensaje = "mensajenuevo";
    }

    public String toString() {
        return " Emisor: " + emisor + " Fecha: " + fecha + " Mensaje: " + Editar();
    }
}

class demoMensaje {
    public static void main(String[] args) {
        Mensaje a = new Mensaje();
        System.out.println(a.toString());
        a.Editar();
    }
}
