package searching;

import java.util.Arrays;

public class binsein2d {
    public static void main(String[] args) {
        
        int a[][]={
            {10,20,30,40},
            {15,25,35},
            {28,29,37,49},
            {33,34,38,50},
            {35,39,42,55}
        };
        System.out.println(Arrays.toString(search(a, 35)));
    }
    //Q. so matrix is sorted in a row wise and column wise sorted search for target
    static int[] search(int a[][],int target){
        int row =0;
        int col=a[row].length-1;// this will help if out array is of n*m matrix ::::
        
        while(row<a.length && col>=0){
                 /// here we are not calculating mid instead we are accessing elem and comparing it with target 
            if(a[row][col]==target){
                return new int[]{row,col};
                }
            else if(a[row][col]>target){
                col--;
                }
            else{
                row++;
            }

        }
        return new int[]{-1,-1};
    }
}
