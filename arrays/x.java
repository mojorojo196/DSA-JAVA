package arrays;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int num[]=new int[size];//IS SIZE WAS NOT THERE ONLY [1,2,6,] THIS WAS GIVEN THEN IF FIND SIZE BY num.length insted of size "that means size" no need of size 
        for(int i=0;i<size;i++){
            num[i]=s.nextInt();
        }
        int x=s.nextInt();
        for(int i=0;i<size;i++){
            if(num[i]==x){
                System.out.println("X FOUND AT INDEX" +i);
            }
        }
    }
}
