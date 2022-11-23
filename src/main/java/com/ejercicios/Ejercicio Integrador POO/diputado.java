package com.objeto.Integrador;
/*Crear una clase Diputado que herede de Legislador e implemente la interfaz votacion y tenga los atributos partido politico y voto.*/
class diputado extends legislador implements votación {
    private String partidoPolitico;
    private String voto;

    public diputado(){
        super();
        this.partidoPolitico = "Azul";
        this.voto= "2";
    }
    public diputado(String newpartidoPolitico, String newvoto, String newnombre, String newapellido, int newedad, String newprovincia) {
        super(newnombre, newapellido, newedad, newprovincia);
        this.partidoPolitico = newpartidoPolitico;
        this.voto = newvoto;
    }
    
    @Override
    public String elegir(int numero) {
        if (numero == 1){
            this.voto="positivo";
        }
        if (numero == 2){
            this.voto="negativo";
        }
        if (numero == 3){
            this.voto="abstiene";
        }
        return this.voto;
    }
    @Override
    public int asistencias(int cantidadDiputados) {
        return cantidadDiputados;
        }
    @Override
    public void asistenciaPorPartido(int cantidadDiputados) {
        cantidadDiputados+=1;
        System.out.println(this.nombre+cantidadDiputados);
    }
    public String votar(){
        return this.voto+this.nombre+this.apellido+this.partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }
    public String getVoto() {
        return this.voto;
    }
    public void setVoto(String voto) {
        this.voto = voto;
    }  
    public  String toString(){
        return "\n"+"Nombre: "+this.nombre+"\nApellido: "+this.apellido+"\nPartido Político: "+this.partidoPolitico+"\nVoto: "+this.voto;
    }
}

