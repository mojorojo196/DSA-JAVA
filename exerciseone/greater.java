package exerciseone;
import java.util.*;
public class greater {
    public static void greater(int a, int b){
        if(a>b){
            System.out.println(a+ "is greater");
        }
        else{
            System.out.println(b + " is greater");
        }
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        greater(a,b);
    }
}
