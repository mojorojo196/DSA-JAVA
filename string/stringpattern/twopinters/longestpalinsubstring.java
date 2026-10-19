package string.stringpattern.twopinters;

import string.string;

public class longestpalinsubstring {
    public static void main(String[] args) {
       // Given a string s, return the longest palindromic substring in s.
       //Example 1:
       //
       //Input: s = "babad"
       //Output: "bab"
       //Explanation: "aba" is also a valid answer.
       // for (int i = 0; i < s.length(); i++) {
       //     for (int j = i; j < s.length(); j++) {
       //         System.out.print(s.charAt(j));
       //     }
       //     System.out.println();
       // }
             // correct brute force , without third loop 
       String s="cbbc";
    String n="";//new String(); this is bad prctise and String pool ke bahar object banane ke liye hua ye and we dont want that so 
      for(int i=0;i<s.length();i++){
         // StringBuilder m=new StringBuilder();
          for(int j=i;j<s.length();j++){ 
     //    for(int k=i;k<=j;k++){   we didnt really need this  the third loop is used for printing and we don't need to print any thing here  //    m.append(s.charAt(j));  //    }
     if(ispalin(s, i, j) && n.length()<j-i+1){ /// ye line bhul gaya tha window size or substring ke length
         n=s.substring(i,j+1);  /// so this substring give from i to j-1 it excudeed j , j ko nahi leta hai yee 
     }//beginIndex and extends to the character at index endIndex - 1
          }
        }
        System.out.println(n);
     }
    static boolean ispalin(String s,int i,int j){
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
