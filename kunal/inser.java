package kunal;

import java.util.Arrays;

public class inser {
    public static void main(String[] args) {
         int a[]={3,2,9,0,10001};
         inser(a);
         System.out.println(Arrays.toString(a));

    }
    static void inser(int a[]){

        for (int i = 0; i <a.length-1; i++) {// is condition mai prob thi i<a.len-2 jo ki galat hai 
            for(int j=i+1;j>0;j--){
                if(a[j]>a[j-1]){
                    break;
                }

     int temp=a[j];
     a[j]=a[j-1];
     a[j-1]=temp;
            
            

            }
            
        }

    }
}
