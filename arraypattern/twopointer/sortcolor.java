package arraypattern.twopointer;

import java.util.Arrays;

public class sortcolor {
    public static void main(String[] args) {
        int a[]={0,0,1,2,0,2,2,0,1,1};
            // brute force 
        int count1=0;
        int count2=0;
        int count0=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
                }
            else{
                count2++;
            }
        }
        int i=0;
        while(count0>0){
            a[i]=0;
            count0--;
            i++;
        }
        while(count1>0){
            a[i]=1;
            count1--;
            i++;
        }
        while(count2>0){
            a[i]=2;
            count2--;
            i++;
        }
        System.out.println(Arrays.toString(a));

           // ooptimal uses dutch national flag algorithm:

        
    }
}
