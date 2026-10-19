package binearqqqq;

public class infinitearr {
    public static void main(String[] args) {
        int a[]={1,2,3,5,8,9,22,26,27,30,33,39,45,66};
  // basically in infinite array we dont know sta and en/ our bound and infinite also mean that we didnt know  the length of the array 
        int target=3;
        System.out.println(ans(a, 33));

    }
/// therefore our first task is to find sta and en to apply binary search in arry 
    static int ans(int a[],int target ){

// for that we going to move in chunks like sta from 0 and en will be 1, then we going to increase size of array exponitally 
        int sta=0;
        int en=1;
        while(a[en]<target) {
            int temp=en+1;
            en= en+(en-sta+1)*2;
            sta=temp;
        }

        return binse(a, target,sta,en);

    }



    static int binse(int []a,int target,int sta ,int en){
   
    
   while(sta <=  en){
    int mid=(sta+en)/2;

         if(a[mid]>target){
            en=mid-1;
        }
        else if(a[mid]<target){
            sta=mid+1;
        }

        else{
            return mid;
        }
    }
    return -1;

}
}
