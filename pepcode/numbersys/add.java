package numbersys;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
      int a=236;
      int b=754;
      int c=0;
      int p=1;
      int v=0;
      while(a>0 || b>0||c>0){
        int d1=a%10;
        int d2=b%10;
        a=a/10;
        b=b/10;
        int su=d1+d2+c;
        c=su/8;
        su=su%8;
        v+=su*p;
        p=p*10;
      }
      System.out.println(v);


        









    }
}
