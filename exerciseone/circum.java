package exerciseone;

import java.util.Scanner;

public class circum {
    public static void circum(int r){
        System.out.println(2*3.14*r);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        circum(a);
    }
    
}
