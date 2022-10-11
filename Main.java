/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listassimplementeligadas;

/**
 *
 * @author hazie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimplementeLigada<Integer> lista = new ListaSimplementeLigada<>();
        
        
        System.out.println(lista);
        
        System.out.println(lista.estaVacia());
        
        System.out.println(lista.getTamanio());
        
        lista.agregarInicio(45);
        System.out.println(lista);
        lista.agregarInicio(30);
        System.out.println(lista);
        lista.agregarInicio(84);
        System.out.println(lista);
        lista.agregarInicio(11);
        System.out.println(lista);
        
        lista.agregarAlfinal(28);
        System.out.println(lista);
        
        lista.agregarDespues(30, 31);
        System.out.println(lista);
        
        lista.eliminarPos(1);
        System.out.println(lista);
        
        lista.EliminarPrimero();
        System.out.println(lista);
        
        lista.EliminarFinal();
        System.out.println(lista);
        
        System.out.println("El numero 30 esta en"+ lista.buscar(30));
        
        lista.actualizar(84, 99);
        System.out.println(lista);
        
    }
    
    
}
