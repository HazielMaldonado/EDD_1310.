/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.treemaps;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Iniciado TreeMap por default
        TreeMap tm1 = new TreeMap();

        //Insertando los elementos al TreeMap
        tm1.put(3, "Hola");
        tm1.put(2, "Hi");
        tm1.put(1, "Buenas");

        //Iniciando Treemap usando genericos
        TreeMap<Integer, String> tm2 = new TreeMap<>();

        tm2.put(3, "Adios");
        tm2.put(2, "Bye");
        tm2.put(1, "Chao");

        //Map 1
        System.out.println(tm1);

        //Map 2
        System.out.println(tm2);

        System.out.println("///////////");
        //Cambiando elemnto del arbol

        tm1.put(2, "Que tal");
        System.out.println(tm1);

        System.out.println("///////////");

        //Eliminando elemento
        tm1.remove(3);
        System.out.println(tm1);

        //Iterando TreeMap 
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm2.put(3, "A");
        tm2.put(2, "B");
        tm2.put(1, "C");

        for (Map.Entry mapElement : tm.entrySet()) {

            int llave = (int) mapElement.getKey();

            String valor = (String) mapElement.getValue();

            System.out.println(llave + " : " + valor);

        }

    }

}
