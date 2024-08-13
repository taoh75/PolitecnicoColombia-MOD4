package org.example;

public class ExampleGenerics {
    public static void main(String[] args){
        Caja<String> nombre = new Caja<>();
        nombre.contenido="Tomás Oropeza";
        nombre.muestraContenido();

        Caja<Integer> Edad = new Caja<>();
        Edad.contenido=42;
        Edad.muestraContenido();

    }
}
