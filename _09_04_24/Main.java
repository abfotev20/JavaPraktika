package _09_04_24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, Map<String , Integer>>> myMap = new HashMap<>();
        myMap.put("123", new HashMap<>());
        myMap.get("123").put("key", new HashMap<>());
        myMap.get("123").get("key").put("Ivan", 1000);
        System.out.println(myMap.get("123").get("Key").get("Ivan"));



        Map<String, String> carPlates = new HashMap<>();
        carPlates.put("A7777AB", "BMW");
        carPlates.put("A7777ABC", "Ople");
        carPlates.put("A7777ABCD", "Mercedes");
        carPlates.put("A7777ABCDE", "Audi");

        carPlates.putIfAbsent("A7777ABC", "Lada");

        Set<String> keys = carPlates.keySet();

        for (String key : keys) {
            System.out.println(key + " - " + carPlates.get(key));
        }

        for (String value : carPlates.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : carPlates.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}


/**
 Set<String> names = new LinkedHashSet<>();
 names.add("Ivan");
 names.add("Yordan");
 names.add("Georgi");
 names.add("Pesho");

 names.remove("Ivan");

 names.forEach(e -> System.out.println(e));
 *
 */
