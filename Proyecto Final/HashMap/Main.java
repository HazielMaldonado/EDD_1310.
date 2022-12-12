/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hashmaps;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Generic type twice
        HashMap<Integer, String> map1 = new HashMap<>();

        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> map2
                = new HashMap<Integer, String>();

        // Add Elements using put method
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

        // Add elements using put method
        map3.put("Eugenio", 10);
        map3.put("Lalo", 30);
        map3.put("Cristian", 20);

        // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : map3.entrySet()) {
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        }
    }
}
