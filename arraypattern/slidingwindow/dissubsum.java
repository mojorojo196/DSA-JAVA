package arraypattern.slidingwindow;

import java.util.*;

public class dissubsum {
    public static void main(String[] args) {
        int nums[]={1,5,4,2,9,9,9};
        int k=3;
        int ans=0;
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> n= new HashSet<>();
            int sum=0;
            for(int j=i;j<k+i;j++){
                if(!n.contains(nums[j])){
                    n.add(nums[j]);
                    sum+=nums[j];
                }
                else{
                    sum=0;
                    break;
                }
                
            }
            ans=Math.max(ans, sum);

        }

System.out.println(ans);



          // copied from gimini cant figrue out optimal on my own
    //         HashSet<Integer> set = new HashSet<>();
    // long maxAns = 0; // Use long to prevent integer overflow
    // long currentSum = 0;
    // int left = 0;

    // for (int right = 0; right < nums.length; right++) {
    //     // If duplicate found, shrink window from left until duplicate is removed
    //     while (set.contains(nums[right])) {
    //         set.remove(nums[left]);
    //         currentSum -= nums[left];
    //         left++;
    //     }

    //     // Add the current element
    //     set.add(nums[right]);
    //     currentSum += nums[right];

    //     // If window size matches k, check max and slide left pointer forward
    //     if (right - left + 1 == k) {
    //         maxAns = Math.max(maxAns, currentSum);
            
    //         // Slide the window: remove the leftmost element to prepare for next iteration
    //         set.remove(nums[left]);
    //         currentSum -= nums[left];
    //         left++;
    //     }
    // }

    // System.out.print(maxAns);
    }
}
