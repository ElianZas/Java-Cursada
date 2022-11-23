package com.objeto.Integrador;
import java.util.ArrayList;
/*Crear una clase demoLeyes y crear 4 diputados de frente de todos, 3 de juntos por el cambio. Crear 3 senadores de frente de todos, 2 senadores de juntos por el cambio, 1 senador del partido obrero que estara ausente y un senador de frente de todos que sera presidente. 
Crear una variable que sea contarVotosDiputados que sume uno cuando voto = "positivo" y reste uno cuando voto = "negativo". Crear una variable que sea contarVotosSenadores que sume uno si contarVotosDiputados > 0 y voto = "positivo" y reste uno si contarVotosDiputados > 0 y voto = "negativo". Si contarVotosSenadores > 0 entonces mostrar en consola "Ley aprobada" sino muestra "Ley derogada" */
/*diputado.push, para añadir ()  PROBAR CON FOR*/
public class demoleyes  {
    public static void main(String[] args) {
        int contarVotosDiputados;
        int contarVotosSenadores;

        ArrayList<diputado> diputados = new ArrayList<diputado>(); 

         /*FRENTE DE TODOS D*/
        diputados.add(new diputado());
        diputados.add(new diputado("Frente de todos", "3", "Laura", "Sanchez", 49, "Santa Fé"));
        diputados.add(new diputado( "Frente de todos", "1", "Fernando", "Herrera", 30, "CABA"));
        diputados.add(new diputado("Frente de todos", "1", "Florencia", "Pérez", 55, "Rosario"));

        /*JUNTOS POR EL CAMBIO D*/
        diputados.add(new diputado("Juntos por el cambio", "1", "Juan", "Rodríguez", 50, "Tucumán"));
        diputados.add(new diputado("Juntos por el cambio", "1", "Jeremías", "Pérez", 45, "Rosario"));
        diputados.add(new diputado("Juntos por el cambio", "2", "Rosa", "Martínez", 36, "CABA"));

        ArrayList<senador> senadores = new ArrayList<senador>(); 

        /*FRENTE DE TODOS S*/
        senadores.add(new senador());
        senadores.add(new senador("Frente de todos", false, false, "positivo", "Horacio", "Hernández", 28, "Buenos Aires"));
        senadores.add(new senador("Frente de todos", false, false, "negativo", "Pedro", "Castel", 34, "Santa fé"));

        /*JUNTOS POR EL CAMBIO S*/
        senadores.add(new senador("Juntos por el cambio", true, false, "positivo", "Horacio", "Hernández", 28, "Buenos Aires"));
        senadores.add(new senador("Juntos por el cambio", false,  false, "positivo", "Kevin", "Gómez", 27, "Corrientes"));
        
        /*PARTIDO OBRERO S*/
        senadores.add(new senador("Partido obrero", false,  false, "positivo", "Lorena", "Pascal", 27, "Entre ríós"));
// SWITCH CASO NUEVO
/*Switch sirve para que chequee sin necesidad de if y eso, de que si se cumple que lo ingresado entre paréntesis es igual que uno de los casos definidos entonces nos devuelve el valor seteado para ese caso específico.
 */
        /*Crear una variable que sea contarVotosDiputados que sume uno cuando voto = "positivo" y reste uno cuando voto = "negativo". 
        
        Crear una variable que sea contarVotosSenadores que sume uno si contarVotosDiputados > 0 y voto = "positivo" y reste uno si contarVotosDiputados > 0 y voto = "negativo". Si contarVotosSenadores > 0 entonces mostrar en consola "Ley aprobada" sino muestra "Ley derogada" */
/*CONTAR VOTOS CON WHILE  */
        // contarVotosDiputados=0;
        // int x=0;
        // System.out.println("\nDIPUTAD@S");
        // while(x<diputados.size() ){
        //     if(diputados.get(x).getVoto() == "positivo"){
        //         contarVotosDiputados++;
        //     }else if(diputados.get(x).getVoto() == "negativo"){
        //         contarVotosDiputados--;
        //     }
        //     x++;
        // }
        // System.out.println("\n"+"\nVotos de Diputados: "+contarVotosDiputados);
        
/*SWITCH DOS VARIABLES NO SE PUEDEN ANALIZAR */
/*IF WHILE FOR SI SE PUEDE ANALIZAR MAS DE UNA VARIABLE */
/*CONTAR VOTOS CON FOR */
/*FOR CICLO ESTATICO */
/*WHILE PUEDE SER ESTATICO O DINAMICO */

    }
}
