package basicprob;
public class digitcount {
    public static void main(String[] args) {
      //  int n=1234515646;
      //  //every digit divide by 10 it trims out the last digit :
      //  int count=0;
      //  while(n%10!=0){
      //    int rem=n%10;
      //     n=n/10;
      //    count++;
      //  }
      //  System.out.println(count);
      int n=123450;
      int sum=0;
      while(n!=0){
        int digit=n%10;
        sum+=digit;
        n=n/10;
      }
      System.out.println(sum);
    }
}
