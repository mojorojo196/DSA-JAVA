import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("enter your operation +,-,*,/,%");
        int c=s.nextInt();
        // int su=a+b;
        // int mi=a-b;
        // int mu=a*b;
        // int di=a/b;
        // int mo=a%b;
        switch (c) {
            case 1:
                System.out.println(a+b);
                break;
        case 2:
        System.out.println(a-b);
        break;
        case 3:
        System.out.println(a*b);
        break;
        case 4:
        System.out.println(a/b);
        break;
        case 5:
        System.out.println(a%b);
        break;
            default:
    System.out.println("enter an valid operator");
        }
    }
}
