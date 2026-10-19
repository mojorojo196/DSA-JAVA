package basic;
import java.util.Scanner;

public class feetandin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int s1=s.nextInt();
        int s2=s.nextInt();
        getdata(s1, s2);
      
    }
    static void getdata(int f,int i){

        int feet=f;
        int inch=i;
        if(inch>12){
            feet++;
          inch=inch-12;
        }
        System.out.println(feet+"."+inch);
        
    }
}
