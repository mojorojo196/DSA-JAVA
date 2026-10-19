package basic;
import java.util.Arrays;
import java.util.Scanner;

public class max {
     public static int fact(int a){
        int f=1;
for(int i=a;i>0;i--){
    f=f*i;
}
        return f;
    }
    public static void main(String[] args) {
        
    // Scanner s= new Scanner(System.in);
    //     int n=s.nextInt();
    //     System.out.println(fact(n));
    //    System.out.println(sum(2,5));
        
    // }

    int a[]={0,2,3,4,5};
    System.out.println(missingNumber(a));
    }
        // static int sum(int a,int b){
        //     int c=a+b;
        //     return c;

        // }
        static int missingNumber(int[] nums) {
            //int a[]={0,2,3,4,5};

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

   static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
       
    

