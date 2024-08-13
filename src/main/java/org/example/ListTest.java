package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main (String[] args){
        List<String> Lista1 = new ArrayList<String>();
        Lista1.add("Prueba 1");
        Lista1.add("Prueba 2");
        Lista1.add("Prueba 3");
        System.out.println("El tamaño de la Lista es "+Lista1.size());
        Iterator<String> iterator = Lista1.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
