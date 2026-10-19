package recrusion.basic;

public class countzero {
    public static void main(String[] args) {
        System.out.println(count(304005));
    }
    static int count(int num){
        if(num%10==num){
            return 0;
        }
        if(num%10==0){
            return 1 + count(num/10);
        }
    return count(num/10);
}
}
