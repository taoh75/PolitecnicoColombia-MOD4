package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<Integer> integersList = new LinkedList<Integer>();
        integersList.add(1);
        integersList.add(4);
        System.out.println("La lista tiene "+integersList.size()+" items creados");
        System.out.println("Primer Item: "+integersList.getFirst().toString());
        for (Integer integerValue : integersList) {
            System.out.println("Item: " + integerValue.toString());
        }
    }
}
