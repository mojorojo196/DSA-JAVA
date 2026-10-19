package arraypractise;

import java.util.Arrays;

public class rotatebykfun {
    public static void main(String[] args) {
        int a[]={2,5,4,7,9};
       rotate(a, 2);
        }
        static void reverse(int a[],int start,int end){
        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        } 
        }
        static void rotate(int a[], int k){
        int b=a.length;
         k=k%b;
         if(k<0){
            k+=b;
        }
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1-k);
        reverse(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
        }
    }

