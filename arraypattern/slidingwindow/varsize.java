package arraypattern.slidingwindow;

public class varsize {
    public static void main(String[] args) {
        int nums[]= {1,2,4,5,7,8,9,4,1};
        int target = 10;
        int sum=0; // sum of window running sum , in this we are going to add the sum of window untill the condition become valid 
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE; // this store the minmum size of window till the condition is vaild 
            /// this is my own
    //     while(j<nums.length){
    //        // int cursum=sum+nums[j];
    //        sum+=nums[j];
    //         if(sum>=target){
    //             if(min>j-i+1){
    //                 min=j-i+1;
    //             }
    //             sum=sum-nums[i]-nums[j];
    //             i++;
    //     }
    //     else{
            
    //         j++;
    //     }
    // }
            // belly ka solution
     for (int k = 0; k < nums.length; k++){
           // int cursum=sum+nums[j];  think why you were using this there no need for this 
           sum+=nums[j]; // we adding sum till the condition hit // window grow till hit condition

            while(sum>=target){  // we hit condition then we shrink window , till the condition is valid 

                min=Math.min(j-i+1, min); // computing window size that is valid for condition

                sum-=nums[i]; // just like fixed we remove left side // shrink the window 

                i++;   // both pointer are moving forward not backward 
        }
       j++; // if above loop end window grow again till j<nums.length
    }
    System.out.println(min);
}
}
         // first try brute force ::
//   // int minsize=0; // this is wrong 
//    int minsize=Integer.MAX_VALUE; //this is correct as we need to find min value 

//   //Return the minimum length of a contiguous subarray whose sum ≥ target.
//   for(int i=0;i<nums.length;i++){
//     int sum=0;
//     for(int j=i;j<nums.length;j++){
//         sum+=nums[j];
//         if(sum>=target){
//             minsize=Math.min(minsize, j+i-1); // if we use zero and 0 will alwys be minimum in any case no matter wht 
//         }
//     }
//   }
//   System.out.println(minsize);