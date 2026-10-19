package recrusion;

import java.util.Arrays;

public class revstring {
    public static void main(String[] args) {
          char[] s = {'h','e','l','l','o'};
            rev(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }
    public static void rev(char[] c , int left ,int right){

        if(left>right){
            return;
        }
        // if(s.length()==0){
        //     return "";
        // }

        // return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));

        char temp = c[left];
        c[left]=c[right];
        c[right]=temp;
        rev(c,left+1,right-1);
    }
}








