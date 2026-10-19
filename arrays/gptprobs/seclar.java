package arrays.gptprobs;

public class seclar {
    public static void main(String[] args){

        int arr[]={1,2,8,40,70};
        int max=arr[0];
        

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int secmax=arr[0];
        ///Use Integer.Min_value it is the smallest possible value an int can store in java, so that 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>secmax){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}
