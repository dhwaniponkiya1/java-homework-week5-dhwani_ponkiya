package javaweek5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Program5Iterator {
    public static void main(String[] args) {
        // Create a new ArrayList to store elements
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Create an Iterator to iterate through the ArrayList
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate and print each element using the Iterator
        System.out.println("ArrayList elements using Iterator:");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
