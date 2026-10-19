package arrays.cwh;

public class rervinarray {
    public static void main(String[] args) {
       int arr[]={20,10,40,30};
    //    int rev[]=new int[arr.length];
    //    for(int i=0;i<arr.length;i++){
    //     rev[i]=arr[arr.length-1-i];
    //    }
    //    for(int element: rev){
    //     System.out.println(element);
    //    }

          
          //2 pointers gpt solve it:

       int start=0;
       int end=arr.length-1;
       while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]= temp;

        start++;
        end--;
       }
       for(int element:   arr){
        System.out.println(element);
       }
    }
}
