package string.stringpattern.slidingwindow;

import java.util.HashSet;
import java.util.LinkedList;

import arrays.cwh.sumofarray;

public class longsubwrchar {
    public static void main(String[] args) {
        // Given a string s, find the length of the longest substring without duplicate characters.
        // Input: s = "pwwkew"
        // Output: 3
        // Explanation: The answer is "wke", with the length of 3.
        // Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    //     String s="pwwe";
    //      int mx=0;
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i;j<s.length();j++){
               
    //             if(isdupli(s,i,j)){
    //                 break;
    //             }
    //             else{
    //                 mx=Math.max(mx, j-i+1);
    //             }
    //         }
        
    //     }
    //     System.out.println(mx);
    // }
    // static boolean isdupli(String a,int i,int j){
    //     for(int k=i;k<=j;k++){
    //         for(int z=k+1;z<=j;z++){
    //             if(a.charAt(k)==a.charAt(z)){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    String s="pwwkew";
    // O(n^2)
    //     int max = 0;
    
    // for (int i = 0; i < s.length(); i++) {
        
    //     HashSet<Character> set = new HashSet<>();
    
    //     for (int j = i; j < s.length(); j++) {
        
    //         // What should we check here? 
    //         if(set.contains(s.charAt(j))){
        
    //             break;
    
    //         }
    //         set.add(s.charAt(j));
    
    //         max=Math.max(max,j-i+1);
    
    //         // If character is not duplicate...
    
    //         // Add it
    
    //         // Update max
    //     }
    // }
    // System.out.println(max);
       

    
    // optimal using sliding window and creating hashmet to manage duplicate 
     int left=0;
     int max=0;
     HashSet<Character> a=new HashSet<>();
     for(int rigth=0;rigth<s.length();rigth++){
 
         while(a.contains(s.charAt(rigth))){
             a.remove(s.charAt(left));
             left++;
         }
         a.add(s.charAt(rigth));
         max=Math.max(max, rigth-left+1);
     }
     System.out.println(max);
    
    }
    }

