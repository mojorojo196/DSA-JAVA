package arrays;

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int size=s.nextInt();
       int m[]= new int[size];
       for(int i=0;i<size;i++){
        m[i]=s.nextInt();
       }
       for(int i=0;i<size;i++){
         System.out.println(m[i]);
       }
    }
}
