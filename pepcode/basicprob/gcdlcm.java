package basicprob;
import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int orn=n;
        int orm=m;
        while(n%m!=0){
             int rem=n%m;
             n=m;
             m=rem;
        }
        int gcd=m;
        int lcm=(orn * orm)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
