package javaweek5;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program9HashMap {
    public static void main(String[] args) {
        //Create Hashmap to store String keys and integer value
        Map<String, Integer> student = new HashMap();
        student.put("John", 56);
        student.put("David", 30);
        student.put("Prime", 22);
        student.put("Test", 26);

        //use a for-each loop to iterate the value in the map
        System.out.println("Roll no of the student in the map");
        for (int rollno : student.values()) {
            System.out.println(rollno);
        }
    }
}
