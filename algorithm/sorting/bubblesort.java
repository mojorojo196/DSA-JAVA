package sorting;
import java.util.Arrays;

public class bubblesort{
    public static void main(String[] argu){
        int a[]={1,2,3,4,5 };
       bubble(a);
       System.out.print(Arrays.toString(a));
    }
    ///a function that take an arry an sort it
    static void bubble(int[] arr){
        //this is use if array is already sorted then have no need to run loop again an again 
        boolean swap=false;
        //runs the loop n-1 time;
          for(int i=0;i<arr.length;i++){

            // for each step max item will come at the last index 
            for(int j=1;j<arr.length-i;j++){
                // j will run n-i time when i become 3 it runs 5-3 times 
                
                // we compare each element with previous one 
            //compare adjacent element everytime:
                if(arr[j]<arr[j-1]){
                    // swap if current is smaller then previous element
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }

            }
            // if there is no swap in any of the particular pass then loop will break; that's we use boolean if swap then true if no swap for a perticular pass then false , hence the loop will break;

            if(swap==false){
                break;
            }
          }
          
    }
}