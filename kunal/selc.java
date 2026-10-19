package kunal;

import java.util.Arrays;

public class selc {
    public static void main(String[] args) {
        int a[]={4,2,6,8,9,7};
       // System.out.println(max(a));
        selectionsort(a);
        System.out.println(Arrays.toString(a));
    }
    static void selectionsort(int a[]){
        for (int i = 0; i < a.length; i++) {
            int lastindex=a.length-i-1;
            int max=max(a,0,lastindex);
            swap(a,max,lastindex);

        }
    }

    static void swap(int a[],int first,int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;

    }

    static int max(int[]a,int start ,int end){
        int m=start;
        for(int i=1;i<=end;i++){
            if(a[m]<a[i]){
                m=i;
            }
        }
        return m;
    }
    
}
