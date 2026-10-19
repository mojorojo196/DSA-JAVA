package exerciseone;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=0;
        int n=0;
        int z=0;
        while(true){
             int i=s.nextInt();
             if(i>0){
                p=p+1;
             }
             else if(i<0){
                    n=n+1;
             }
             else if(i==0){
                z=z+1;
             }
              System.out.println("exist yes/no");
             int a=s.nextInt();
             if(a==1){
                   break;
             }
             else{
                System.out.println("OK");
                continue;
             }
        }
        System.out.println("COUNT OF POSITIVE NUMBER" +" "+p);
        System.out.println("COUNT OF NEGATIVE NUMBER"+" " +n);
        System.out.println("COUNT OF ZERO YOU ENTERD"+" " +z);
    }
}
