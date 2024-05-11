package javaweek5;

/*
4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Program4CreateArraylist {

    public static void main(String[] args) {
        //ArrayList for String object
        ArrayList<String> list = new ArrayList<>();
        list.add("Black");
        list.add("Blue");
        list.add("Pink");
        list.add("Red");
        list.add("Yellow");
        list.add("White");
        list.add("Red");

        for (String colour : list) {
            System.out.println(colour);
        }
    }
}
