package numbersys;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class anytoany {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       System.out.println("enter base ");
       int b=s.nextInt();
       System.out.println("base in which you want to convert");
       int t=s.nextInt();
       int p=1;
       int v=0;
       while(n>0){
          int r=n%t;
          n=n/t;
          v+=p*r;
          p=p*10;
    }
System.out.println(v);
        
    }
}
