package recrusion.basic;

public class digit {
     public static void main(String[] args) {
        System.out.println(sum(1234));
     }
     static int sum(int digit){
        if(digit==0){
            return 0;
        }
        return digit%10 + sum(digit/10);
     }
}
