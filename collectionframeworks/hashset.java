package collectionframeworks;

import java.util.HashMap;
import java.util.HashSet;

import binearqqqq.chartar;

public class hashset {
    public static void main(String[] args) {
        HashSet<Character> s= new HashSet<>();
        String a="pwwekw";

        for(int i=0;i<a.length();i++){
            s.add(a.charAt(i));
            }
            System.out.println(s);
        // s.add(5);
        // s.add(2);
        // s.add(3);
        // s.add(5);
        // System.out.println(s);
        // System.out.println(s.contains(5));
    }
}
