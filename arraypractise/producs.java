package arraypractise;

import java.util.Arrays;

public class producs {
    public static void main(String[] args) {
        int nums[]={-1,1,0,-3,3};
        int a[]=new int[nums.length];
         int j=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int k=0;k<nums.length;k++){
               if(nums[i]!=nums[k]){
                product*=nums[k];
               }
               if(nums[k]==0){
                product=0;
                break;
               }
            }
            a[j]=product;
            j++;
        }

       System.out.println(Arrays.toString(a));
    }
}
