package basicprob;
import java.util.Scanner;

public class digitfreq {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=22222457;
        int count=0;
        while(n%10!=0){
            int rem=n%10;
            if(rem==2){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
