package arraypattern.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;

public class hard1 {
 public static void main(String[] args) {
    int[] nums={4,5,8,9,6,5,2,0};
    int k=3;
     /// brute force;
    // int ans[]=new int[nums.length-k+1];
    // int z=0;

    // for(int i=0;i<=nums.length-k;i++){
    //     int max=nums[i];
    //     for(int j=i;j<k+i;j++){
    //         max=Math.max(max, nums[j]);
    //     }
    //     ans[z]=max;
    //     z++;
    // }
    // System.out.println(Arrays.toString(ans));
    int ans[]=new int[nums.length-k+1];
    int z=0;
int temp[]=new int[k];
for(int i=0;i<k;i++){
    temp[i]=nums[i];
}
// int maxindex=max(temp);
// ans[z]=temp[maxindex];
// z++;

// int coming=k;
// int leaving=maxindex;

// for(int i=coming;i<nums.length;i++){
//     temp[maxindex]=nums[i];

       // wrong approch ////////////
// }


//      ArrayList<Integer> ans= new ArrayList<>();
//         int temp[]=new int[k];
//         for(int i=0;i<k;i++){
//             temp[i]=nums[i];
//         }
//         ans.add(max(temp));

//         int left=0;
//         for(int ri=k;ri<nums.length;ri++){

//             temp[left]=nums[ri];
//             left++;
//             if(left==k-1){
//                 left=0;
//             }
//             ans.add(max(temp));

//         }
// System.out.println(ans);

 }   
 static int max(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[max]<a[i]){
                max=i;
            }
        }
        return max;
}
}
