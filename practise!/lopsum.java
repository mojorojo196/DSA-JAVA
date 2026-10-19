import java.util.Scanner;

public class lopsum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=1;
        for(int i=n;i>0;i--){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
