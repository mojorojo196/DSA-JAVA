package binearqqqq;

public class indic {
   public static void main(String[] args) {
    int a[]={1 ,3,5,6};
    int target=100;
    System.out.println(search(a, target));
   }
   static int search(int a[],int target){
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
        else if(a[mid]==target){
            return mid;
        }
    }
    return start;

   }
}
