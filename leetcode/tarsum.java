package leetcode;

import java.util.Arrays;

public class tarsum {
    public static void main(String[] args) {
        int a[]={1,2,4,8,5};
        int tar=5;
        int tem[]=new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==tar){
                     tem[0]=i;
                     tem[1]=j;
                     
                }
            }    
        }
        System.out.println(Arrays.toString(tem));
       
        }  }

