package string.question;

import java.util.Arrays;

public class removed{
    public static void main(String[] args) {
        String s = "the sky is blue";
         s=s.strip();
         String[] a=s.split(" ");
         System.out.println(Arrays.toString(a));

         int i=0;
         int j=a.length-1;
         while(i<j){
            String temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
         }

         System.out.println(Arrays.toString(a));

        
       
    }
}