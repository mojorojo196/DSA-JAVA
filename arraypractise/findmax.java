package arraypractise;

public class findmax {
    public static void main(String[] args) {
        int a[]={8,8,8,8,7,8};
       // System.out.println(max(a));
        System.out.println(secmax(a));
    }
     static int max(int [] a){
   
          int max=a[1];
          for(int i=1;i<a.length;i++){
             if(a[i]>max){
                 max=a[i];
             }
          }
          return max;
     }

    static int secmax(int[] a){
        int max=max(a);
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<max){
                secmax=a[i];
            }
           else if(a[i]<secmax && a[i]!=max ){
            secmax=a[i];
           }
        }
        if(secmax==Integer.MIN_VALUE){
            return -1;
        }
        
        return secmax;


    }
}
