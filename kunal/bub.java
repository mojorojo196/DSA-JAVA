package kunal;

import java.util.Arrays;

public class bub {
    public static void main(String[] args) {
        int a[]={1,4,5,8,9};
      bubb(a);
      System.out.println(Arrays.toString(a));
    }
    static void bubb(int []a){
        boolean s=false;
            for(int i=0;i<a.length;i++){
                for(int j=1;j<a.length-i;j++){
                    if(a[j]<a[j-1]){
                        swap(a,j,j-1);
                        s=true;
                    }
                }
                if(s==false){
                    break;
                }
            }
    }

    static void swap(int a[],int first, int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;

    }  }



