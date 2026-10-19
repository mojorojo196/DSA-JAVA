package arraypractise;

import java.util.Arrays;

public class remove {
    public static void main(String[] args) {
        //need to remove kth value in an arry
         int a[]={1,1,2,4,5,7,8,8,9};
         int c=8;
         int j=0;
         for(int i=0;i<a.length;i++){
            if(a[i]!=c){
                a[j]=a[i];
                j++;
            }
         }
         for (int i = 0; i < j; i++) {
            System.out.print(a[i] +" ");
         }

    }
}
