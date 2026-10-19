package array;

import java.util.Scanner;

public class span {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
///span matlab max vaule - min value///
        int arr[]={1,2,3,8};
           
        
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }  
            if(min>arr[i]){
                min=arr[i];
            }
        }
         System.out.print(max-min);
    }
    
}
