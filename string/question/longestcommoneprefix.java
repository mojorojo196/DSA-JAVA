package string.question;

import string.string;

public class longestcommoneprefix {
    public static void main(String[] args) {
        String[] s={"flower","flo","flower"};

        StringBuilder ans=new StringBuilder();
        for(int i=0 ; i<s[0].length();i++){ // if i write s[i] then when i become more then s.len() it will also give inx out of bound error:
            boolean a= true;
          for(int j=1;j<s.length;j++){ // j is 
            if(i>= s[j].length() || s[j].charAt(i)!=s[0].charAt(i)){   // here was the error if an elem's len is small then elem on 0th idx it will give error indexoutof bound
                a=false;
                break;
            }
          }
          if(a){
            ans.append(s[0].charAt(i));
          }
          else{
            break;
          }
        }
        System.out.println(ans);
    }
}
