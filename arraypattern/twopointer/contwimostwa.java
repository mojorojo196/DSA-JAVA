package arraypattern.twopointer;

public class contwimostwa {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
 // brute force;
        //  int max=Integer.MAX_VALUE;
        //  for(int i=0;i<arr.length-1;i++){
        //      for(int j=i+1;j<arr.length;j++){
        //          int len=Math.min(arr[i], arr[j]);
        //          int width=j-i;
        //          int area=len*width;
        //          max=Math.min(max, area);
        //      }
        //  }
        //  System.out.println(max);

       // optimal;

    int maxarea=0;
    int st=0;
    int en=arr.length-1;
     while(st<en){
        int len=Math.min(arr[st],arr[en]);
        int width=en-st;
        int area=len*width;
        maxarea=Math.max(maxarea, area);
        if(arr[st]<arr[en]){
            st++;
        }
        else{
            en--;
        }
     }
     System.out.println(maxarea);
    }
}
