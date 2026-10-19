package binearqqqq;

import java.util.Arrays;

public class firstocc {
 public static void main(String[] args) {

    int a[]={5,6,7,7,7,7,8,8,10};
    int target=7;
    //System.out.println(Arrays.toString(search(a, 5)));
    
    
    int ans =0;
    int s=0;
    int e=a.length-1;

    while(s<=e){
        int mid=s+(e-s)/2;

        if(a[mid]>target){
            e=mid-1;
        }
        else if(a[mid]<target){
            s=mid+1;
        }
        else{
            ans=mid;
            e=mid-1;
        }
    }
    System.out.println(ans);


   
 }   


 


                          // cant figrue out this shit ::;;  wait wht i did figure out  this shit ::: thank to kunal :;;


    static int[] search(int a[],int target){
        int b[]={-1,-1};
        int first=bin(a, target,true);
        int last=bin(a, target,false);

        b[0]=first;
        b[1]=last;
        return b;


    }
 static int bin(int a[],int target,boolean first){
    int ans=-1;
    int start=0;
    int end=a.length-1;
    while (start<=end) {

        int mid=start+(end-start)/2;

        if(a[mid]>target){
            end=mid-1;
        }
        else if(a[mid]<target){
            start=mid+1;
        }
        else {
            ans=mid;
            if(first==true){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
}

return ans;
    
}

}
