/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

/**
 *
 * @author hazie
 */
public class MiPila<T> {
    
    
    private Nodo<T> cima;
    private int longitud;
    
    public MiPila(){
        cima = null;
        longitud = 0;
    }
    
    
    public boolean EstaVacia(){
        return longitud == 0;
    }
    

   
    public void push(T valor) {
        Nodo<T> nodo = new Nodo(valor);
        nodo.siguiente = cima;
        cima = nodo;
        longitud++;
    }

    
    public T pop() {
        if (cima != null){
            T cimavalor = cima.getValor();
            cima = cima.getSiguiente();
            longitud--;
            
        
    }
        return null;
        
    
    }

    
    public T peek() {
        if(cima == null){
            return null;
        }else {
            return cima.getValor(); 
        }
        
    }

  
    public int longitud() {
        return longitud;
    
    }

    
    

    @Override
    public String toString() {
        String mipila = "";
        Nodo<T> iterador = cima;
        while(iterador != null){
            mipila += iterador;
            iterador = iterador.getSiguiente();
        }
        return mipila;
    }
    

    
    
   
    
    
    
}
