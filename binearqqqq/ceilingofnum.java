package binearqqqq;

public class ceilingofnum {
    public static void main(String[] args) {
        int a[]={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(ceiling(a,20 ));
    }
       /// return the index of smallest no >= target  (agar target nahi mila toh smallest number jo target se bada hai ya equal hai arry mai woh return karo)
       /// 
       ///   above ex mai 16woh number hai jo smallest hai uun sab mai se jo target se bade hai 
    static int ceiling(int a[],int target){


        /// but if agar target hamare arry ke last elem se bhi bada hai toh koi greatest hoga hi nahi hence we return -1  ex- tar=20 , 20 is greater than last elem of arr toh koi koi ceiling hoga hi nahi:::
        ///              this is an good edge case
        /// 
        /// 
     if(target>a[a.length-1]){
     return -1;
      }
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

            System.out.print("POSITION OF ELEMENT:");
            return mid;
        }
}
System.out.print("CEILING OF ELEMENT:");
return start;

     }
    
    }
