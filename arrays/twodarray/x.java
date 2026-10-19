package arrays.twodarray;

import java.util.Arrays;
import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        // int row=s.nextInt();
        // int col=s.nextInt();
        // int num[][]=new int[row][col];
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         num[i][j]=s.nextInt();
        //     }
        // }
        // int x=s.nextInt();
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //     if(num[i][j]==x){
        //         System.out.println("X FOUND AT LOCATION (" +i + "," +j +")");
        //     }
        // }}
        int num[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              num[i][j]=s.nextInt();    
            }
           
        }

         
    }
}
