package array;
import java.util.Arrays;
public class feq {
    public static void main(String[] args) {
       int a[]={1,1,2,2,2,2,33,11,1,2,77,88,9,9};//problem aygi eshmai
      // Arrays.sort(a);

      int count=1;
      for(int i=1;i<a.length;i++){
        if(a[i]==a[i-1]){
            count++;    
        }
        else{
            System.out.println(a[i-1]+"->"+count);
            count=1;
        }
      }
      System.out.println(a[a.length-1]+"->"+count);
    }
}
