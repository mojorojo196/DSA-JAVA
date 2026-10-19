package string.stringpattern.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        String s1="abc";
        String s2="eidbacooo";
        System.out.println(check(s1, s2));
         
    }   
    static boolean check(String s1,String s2){
        // ArrayList<Character> n= new ArrayList<>();
        // for(int i=0;i<s1.length();i++){
        //     n.add(s1.charAt(i));
        // }
        // for(int i=0;i<=s2.length()-s1.length();i++){
        //     boolean a= true;
        //     for(int j=i;j<s1.length()+i;j++){
        //         if(!n.contains(s2.charAt(j))){
        //             a=false;
        //         }
               
        //     }
        //     if(a==true){
        //         return true;
        //     }
        // }
        // return false;
          // brute force
        // char[] a=s1.toCharArray();
        // Arrays.sort(a);
        // for(int i=0;i<=s2.length()-s1.length();i++){
        //    String s= s2.substring(i,s1.length()+i);
        //    char[] b=s.toCharArray();
        //    Arrays.sort(b);
        //    if(Arrays.equals(a, b)){
        //     return true;
        //    }
            
        // }
        // return false;

        
         
        
    }
}
