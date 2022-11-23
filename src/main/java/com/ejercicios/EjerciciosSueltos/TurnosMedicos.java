package com.objeto.sueltossintaxis;
/* 5) Crear una clase TurnosMedicos con sus atributos fecha, hora, profesional y lugar
Tendra 3 metodos:
Cancelar: muestra en consola "TURNO CANCELADO: "+todos los datos del turno
Cambiar: se ingresa por parametro la nueva fecha y hora del turno y se cambia los estados de los atributos correspondientes
Confirmar: muestra en consola "TURNO CONFIRMADO: "+todos los datos del turno. */
public class TurnosMedicos {
    private String fecha;
    private String hora;
    private String profesional;
    private String lugar;
    
    public TurnosMedicos(){
        this.fecha = "10/08/2022"; 
        this.hora = "8 am";
        this.profesional = "Eduardo López";
        this.lugar = "Sucursal Microcentro";
    }
    public TurnosMedicos(String paramfecha, String paramhora, String paramprofesional, String paramlugar){
        this.fecha = paramfecha;
        this.hora = paramhora;
        this.profesional = paramprofesional;
        this.lugar = paramlugar;
    }
    void cancelar(){
        System.out.println("TURNO CANCELADO: "+" Fecha: "+fecha+" Hora: "+hora+" Profesional: "+profesional+" Lugar: "+lugar);
    }
    void cambiar(String newfecha, String newhora){
        this.fecha = newfecha;
        this.hora = newhora;
        System.out.println("TURNO CAMBIADO: "+" Fecha: "+fecha+" Hora: "+hora+" Profesional: "+profesional+" Lugar: "+lugar);

    }
    void confirmar(){
        System.out.println("TURNO CONFIRMADO: "+" Fecha: "+fecha+" Hora: "+hora+" Profesional: "+profesional+" Lugar: "+lugar);
    }

}
class demoTurnosMedicos{
    public static void main( String[] args )
    {
    TurnosMedicos a = new TurnosMedicos();
    a.cancelar();
    a.cambiar("30/09/2022","6 pm");
    a.confirmar();

}
}
