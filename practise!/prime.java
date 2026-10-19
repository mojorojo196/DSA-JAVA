import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                System.out.println(a +" not prime");
            }
            else{
                System.out.println(a +" is prime");
            }
            break;
        }
    }
}
