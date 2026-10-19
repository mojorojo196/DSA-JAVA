package exerciseone;
import java.util.*;
public class three{
    public static int avg(int a,int b, int c){
        return (a+b+c)/3;

    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
     int b=s.nextInt();
     int c=s.nextInt();
System.out.println(avg(a,b,c));
    }
}