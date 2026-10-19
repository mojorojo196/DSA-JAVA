package arraypractise;

import java.util.Arrays;

public class strirotabyone {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        rotate(a);
    }
     static void rotate(int nums[]){
            int a=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=a;
        System.out.print(Arrays.toString(nums));
    }
}
