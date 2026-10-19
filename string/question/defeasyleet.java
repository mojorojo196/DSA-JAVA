package string.question;

import arrays.cwh.sumofarray;

public class defeasyleet {
    public static void main(String[] args) {
        //Input: address = "1.1.1.1"
        //Output: "1[.]1[.]1[.]1"
        String s="1.1.1.1";
      // System.out.println( s.replace(".","[.]"));
      StringBuilder a= new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='.'){
        a.append("[.]");
        }
        else{
          a.append(s.charAt(i));
        }
      }
       System.out.println(a);
        }     
    }

