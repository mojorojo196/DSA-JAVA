package arraypractise;

import java.util.Arrays;

public class plusoone {
    public static void main(String[] args) {
        int a[]={1,2,3,9};
        System.out.println(Arrays.toString(plusone(a)));
    }
    static int[] plusone(int a[]){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]<9){
                a[i]++;
                return a;
            }
            a[i]=0;
        }

        a=new int[a.length+1];
        a[0]=1;
        return a;

    }
    
}
