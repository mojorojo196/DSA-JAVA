package arraypractise;

import java.util.Arrays;

public class dup {
    public static void main(String[] args){
  // if array is sorted remove duplicate use two pointer approch
        int a[]={1,1,2,4,5,7,8,8,9};
        int c=dupli(a);
        System.out.println(c);




        }


    static int  dupli(int[] a){
        int j=0; /// start j=1 as we need to store first value also then compare with other:::::
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                a[j]=a[i];// this is wrong because of i-1 we never reach the last elemtn :: instead of using i-1 use a[j]=a[i]; beacuse of this we will go to the last index::
                j++;
            }
        }
        for(int k=0;k<j;k++){
  System.out.print(a[k]);
        }
    System.out.println();
        return j;

    }


    }

