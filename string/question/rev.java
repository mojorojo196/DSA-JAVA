package string.question;

import array.sumoftwoarr;

public class rev {
    public static void main(String[] args) {

        String a="mojorojo";
        System.out.println(revString(a));
     char[] s={'e','r','e'};
     System.out.println(s.length);
    }
    static String revString(String a){
char[] look=a.toCharArray();
        int i=0;
        int j=look.length-1;
        while(i<j){
            char temp=look[i];
            look[i]=look[j];
            look[j]=temp;

            i++;
            j--;
        }
    return new String(look);
    }
}
