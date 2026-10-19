package sorting;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int a[]={5,6,2,1,8};
        //Arrays.sort(a); inbuilt sorting in java:::::
         selection(a);
         sortsel(a);
        System.out.println(Arrays.toString(a));
    }

        ///  THIS CODE I WROTE ON MY OWN
     static void sortsel(int[] a){

        //we run through the arr 
 
         for(int i=0;i<a.length;i++){
        // collecting the last index so tht we can swap the largest element with the element at lastindex:
             int lastindex=a.length-i-1;

        // basic method we use to find max element in arr[]:
             int max=0;

             for(int j=1;j<a.length-i;j++){ //j run till a.len-i; cause at every pass max elem goes at lastindex and that part is sorted already we don't need to compare again n again:
                 if(a[j]>a[max]){

            // collecting index of the max elem so that we can replace with the elem at lastindex
                 max=j;
             }
            
            // as we found max element we swap it with the element at lastindex:
             
        // System.out.println(Arrays.toString(a));  wrote just for dry run purpose   
         }
         int temp=a[max];
             a[max]=a[lastindex];
             a[lastindex]=temp;
      
     
         }
        }



               /// kunal's code i just copy him out for this -- although the code above is also completelly fine and work correct kunal just build function so that we can automate the repetative task 
    static void selection(int[] a){
        for(int i=0;i<a.length;i++){
        int lastindex=a.length-i-1;
        int max=maxindex(a,0,lastindex);   
        swap(a, max,lastindex); 
        }
    
    
    }
    static void swap(int[] a, int first , int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
    static int maxindex(int[] a, int start, int end){
        int max=start;
        for (int i = 1; i<=end; i++) {
            if(a[i]>a[max]){
                max=i;
            }
            
        }
              // return is imp cause our function's data type is int so it must return an integer value:

        return max;

    }
    

     }
        

    
    
