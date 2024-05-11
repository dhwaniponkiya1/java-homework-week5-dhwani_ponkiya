package javaweek5;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program6RetrieveElements {

    public static void retrieveEle(int index, ArrayList<String> car){
        if (index >= 0 && index < car.size()) {
            String element = car.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else
            System.out.println("Index out of bounds.");

    }


    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();

        car.add("Audi");
        car.add("Toyato");
        car.add("Honda");
        car.add("Marcedez");
        car.add("I20");

        int index = 2;
        retrieveEle(index, car);

    }
}
