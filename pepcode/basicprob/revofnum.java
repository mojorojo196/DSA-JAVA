package basicprob;
import java.util.Scanner;
public class revofnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=123456789;
        while (n%10!=0) {
            int rem=n%10;
            n=n/10;
            System.out.print(rem);   
        }
    }

}