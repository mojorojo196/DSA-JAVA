package recrusion.basic;

public class n {
    public static void main(String[] args) {
        prin(5);
    }
    static void prin(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
      //  prin(num--); // it will not work because it will pass the same value of num to the next function call. so it will be infinite loop , first pass then subraact 
      prin(--num);  // this will work perfectly because it will pass the decremented value of num to the next function call.
    }
}
