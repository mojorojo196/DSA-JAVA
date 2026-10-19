package arraypractise;

import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
        int a[]={1,2,5,4,2,2,3,5};
        System.out.println(Arrays.toString(sum(a)));
    }
    static int[] sum(int a[]){
        int n=a.length;
        int sum=a[0];
        int temp[]= new int[n];
        temp[0]=sum;
        int j=1;
       while(j<n){
        sum+=a[j];
        temp[j]=sum;
        j++;
    }
    return temp;
}
}