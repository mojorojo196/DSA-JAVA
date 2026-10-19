package basicprob;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        while(n%m!=0){
            int rem=n%m;
            m=rem;
            n=m;
        }
    int gcd=m;
    System.out.println(gcd);
    }
}
