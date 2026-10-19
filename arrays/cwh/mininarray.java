package arrays.cwh;

public class mininarray{
    public static void main(String[] args) {
        //min and max both at onces
        int arr[]={200,50,80,70,100};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
