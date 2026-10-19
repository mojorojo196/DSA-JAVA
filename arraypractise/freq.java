package arraypractise;

import java.util.Arrays;

public class freq {
    public static void main(String[] args) {
        // arry is sorted in this question but if array is not sorted problem will occur 
         int a[]={1,1,2,2,2,2,33,77,88,9,9};
          Arrays.sort(a);
        int count=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                count++;
            }
            else{//last index or element ke liye ye kabhi chalega hi nahi 
                System.out.println(a[i-1]+"->"+count);
                count=1;
            }
        }

          //printing count of last element
        System.out.println(a[a.length-1]+"->"+count);
    }
      
}
