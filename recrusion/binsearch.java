package recrusion;

import binearqqqq.searchinroII;

public class binsearch {
    public static void main(String[] args) {
     int a[]= {1,2,3,4,5,6,7,8,9};
     int target=6;
     System.out.println(binse(a, target, 0, a.length-1));
    }
     static int binse(int a[],int target , int st , int end){
        // int start=0;
        // int end=a.length-1;  //if we pass this here it wont divide arry in half
    // if we call fx it will be same think ? 
    //  if i do  binse(a, target); it call same value we cant pass this inside fx as array size depend on them ; then wht to do pass this as arguments 
    // base condition to stop search same as bs 
    if(st>end){
        return -1;
    }
    // calculating mid
    int mid = st+(end-st)/2; // body of fx as 
         /// comparision check
    if(a[mid]==target){
        return mid;
    }
    else if(a[mid]>target){    // target may be behind 
       return binse(a, target, st, mid-1);
    }
    else{
        return binse(a, target, mid+1, end);
    }         
    }
}
