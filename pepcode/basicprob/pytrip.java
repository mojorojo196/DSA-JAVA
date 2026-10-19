package basicprob;
import java.util.Scanner;

public class pytrip {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max;
        if(a>b && a>c){
            max=a;
            if(a*a==b*b + c*c){
                  System.out.println("right triangle");
            }
            else{
                System.out.println("no");
            }
        }
        else if(b>a && b>c){
            max=b;
            if(b*b==a*a+c*c){
                System.out.println("right triangle");
            }
            else{
                System.out.println("no");
        }
    }
        else{
            max=c;
            if(c*c==a*a+b*b){
                System.out.println("right triangle");
            }
              else{
                System.out.println("no");
        }

        }

    }
}
