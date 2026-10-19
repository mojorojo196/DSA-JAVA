package arrays.cwh;

import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={5,2,3,7,4};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==3){
                System.out.println("2 found at index "+i);
            }
        }
    }
}
