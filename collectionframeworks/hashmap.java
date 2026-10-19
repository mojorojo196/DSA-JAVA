package collectionframeworks;

import java.util.HashMap;
import java.util.*;



public class hashmap {
  public static void main(String[] args) {
         //hashmap are unordered map ::
         Scanner s=new Scanner(System.in);
    HashMap<Integer,Integer> a=new HashMap<>();

    //insertion
           a.put(1, 50);
         
    
    // for (int i = 0; i < 3; i++) {
    //    int key=s.nextInt();

    //    int val=s.nextInt();

    //    a.put(key, val);
    // }

    // it is mutable we can change it's value::
    a.put(4, 4); // four does not exist name key and value will be added   || or if it exist than it will be updated
   // System.out.println(a);

     // search
     System.out.println(a.containsKey(1)); // it will give true if key exist or present || if key is not present it will give false:::

     // if we want to get value of an particular key 

     // use get();
     System.out.println(a.get(1));  // it will give value present at that key::  || if key does not exist then it will give null

     // iteration in hashmap::
              //  this is set of all the key and value
    //  for (Map.Entry<Integer,Integer> e : a.entrySet()) {
    //     System.out.println(e.getKey());
    //     System.out.println(e.getValue());
    //  }

        // set of only keys

        //   Set<Integer> key=a.keySet();
        //  for (Integer integer : key) {
        //      System.out.println(integer +" "+ a.get(integer));
        //  }

        // remove 
         a.remove(1); // this will remove both key and value:::

  }  
}
