package recrusion.basic;
public class digitpro {
    public static void main(String[] args) {
        System.out.println(pro(1234));
    }
    static int pro(int digit){
        if(digit%10==digit){
            return digit;
        }
        return digit%10 * pro(digit/10);
    }
}