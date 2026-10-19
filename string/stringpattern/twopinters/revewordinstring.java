package string.stringpattern.twopinters;

import java.util.ArrayList;
import java.util.LinkedList;

public class revewordinstring {
    public static void main(String[] args) {
         //Input: s = "a good   example"
         //Output: "example good a"
         //Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
         String s="a good   example";
         s=s.strip();
         String a[]=s.split("\\s+");
         ArrayList<String> n=new ArrayList<>();
         for (int i = a.length-1; i >=0; i--) { 
          
          n.add(a[i]);
         }
         System.out.println(String.join(" ",n));  
    
        


    }


    }

