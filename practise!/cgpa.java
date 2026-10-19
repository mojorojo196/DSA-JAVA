import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int p=(a+b+c)*(100)/300;
        System.out.println(p);
    }
}
