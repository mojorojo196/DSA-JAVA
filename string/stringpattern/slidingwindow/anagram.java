package string.stringpattern.slidingwindow;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
            // Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
            //Example 1:
            //
            //Input: s = "cbaebabacd", p = "abc"
            //Output: [0,6]
            //Explanation:
            //The substring with start index = 0 is "cba", which is an anagram of "abc".
            //The substring with start index = 6 is "bac", which is an anagram of "abc".

        String  s = "cbaebabacd";
        String a="abc";
        HashMap<Character,Integer> n= new HashMap<>();
        for(int i=0;i<a.length();i++){
            n.put(a.charAt(i), n.getOrDefault(a.charAt(i),0)+1);
        }
      int l=0;
      
      }

        


    }
