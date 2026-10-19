package string;

public class performance {
    public static void main(String[] args) {
           //// print all letters 
        String a="";
               // this will give O(n^2) waste of memory happening here 
        for (int i = 0; i <26; i++) {
           char ch= (char)('a'+i); // a is an char so we take an char and plus everytime by one ASCII value right:: 
          // System.out.println(ch);
          a+=ch; // adding this char to a which is an string
         // we are concadenating basically  
        }
        System.out.println(a);
     //  System.out.println(a.charAt(10));

         /// so we can use stringbuilder that help create ane object only and changes happens in that only 
      }
    
}
