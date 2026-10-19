package arrays.cwh;

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float arr[]={1,2,5,4,5};
         float sum=0;
        for(int i=0;i<arr.length;i++){
               sum=sum + arr[i];
        }
        System.out.println(sum);

    }
}
