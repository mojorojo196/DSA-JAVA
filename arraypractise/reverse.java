package arraypractise;

import java.util.Arrays;


public class reverse {
    public static void main(String[] args) {
        int []a={2,5,7,8,4,1,6};
    
        int s=0;
        int end=a.length-1;
        while(end>s){
            int temp=a[s];
            a[s]=a[end];
            a[end]=temp;
            s++;
            end--;
        }
       System.out.println(Arrays.toString(a));
    }
}
