package basicprob;
public class digitofnum {
    public static void main(String[] args) {
       int n=123456;
       // int rem;
       while(n%10!=0){
           int rem=n%10;
           n=n/10;
 System.out.println(rem);
       }
      
        
    }
}
