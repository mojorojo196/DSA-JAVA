package string.question;

import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        String a="aiohn";
        System.out.println(a.indexOf('n'));
        int[] b={3,1,4,2,0};

        char c[]=new char[b.length];
        for (int i = 0; i <a.length(); i++) {
           char ch=a.charAt(i);
           int targetin=b[i];

           c[targetin]=ch;
        }
        System.out.println(String.valueOf(c));
    }
}
