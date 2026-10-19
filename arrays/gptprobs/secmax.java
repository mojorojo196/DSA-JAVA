package arrays.gptprobs;

public class secmax {
    public static void main(String[] args){
        int arr[]={10,20,50,40,80};
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                 if(arr[i]>max){
                    secmax=max;
                    max=arr[i];
                 }
                 //gpt did this prob i cant logic this one also:
                 //this condition is for ke agar koi value double repeat ho rahi ho toh lar and seclar value same na aye//
                 else if(arr[i]>secmax && arr[i]!=max){
                    secmax=arr[i];
                 }
        }
        System.out.println("max element is: "+max);
        System.out.println("secmax element is: "+secmax);
    }
}
