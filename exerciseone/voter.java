package exerciseone;

import java.util.Scanner;

public class voter {
    public static void eli(int a){
        if(a>=18){
            System.out.println("you are eligable");
        }
        else{
            System.out.println("sorry you are not eligable");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        eli(a);
    }
    
}
