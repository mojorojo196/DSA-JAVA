package arrays.cwh;

public class maxinarray {
    public static void main(String[] args) {
        int arr[]={1,2,8,40,70};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
