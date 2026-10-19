package array;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int marks[]=new int[5];
        int u=s.nextInt();
       for(int i=0;i<marks.length;i++){
           marks[i]=s.nextInt();
       }
       System.out.println("your arry");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
