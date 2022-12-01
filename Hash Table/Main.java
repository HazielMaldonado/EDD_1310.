/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hashtable;

/**
 *
 * @author hazie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>(4);
        hashTable.agregar("A", "1");
        hashTable.agregar("B", "2");
        hashTable.agregar("C", "3");
        hashTable.agregar("D", "4");

        System.out.println(hashTable.valorDe("A"));
        System.out.println(hashTable.valorDe("B"));
        System.out.println(hashTable.valorDe("C"));

        hashTable.eliminar("C");
        System.out.println(hashTable.valorDe("C"));

        hashTable.agregar("C", "3");
        System.out.println(hashTable.valorDe("C"));
    }
        
    }
    

