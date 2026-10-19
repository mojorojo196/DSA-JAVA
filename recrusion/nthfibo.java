package recrusion;

public class nthfibo {
    public static void main(String[] args) {
        int n=5;
        // for(int i=0;i<10;i++){
        //   System.out.println(fiboformula(i));
        // }
         System.out.println(fiboformula(1000000000));

             System.out.println(chatfibo(10));
    }
    static  long fiboformula(long n){
        //return (int) ((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
                return (long)((Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
    }
    static int fibo(int num){

           //wrong approch  
        // int ans=0;
        // int a=0;
        // int b=1;
        // for(int i=0;i<num;i++){
        //     int c=a+b;
        //     ans+=c;
        //     a=b;
        //     b=c;
        // }
        // return ans;
        if(num<2){
            return num;
        }
          //this is not tail recursion 
        return fibo(num-1) + fibo(num-2);
    }


    static int chatfibo(int n){
        if(n<0){
            return -1;
        }

        if(n==0 || n==1){
            return n;
        }

        return chatfibo(n-1)+chatfibo(n-2);
    }
    
}
