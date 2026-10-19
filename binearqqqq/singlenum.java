package binearqqqq;

public class singlenum {
    public static void main(String[] args) {
//         540. Single Element in a Sorted Array
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

    // Input: nums = [1,1,2,3,3,4,4,8,8]
    // Output: 2

    int nums[]={1,1,2,3,3,4,4,8,8};
    int ans=0;
    
     int left=0;
        int rigth=nums.length-1;

        while(left<=rigth){
            int mid=left+(rigth-left)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
              System.out.println(nums[mid]);
              break;
            }

            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    left=mid+1;
                }
                else if(nums[mid]==nums[mid-1]){
                    rigth=mid-1;
                }
            }
            else{
                if(nums[mid]==nums[mid+1]){
                    rigth=mid-1;
                    }
                else if(nums[mid]==nums[mid-1]){
                    left=mid+1;
                }
            }
        }
    } 
}
