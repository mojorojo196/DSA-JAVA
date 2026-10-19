package arrays.twodarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int row=s.nextInt();
       int col=s.nextInt();
       int num[][]=new int[row][col]; 
       
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        
            num[i][j]=s.nextInt();
        }
       }
       System.out.println("you enter");
      for(int[] eleme:num){
      System.out.println(Arrays.toString(eleme));
      }      }
      }
       
    
