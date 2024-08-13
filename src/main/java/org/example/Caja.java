package org.example;

public class Caja<T> {
    public T contenido;
    public void muestraContenido(){
        System.out.println("El contenido es "+this.contenido.toString());
    }
}
