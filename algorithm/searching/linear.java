package searching;

public class linear {
    public static void main(String[] args) {


    //in linear search we compare elem one by one 

    // best case elem on index 0 time compl::  O(1)  cause it didnt depend on time ::: which is constant 

    // worst case elem on last index  compp::: O(n)  since elem at last it will make n-1 compression therefor :::

        int a[]={5,4,7,8,9,6,3,1};
    }
 static int search(int a[],int target){
        for(int i=0;i<a.length;i++){   
              if(a[i]==target){
                return i;
            } 
        }
        return -1;
}


}
