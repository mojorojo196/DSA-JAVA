package arraypattern.twopointer;

import java.util.Arrays;

public class sign {
    public static void main(String[] args) {
        int nums[]={3,1,-2,-5,2,-4};
        int n=nums.length;
        // taking more spcae brute force 
        // int a[]=new int[5];
        // a[4]=10;
        // System.out.println(Arrays.toString(a));

        // can be optimze by 2 pointer:
    //      int n=nums.length;
    //     int res[]=new int[n];
    //     int po[]= new int[n/2];
    //     int p=0;
    //     int ve[]= new int[n/2];
    //     int v=0;

    //     for(int i=0;i<n;i++){
    //         if(nums[i]>0){
    //             po[p]=nums[i];
    //             p++;
    //         }
    //         else{
    //             ve[v]=nums[i];
    //             v++;
    //         }
    //     }
    //     int pindex=0;
    //     int neindex=0;
    //     for(int i=0 ; i<n;i++ ){
    //         if(i%2==0){
    //             res[i]=po[pindex];
    //             pindex++;
    //         }
    //         else{
    //             res[i]=ve[neindex];
    //             neindex++;

    //     }
    // }
   // System.out.println(Arrays.toString(res));

   // optimal 2 pointer:
   int []res=new int[n];
   int po=0; // positive are on even index
   int ve=1; // ve are on add index
   for(int elem:nums){
    if(elem>=0){
        res[po]=elem;
        po+=2;
    }
    else{
        res[ve]=elem;
        ve+=2;
    }
   }
   System.out.println(Arrays.toString(res));
}
}
