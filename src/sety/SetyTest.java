package sety;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class SetyTest {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Orange");

        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("Potatoes");
        vege.add("Onions");

        vege.addAll(fruits);

        System.out.println(vege.size());

        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
