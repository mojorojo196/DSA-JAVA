package binearqqqq;

public class floor {
    public static void main(String[] args) {
        int a[]={2,3,5,9,14,16,18};
        System.out.println(floor(a, 11));

    }
         /// floor mean greatest no which is smaller or equal to the target or no<=target (sabse bada number arr se jo chota ho target se ya equal ho uska index return karo)
         /// 
         /// above ex target is five then our output is 14,,14<15 (14 is greatest among no which is smaller then 15) or index of 14 which is 4
    static int floor(int a[],int target){
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
            else{
                return mid;
            }
    }

    return end;
}

}
