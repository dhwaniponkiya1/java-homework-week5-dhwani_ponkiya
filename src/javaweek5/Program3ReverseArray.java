package javaweek5;
/*3. Write a Java program to reverse an array of integer values.*/

import java.util.Arrays;

public class Program3ReverseArray {

    public static void reverseArray(int[] a){
        int n = a.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }


    public static void main(String[] args) {
        int a[] = new int[]{10, 15, 20, 25, 30, 35, 40};

        System.out.println(" Original array " + Arrays.toString(a));
        reverseArray(a);
    }
}
