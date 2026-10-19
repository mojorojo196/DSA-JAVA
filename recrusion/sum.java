
package recrusion;
public class sum {
    public static void main(String[] args) {
        System.out.println(sum(-18));
    }
    static int sum(int n){
        if(n<=0){
            return n;
        }
        return n + sum(n-1);
    }
}
