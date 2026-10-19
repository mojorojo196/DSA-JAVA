package arraypractise;

import java.util.Arrays;

public class squr {
    public static void main(String[] args) {
            // squr of an sorted array elem may be -ve after squreing maintain sorted form :
        int a[]={-5,-4,-3,-2,-1};
        System.out.println(Arrays.toString(squr(a)));
    }
    static int[] squr(int a[]){
        int b[]=new int[a.length];
        int j=a.length-1;
        int st=0;
        int en=a.length-1;
        while(st<=en){
            int c=Math.abs(a[st]);
            int d=Math.abs(a[en]);
            if(c>d){
                b[j]=a[st] * a[st];
                st++;
                j--;
            }
            else{
                b[j]=a[en]*a[en];
                en--;
                j--;
            }
        }
        return b;

    }
}
