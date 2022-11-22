/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author hazie
 */
public class Colas<T> {

    public Nodo<T> adelante;
    public Nodo<T> atras;
    public int tamanio;

    public Colas() {
        adelante = null;
        atras = null;
        tamanio = 0;
        
    

    }
    public boolean estaVacio(){
        return tamanio == 0;
    }
    
    public int length(){
        return tamanio;
    }
    
    public void enqueue(T valor){
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if(estaVacio()){
            adelante = atras = nuevoNodo;
            
        }else {
            atras.setSiguiente(nuevoNodo);
            atras = nuevoNodo;
        }
        tamanio++; 
    }
    public T dequeue() {
        if(estaVacio()) {
            return null;
        }else if(adelante == atras) {
            atras = null;
        }

        T adelanteValor = adelante.getDatos();
        adelante = adelante.getSiguiente();
        tamanio--;
        return adelanteValor;
    }

    public T adelante() {
        if(estaVacio()) {
            return null;
        }

        return adelante.getDatos();
    }
    
    
    @Override
    public String toString(){
        String colaString = " ";
        Nodo<T> iterador = adelante;
        while(iterador != null){
            colaString += iterador;
            iterador = iterador.getSiguiente();
        }
        return colaString;
        
        
        
    } 
    
    
    

}
