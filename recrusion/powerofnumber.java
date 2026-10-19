package recrusion;

public class powerofnumber {
    


    //power(2,4)

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    public static double power(int x,int n){
        if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
}
