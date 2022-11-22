/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author hazie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colas cola1 = new Colas<>();
        System.out.println("cola1");
        System.out.println(cola1.estaVacio());
        cola1.enqueue(1);
        cola1.enqueue(2);
        cola1.enqueue(3);
        System.out.println(cola1);
        System.out.println(cola1.length());
        
                
    }
    
}
