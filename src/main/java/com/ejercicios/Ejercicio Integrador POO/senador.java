package com.objeto.Integrador;

/*Crear una clase Senador  que herede de Legislador e implemente la interfaz votacion y tenga los atributos partido politico, ausente, presidente y voto.*/

class senador extends legislador implements votación{
    private String partidoPolitico;
    private boolean ausente;
    private boolean presidente;
    private String voto;

    public senador(){
        this.partidoPolitico = "Azul";
        this.ausente = false;
        this.presidente = true;
        this.voto= "positivo";
    }
    public senador(String newpartidoPolitico, boolean newausente, boolean newpresidente, String newvoto,String newnombre, String newapellido, int newedad, String newprovincia){
        super(newnombre, newapellido, newedad, newprovincia);
        this.partidoPolitico = newpartidoPolitico;
        this.ausente = newausente;
        this.presidente = newpresidente;
        this.voto=newvoto;
    }
    /*se ingrese la cantidad de senadores por parametros y devuelva la cantidad de senadores +1 si ausente = false.*/
    @Override
    public int asistencias(int cantidadSenadores) {
        if (this.ausente == true){
        cantidadSenadores+=1;
          return cantidadSenadores;
        }else {
            return 0;
        }
        }
    @Override
    public String elegir(int numero) {
        if (ausente == true&&presidente == true){
            this.voto=" ";
        }
        if (ausente == false && presidente == false && numero == 1){
            this.voto="positivo ";
        }
        if (ausente == false && presidente == false && numero == 2){
          this.voto=" negativo";
        }
        if (ausente == false && presidente == false && numero == 3){
            this.voto="abstiene";
        }
        return this.voto;

    }

    @Override
    public void asistenciaPorPartido(int cantidadSenadores) {
        if (ausente == false){
            cantidadSenadores+=1;
            System.out.println(cantidadSenadores);
        }
    }

    public void presente(){
        if (ausente == false){
            System.out.println(nombre+apellido+partidoPolitico);
        }
    }
    public String getVoto() {
        return this.voto;
    }
    public void setVoto(String voto) {
        this.voto = voto;
    }  
    public boolean getausente(){
        return this.ausente;
    }
    public boolean setausente(){
        return this.ausente;
    }
    public  String toString(){
        return  "\n"+"Nombre: "+this.nombre+"\nApellido: "+this.apellido+"\nPartido Político: "+this.partidoPolitico+"\nVoto: "+this.voto+"\nAusente?: "+this.ausente+"\nPresidente?: "+this.presidente+"\nVoto: "+this.voto;

    }

}


