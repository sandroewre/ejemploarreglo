/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.arreglos;

/**
 *
 * @author labctr
 */
public class EjemplosArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // int edades[];
      //  edades = new int[3];
       // edades[0]=12;
       // edades[1]=10;
       // edades[2]=15;
        
        //Imprimir arreglo
 
      //  System.out.println("Elemento indice 0: "+ edades[0]);
      //  System.out.println("Elemento indice 1: "+ edades[1]);
       // System.out.println("Elemento indice 2: "+ edades[2]);
        
       // Persona persona[];
       // persona = new Persona [3];
        
       // persona[0]=new Persona("Pepe");
       // persona[1]=new Persona("Diana");
       // persona[2]=new Persona("Luis");
        
        //System.out.println("Persona indice 0: "+ persona[0]);
        //System.out.println("Persona indice 1: "+ persona[1]);
       // System.out.println("Persona indice 2: "+ persona[2]);
        
        String apellidos[] = {"Suarez","Guillen","Perez","Ramon"};
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println("Apellidos indices"+ i + ":"+apellidos[i]);
        }
        String edade[] = {"12","10","15"};
        for (int i = 0; i < edade.length; i++) {
           System.out.println("Elementos indices "+ i + ":"+edade[i]);
        }
        
        Persona persona[] = {new Persona("Pepe"),new Persona("Diana"),new Persona("Luis")};
        for (int i = 0; i < persona.length; i++) {
           System.out.println("Personas indices "+ i + ":"+persona[i]);
        }
        int edades [] = {12,10,15};
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades indices "+ i + ":"+edades[i]);
        }
    }
    }
    

