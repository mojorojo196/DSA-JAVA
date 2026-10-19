package numbersys;
public class dectobin {
    public static void main(String[] args) {
      int a=12;
      int p=1;
      int v=0;
      while(a>0){
         int r=a%8;
         a=a/8;
         v+=p*r;
         p=p*10;

      }
      System.out.println(v);  
    }

}