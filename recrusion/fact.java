package recrusion;

public class fact {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int num){
        if(num<=2){
            return num;
        }
        return num * fact(num-1);  ///cnt call fact(num) * fact(num-1)  bhai fact(num) ka hi nikal rahe hai tu usko hi call kaega toh infinite calling hogi error aajayga  
    }
}
