/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pilas;

/**
 *
 * @author hazie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiPila<Integer> pila = new MiPila<>();
        System.out.println("EstaVacia();" + pila.EstaVacia());
        System.out.println("longitud();" + pila.longitud());
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila);
        System.out.println("peek();" + pila.peek());
        System.out.println("pop();" + pila.pop());
        System.out.println(pila);
        
        
    }
    
}
