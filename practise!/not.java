import java.util.*;
public class not {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
         int a=s.nextInt();
         int f=1;
         for(int i=a;i>0;i--){
               f=i*f;
         }
         System.out.println(f);
    }
}
