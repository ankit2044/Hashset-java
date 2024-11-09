package Hashset;

import java.util.*;

//Iterate Through HashSet: Write a program that:
//
//Adds three country names to a HashSet.
//Uses a for-each loop to print each country in the set

public class Iterate_Hashset {
    public static void main(String[] args) {


        HashSet<String> country = new HashSet<>();
        // country.add("india");
        country.add("India");
        country.add("Brazil");
        country.add("Australia");
        for(String countries: country){
            System.out.println(countries);
        }
    }
}
