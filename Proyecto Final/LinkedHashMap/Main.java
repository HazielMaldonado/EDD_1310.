/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.linkedhashmaps;

import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        
        //Añadir entradas al Mao
        lhm.put("uno","basket");
        lhm.put("dos","futbol");
        lhm.put("tres","tenis");
        
        //Imprimiendo Map
       System.out.println(lhm);
       
       System.out.println("////////////////");
       //Obteniendo el valor e imprimirlo por una llave especifica
       System.out.println("Obteniendo valor de llave 'uno':"+lhm.get("uno"));
       
       System.out.println("////////////////");
       //Obteniendo el tamaño del mapa 
       
       System.out.println("tamaño del map:"+lhm.size());
       
       System.out.println("////////////////");
       //La tabla esta vacio o no
       
       System.out.println("El map esta vacio?"+lhm.isEmpty());
       
       System.out.println("////////////////");
       //Conociendo si la llave 2 esta ocupada
       
       System.out.println("Esta ocupado la llave 2 :"+lhm.containsKey("dos"));
       
       System.out.println("////////////////");
       //Usando containsKey() revisamos el valor
       
       System.out.println(
       "Contiene 'futbol' el valor"+ "'americano'? :" +lhm.containsKey("futbol" +"americano"));
       
       System.out.println("////////////////");
       //Eliminar elemento
       System.out.println("Eliminar elemento 'uno':" + lhm.remove("uno"));
       
       System.out.println("////////////////");
       //Imprimiendo el map
       System.out.println("Imprimiendo el LinkedHashMap:" + lhm);
       
    }
    
}
