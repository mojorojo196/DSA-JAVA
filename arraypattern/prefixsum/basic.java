package arraypattern.prefixsum;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        int a[]={3,5,2,7,1};
        int ans[]=new int[a.length];
        int sum=0;
        // for(int i=1;i<a.length;i++){
        //     a[i]+=a[i-1];
           
        // }
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            ans[i]=sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}
