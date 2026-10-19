package stack;

import java.util.ArrayList;

public class nextgreater {
   public static void main(String[] args) {
    
   }   
   static ArrayList<Integer> nextGreater(int[] a){
    ArrayList<Integer> result = new ArrayList<>();
    result.add(-1);
    for(int i=a.length-2;i>=0;i--){
        if(a[i]>a[i+1]){
            result.add(-1);
        }
        else{
            result.add(a[i+1]);
            int temp= a[i+1];
            a[i+1]=a[i];
            a[i]=temp; 
        }

    }

   }
}
