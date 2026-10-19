package exerciseone;
import java.util.*;
public class odd {
    public static int odd(int a){
        for(int i=a;i>0;i--){
            if(i%2!=0){
                System.out.println(i);
            }
            else if(a==0){
                System.out.println("enter an non zero value");   
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int a= s.nextInt();
     System.out.println(odd(a));
        
    }
    
}
