package Hashset;

import java.util.*;

//Adding Unique Elements: Write a program that:
//
//Creates a HashSet of integers.
//Adds numbers 10, 20, 20, 30 to the set.
//Prints the elements in the set to confirm only unique values are stored.

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of integers
        Set<Integer> numbers = new HashSet<>();

        // Add numbers to the set (including duplicates)
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);  // Duplicate value
        numbers.add(30);

        // Print the elements in the set to confirm only unique values are stored
        System.out.println("Unique numbers in the set: " + numbers);
    }
}

