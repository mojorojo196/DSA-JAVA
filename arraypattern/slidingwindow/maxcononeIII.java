package arraypattern.slidingwindow;

public class maxcononeIII {
    public static void main(String[] args) {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
          /// brute force pick and chec skiping atmost k zeros
    //     int max=0;
    //     for(int i=0;i<nums.length;i++){
    //         int kcount=0;
    //         int count=0;
    //         for (int j = i; j < nums.length; j++) {  // j pick from where  we start's counting one's 
    //             if(nums[j]==0){
    //                 if(kcount<k){
    //                     count++;
    //                     kcount++;
    //                 }
    //                 else{
    //                     break;
    //                 }
    //             }
    //             else{
    //                 count++;
    //             }
    //         }
    //         max=Math.max(max, count);

    //     }
        
    //    System.out.println(max);
    int max=0;
    int left=0; // this move when we hit our condition 
    int zerocount=0; // this track our zero count 
    for(int rigth=0;rigth<nums.length; rigth++){

        if(nums[rigth]==0){ // if we found any zero just increase zerocount 
            zerocount++;
        }

        while(zerocount>k){ /// if we hit this it mean we need to shrink 
            if(nums[left]==0){  // we have to check if zero at a particular position 
            zerocount--;// we cant rendomly decrease zerocount we need to check if elem on left pointer is zero or not 
            }
            left++;
        }
        max=Math.max(max,rigth-left+1); // just max btw max and current window size
        }
        System.out.println(max);
    }
}
