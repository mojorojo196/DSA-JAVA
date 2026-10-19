package arraypractise;
import java.util.*;
public class maxconone {
    public static void main(String[] args) {
         int a[]={1,1,1,1,0,0,1,1,1,1,1,1};
         System.out.println(maxone(a));
        // int count=0;
        // int max=0;
        // for (int i = 0; i < a.length; i++) {
        //     if(a[i]==1){
        //         count++;
        //         if(count>max){//well if previous count max mai stor hai toh agar current jada wala jada hai previous wale se then we do below shit::
        //         max=count;
        //     }
        //     }
        //     else{
        //         count=0;
        //     }

        // }
        // System.out.println(max);
    }
    static int maxone(int a[]){
        int max=0;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                count=0;
            }
            else{
                count++;
                max=Math.max(max, count);
            }
        }
        return max;
    }
}
