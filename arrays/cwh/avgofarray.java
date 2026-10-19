package arrays.cwh;

import java.util.Scanner;

public class avgofarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={5,5,5,5,5,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
        }
        int avg=sum/arr.length;
        System.out.println(avg);
    }
}
