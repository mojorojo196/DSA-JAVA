package recrusion.basic;
public class num {
    public static void main(String[] args) {
        funboth(5);
    }
    static void funboth(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        funboth(num-1);
        System.out.println(num);
    }
}
