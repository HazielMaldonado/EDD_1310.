/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listassimplementeligadas;

/**
 *
 * @author hazie
 * 
 */
public class ListaSimplementeLigada<T> {
    private Nodo<T> head;
    int tamanio;

    public ListaSimplementeLigada() {
        head = null;
        this.tamanio = 0;
    }

    
    
    public boolean estaVacia(){
        return this.head == null;
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
    
    public void agregarAlfinal(T valor){
        if(this.head == null){
            head = new Nodo<>(valor);
            Nodo<T> newNodo = new Nodo<>(valor);
        }else{
            Nodo<T> iteradorNodo = head;
            while(iteradorNodo.getSiguiente() != null){
                iteradorNodo = iteradorNodo.getSiguiente();
            }
        }
    }
    public void agregarInicio(T valor){
        Nodo<T> newNodo = new Nodo<>(valor, head);
        head = newNodo;
        
    }
            
    public void agregarDespues(T referencia, T valor){
        if(buscar(referencia) <0) return;
        
        Nodo<T> curr_nodo = head;
        while (curr_nodo.getSiguiente() != null && curr_nodo.getDatos() != referencia){
            curr_nodo = curr_nodo.getSiguiente();
        
    }
        Nodo<T> newNodo = new Nodo <>(valor, curr_nodo.getSiguiente());
        curr_nodo.setSiguiente(newNodo);
        
        
    }
    public void eliminarPos(int indice){
        if(this.getTamanio()>= indice || estaVacia() || indice < 0)return;
        if(indice == 0){
            EliminarPrimero();
            
        }
        
    }
    public void EliminarPrimero(){
        if(head == null) return;
        head = head.getSiguiente();
        
    }
    public void  EliminarFinal(){
        if(head == null) {
            return;
        }else if(getTamanio() == 1){
            EliminarPrimero();
            return;
        }
        Nodo<T> anteriorNodo = null;
        Nodo<T> curr_nodo = head;
        while (curr_nodo.getSiguiente() != null){
            anteriorNodo = curr_nodo;
            curr_nodo = curr_nodo.getSiguiente();
        }
        anteriorNodo.setSiguiente(null);
        
    
        
        
    }
    
    public int buscar (T valor){
        int posicion = 0;
        Nodo<T> curr_nodo = head;
        while(curr_nodo != null){
            if(curr_nodo.getDatos() == valor){
                return posicion;
                
            }
            curr_nodo = curr_nodo.getSiguiente();
            posicion++;
        }
        
        return -1;
        
    }
    
    public void actualizar (T a_buscar, T valor){
        if(buscar(a_buscar) < 0) return;
        
        Nodo<T> curr_nodo = head;
        while(curr_nodo != null && curr_nodo.getDatos() != a_buscar){
            curr_nodo = curr_nodo.getSiguiente();
            
        }
        if(curr_nodo.getDatos() != a_buscar)return;
        curr_nodo.setDatos(valor);
        
        
        
        
        
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
