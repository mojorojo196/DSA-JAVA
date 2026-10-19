package exerciseone;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=5;
        int b=3;
        int p=1;
        for(int i=1;i<=b;i++){
            p=a*p;
        }
        System.out.println(p);

    }
}
