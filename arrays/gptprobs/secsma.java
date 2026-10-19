package arrays.gptprobs;

public class secsma {
    public static void main(String[] args) {
        int arr[]={5,2,7,3};
        int sm=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<sm){
                sm=arr[i];
            }
        }
        int secsm=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sm && arr[i]<secsm ){
                secsm=arr[i];
            }
            
        }
        System.out.println(secsm);
    }
}
