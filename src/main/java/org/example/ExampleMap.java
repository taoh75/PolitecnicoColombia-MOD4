package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        agenda.put("Carlos", "+573132565878");
        agenda.put("Maria", "+573209356897");
        agenda.put("Pedro", "+573258521");

        String telefono1 = agenda.get("Maria");
        System.out.println("El telefono de maria es "+telefono1);

        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}