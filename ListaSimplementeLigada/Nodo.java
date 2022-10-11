package com.mycompany.listassimplementeligadas;

/**
 *
 * @author hazie
 * 
 */
public class Nodo<T> {
    private T datos;
    private Nodo<T> siguiente;
    
    public Nodo(){
        
    }
    
    public Nodo(T valores){
        this.datos= valores;
    }
    public Nodo(T datos, Nodo<T> siguiente){
        this.datos = datos;
        this.siguiente = siguiente;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public String toString(){
        return "--"+ datos + "--";
    }
    
    
}
