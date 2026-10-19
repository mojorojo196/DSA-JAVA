package searching;
public class binearysearch {
    public static void main(String[] args) {
        //binary search use to serching the target elem in more effective way:::

    ///imp this only work on sorted arrayy
        int a[]={5,2,4,8,9,3};/// this arr is not sorted hencce if we search 5 it will not give answer:::::
        int []b={1,2,3,4,5,6};// this is perfect
         int target=6;
      System.out.println(binse(b, target));
    }
         
               // this is linear search
    // static int search(int a[],int target){

    //     for(int i=0;i<a.length;i++){
    //         if(a[i]==target){
    //             return i;

    //         }
    // }

    // return -1;
static int binse(int []a,int target){
    int start=0;
    int end=a.length-1; 
    
   while(start <=  end){
    int mid=(start+end)/2;

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
    return -1;

}

}