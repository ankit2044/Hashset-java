package Hashset;
import java.util.*;

//Check Element Existence: Write a program that:
//
//Creates a HashSet of strings and adds five random words to it.
//Checks if a specific word (e.g., "Java") exists in the set and prints the result

public class HashSetElementExistence {
    public static void main(String[] args) {

        Set<String> words = new HashSet<>();

        // Add five random words to the set
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("Ruby");
        words.add("JavaScript");

        // Specify the word to check for
        String searchWord = "Java";

        // Check if the word exists in the set
        if (words.contains(searchWord)) {
            System.out.println("The word '" + searchWord + "' exists in the set.");
        } else {
            System.out.println("The word '" + searchWord + "' does not exist in the set.");
        }
    }
}

