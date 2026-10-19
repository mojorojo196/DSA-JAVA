package arraypattern.slidingwindow;

public class subarrayprodlessthank {
    public static void main(String[] args) {
 // Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
// Input: nums = [10,5,2,6], k = 100
//Output: 8
//Explanation: The 8 subarrays that have product less than 100 are:
//[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
//Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.


       int nums[]= {1,2,3};
       int k=0;
       if(k<=1){
System.out.println(0); // edge case
       }
       int max=0;
       int p=1;
       int l=0;

       for(int r=0;r<nums.length;r++){
        p*=nums[r];
        while (p>=k) {
           p=p/nums[l]; 
           l++;
          
        }
   max+=r-l+1;
       }
       System.out.println(max);
    }
}
