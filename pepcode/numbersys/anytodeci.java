package numbersys;

public class anytodeci {
    public static void main(String[] args) {
       int a=54;
       int p=1;
       int v=0;


       while(a>0){
          int r=a%2;
          a=a/2;
          v+=r*p;
          p=p*10;

    
    }
    System.out.println(v); 
    }
}
