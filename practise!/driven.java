import java.util.Scanner;

public class driven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        do{
            a=s.nextInt();
                if(a==1){
        int m=s.nextInt();
         if(m>=90){
            System.out.println("good");
         }
         else if(m>=60||m<=89){
            System.out.println("good");
         }
         else if(m<=59||m>=0){
            System.out.println("good");
         }
            }
        }while(a==1);
    }
}
