package array;

public class maxsubrr {
    public static void main(String[] args) {
        int a[]={-1};
        // int max=0;
        // for(int i=0;i<a.length;i++){
        //     for(int j=1;j<a.length;j++){
        //         if(a[i]+a[j]>max){
        //             max=a[i]+a[j];
        //         }
        //         else{
        //         break;    
        //         }
        //     }

        // }
        // System.out.println(max);
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int s=0;
            for(int j=i;j<a.length;j++){
                s+=a[j];
               if(s>sum){
                sum=s;                
               }
               
                

            }
        }
        System.out.println(sum);
    }
}
