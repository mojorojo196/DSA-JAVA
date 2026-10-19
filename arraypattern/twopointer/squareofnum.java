package arraypattern.twopointer;

import java.util.Arrays;

public class squareofnum {
    public static void main(String[] args) {
        int a[]={-4,-3,0,1,3,10}; // since array is sorted we dont have to vary about whether values are same or not 

        int ans[]=new int[a.length];
        int st=0;
        int en=a.length-1;
        int index=a.length-1;

        while(st<en){
            int num1=Math.abs(a[st]);  //// this is just mode in math 
            int num2=Math.abs(a[en]);
            if(num1>num2){
                ans[index]=num1*num1;
                st++;
                index--;
            }
            else{
                ans[index]=num2*num2;
                en--;
                index--;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
