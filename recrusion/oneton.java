package recrusion;

import arraypractise.primenuminrange;

public class oneton {
    
public static void main(String[] args) {
   System.out.println( printNumbers(1));
}
    static int printNumbers(int n) {
        
        if(n<=0){
            return 1;
        }
        return n * printNumbers(n-1);
    }
}
