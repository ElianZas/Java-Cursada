package com.objeto.sueltossintaxis;
/*3) Crear una clase figurasGeometricas con sus atributos lados.
tendra un metodo:
IdentificarFigura: a partir de los lados, identificara que figura bidimensional es( 1= circulo, 3 = triangulo, 4 rectangulo y poligonos hasta 12 lados) */

 class FigurasGeometricas {
    private int Cantlados;

    public FigurasGeometricas(int paramCantlados){
        this.Cantlados = paramCantlados;
    }
    public int getCantlados() {
        return Cantlados;
    }
    public void setCantlados(int cantlados) {
        Cantlados = cantlados;
    }

    void Identificafigura(){
        if (Cantlados == 1){
            System.out.println("Es un círculo");
        }
        if(Cantlados == 2){
            System.out.println("No es una figura válida");
        }
        if(Cantlados == 3){
            System.out.println("Es un Triángulo");
        }
        if (Cantlados == 4){
            System.out.println("Es un rectángulo");
        }
        if (Cantlados == 5 || Cantlados == 6 || Cantlados == 7 || Cantlados == 8 || Cantlados == 9 || Cantlados == 10 || Cantlados == 11 || Cantlados == 12){
            System.out.println("Es un polígono");
        }
        }
}
class DemoFigurasGeometricas{
    public static void main( String[] args )
{
    FigurasGeometricas a =new FigurasGeometricas(4);
    a.Identificafigura();

}
}