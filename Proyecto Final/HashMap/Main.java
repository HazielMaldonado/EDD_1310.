/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hashmaps;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Tipo Generico
        HashMap<Integer, String> map1 = new HashMap<>();

        // Iniciando HashMap
        // usando genericos
        HashMap<Integer, String> map2
                = new HashMap<Integer, String>();

        // Añadir elementos
        map1.put(1, "Manzana");
        map1.put(2, "Pera");
        map1.put(3, "Uva");

        map2.put(1, "Lechuga");
        map2.put(2, "Jitomate");
        map2.put(3, "Tomate");

        System.out.println("Mapeos del HashMap map1 son : "
                + map1);
        System.out.println("Mapeos del HashMap map2 son : "
                + map2);

        System.out.println("//////////////");

        map1.put(2, "Sandia");

        System.out.println("Lista Actualizada " + map1);

        System.out.println("//////////////");

        map1.remove(3);
        System.out.println("Map despues de eliminar : "
                + map1);
        System.out.println("//////////////");

        HashMap<String, Integer> map3 = new HashMap<>();

        // Añadiendo elementos
        map3.put("Eugenio", 10);
        map3.put("Lalo", 30);
        map3.put("Cristian", 20);

        // Iterando
        // con loop for-each
        for (Map.Entry<String, Integer> e : map3.entrySet()) {
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        }
    }
}
