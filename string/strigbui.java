package string;

import java.util.Arrays;

public class strigbui {
    public static void main(String[] args) {
            // so this is string builder
        StringBuilder a= new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
           // a+=ch;  //here we cant add elem or char like this 
           a.append(ch);  //we need to use append f(x) that add's elem or char in given string::
        }
        System.out.println(a.charAt(25));
       // System.out.println(a.toString());
      // System.out.println(a.delete(0,20));
      System.out.println(a.isEmpty());
    }
}
