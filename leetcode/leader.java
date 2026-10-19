package leetcode;

import java.util.Arrays;

public class leader {
    public static void main(String[] args) {
        // leader meaning ek elem agar apne right side ke jitne bhi elem hai unse bada hai toh leader hai
        //ex-4,12,7,66,41,9 --- output-- 66,41,9
       int []a={2,5,7,8,4,1,6};
        int tem[]=new int[a.length];
        int k=1;
        int j=a[a.length-1];
        tem[0]=j;
    
        for(int i=(a.length-2);i>=0;i--){
                  if(a[i]>j){
                      j=a[i];
                      tem[k]=a[i];
                      k++;
                  }
        }
       for(int i=k-1;i>=0;i--){
        System.out.println(tem[i]);
        
       }

    }
}
