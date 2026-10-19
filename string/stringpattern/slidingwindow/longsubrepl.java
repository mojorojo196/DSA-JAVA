package string.stringpattern.slidingwindow;

import java.util.Collections;
import java.util.HashMap;

public class longsubrepl {
    public static void main(String[] args) {
        //424. Longest Repeating Character Replacement
        //You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
        //Return the length of the longest substring containing the same letter you can get after performing the above operations.
     //Input: s = "ABAB", k = 2
     //Output: 4
     //Explanation: Replace the two 'A's with two 'B's or vice versa.   
     String s="AABABBA";
     int k=1;

     HashMap<Character,Integer> n=new HashMap<>();
     int max=0;
     int l=0;

     for(int r=0;r<s.length();r++){
        n.put(s.charAt(r),n.getOrDefault(s.charAt(r), 0)+1);
        int maxval=Collections.max(n.values());
        while((r-l+1)-(maxval)>k){
            n.put(s.charAt(l), n.get(s.charAt(l))-1);
            l++;
        }
        max=Math.max(max,r-l+1);

     }
System.out.println(max);
    }
}
