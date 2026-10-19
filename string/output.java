package string;

import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        System.out.println(new int[]{2,3,5,4}); // so array The code prints [I@251a69d7 because arrays in Java do not have a built-in toString() method that prints their contents. Instead, Java prints the array's default internal object description.
          System.out.println(Arrays.toString(new int[]{2,3,5,4}));// this will print arrays
        String s=null;
        System.out.println(s);
    }
}
