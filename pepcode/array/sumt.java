package array;
import java.util.Arrays;
public class sumt {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
    int val=5;
    
    for(int i=0;i<a.length;i++){
        for(int k=i+1;k<a.length;k++){
            int sum=a[i]+a[k];
            if(sum==val){
                System.out.println( i);
                System.out.println( k);
            }
        }
    }
    }
    

}
