package javaweek5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Program7ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        if (names.isEmpty())
            System.out.println("The ArrayList is empty.");
        else
            System.out.println("The ArrayList is not empty.");


        // Add an element to the ArrayList
        names.add("Prime");

        if (names.isEmpty())
            System.out.println("The ArrayList is empty.");
        else
            System.out.println("The ArrayList is not empty.");

    }
}
