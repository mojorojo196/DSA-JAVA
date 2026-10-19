package binearqqqq;

public class peak {
 public static void main(String[] args) {
    int a[]={7,10,4,3,1};
    //System.out.println(peak(a));
    System.out.println(peakopti(a));
 }
    //brute force approch::
    // basically finding max jesha hogya ye toh
 static int peak(int a[]){
    int peak=a[0];
    for (int i = 1; i < a.length; i++) {

        if(a[i]>peak){
            peak=a[i];
            
        }
        
    }
    return peak;

 }   

      //optimal binaery search

 static int peakopti(int a[]){
    //kunal's solution 
    int start=0;
    int end=a.length-1;
    while(start<end){
    int mid=start+(end-start)/2;  
    
    if(a[mid]>a[mid+1]){
      end=mid;
    }

    else{
      start=mid+1;
    }

    }

    return a[start];
    


 }
}
