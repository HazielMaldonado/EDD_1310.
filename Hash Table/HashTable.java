/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hashtable;

/**
 *
 * @author hazie
 */
public class HashTable<K, V> {
    private class Entrada{
        public K llave;
        public V valor;
        public int hash;
        
        public Entrada(K llave, V valor){
            this.llave = llave;
            this.valor = valor;
            this.hash = llave.hashCode();
            
        }
        
    }
    private int tablatamanio;
    private ListaSimplementeLigada<Entrada>[] entradas;
    
    public HashTable(int tablatamanio){
        this.tablatamanio = tablatamanio;
        this.entradas = new ListaSimplementeLigada[tablatamanio];
        for(int i = 0; i <tablatamanio; i++){
            entradas[i] = new ListaSimplementeLigada<>();
        }
        
    }
    private int Indice(int llaveHash){
        return (llaveHash & 0x7FFFFFFF)% tablatamanio;
    }
    
    public void agregar(K llave, V valor){
        Entrada entrada = new Entrada(llave, valor);
        int indice = Indice(entrada.hash);
        if (entradas[indice] == null){
            entradas[indice] = new ListaSimplementeLigada<>();
            entradas[indice].agregarInicio(entrada);
            
        }else {
            if (entradas[indice].buscar(entrada) >= 0){
                entradas[indice].buscar(entrada);
                
            } else {
                entradas[indice].agregarInicio(entrada);
            }
            
            
        }
        
    }
    
    public V valorDe(K Buscar){
        int actualIndice = Indice(Buscar.hashCode());
        if (entradas[actualIndice] == null || entradas[actualIndice].estaVacia() return null){
        Entrada entrada = new Entrada(Buscar,null);
        Entrada indice = entradas[actualIndice].getValor(entrada);
        if (indice == null) return null;
        return indice.valor;
        
        
        
    }
        
        
    }
    
    public void eliminar(K borrar){
        
        Entrada aux = new Entrada(borrar,null);
        int actualIndice = Indice(borrar.hashCode());
        entradas[actualIndice].Eliminarvalor(aux);
        
            
        
        
    }
    
    
}
