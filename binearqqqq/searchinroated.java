package binearqqqq;

public class searchinroated {
    public static void main(String[] args) {
        int a[]={2,3,4,5,0,0,1};
        System.out.println(searinro(a, 1));
    }
    static int searinro(int a[],int target){
                               // this was an confusing one because i never tried this pattern before so i cant compe up with my own solu but after hints it did it although i made some mistakes::
        int start=0;
        int end=a.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
        // this will run until we found target
            if(a[mid]==target){  // this the condition we need since we r finding target if r mid equal the target that's it we done:::
                return mid;
            }
            if(a[start]<=a[mid]){ // we trying to find which half is sorted so that we can find our search space 
             if(target>=a[start] && target<=a[mid]){ // is this is true our target must lay betwin start and mid : so we reduce the search spce:
                    end=mid-1;
                }
                else{
                    start=mid+1; // if not true then the target must lay in other side::
                }
            }
            else if(a[start]>a[mid]){  // this show's that the part is not sorted so we reduce our search space
                if(a[mid]<=target && a[end]>=target){ // and check if our target is btwin mid and end if yes it must be in rigth side 
                    start=mid+1;
                }
                else{
                    end=mid-1; // otherwise it may be on left side :;
                }
            }
            
        }
         // if it didnt find the target that means target it not there simply return -1;
        return -1;

    }
}
