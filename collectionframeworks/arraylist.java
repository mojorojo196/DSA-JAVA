package collectionframeworks;

import java.util.*;

public class arraylist {
    public static void main(String[] argu){
                                    //constructor
        // ArrayList<Integer> list= new ArrayList<>(10);
     Scanner s=new Scanner(System.in);
        // for(int i=0;i<5;i++){
        //     // input element using loop
        // // add use to add elem in arraylist
        //     list.add(s.nextInt());
            
        // }
        //         // get use to get element at specific index
        // System.out.println(list.get(2));

        //        ///this is multi demensional arraylist
    
        //ArrayList<ArrayList<Integer>> l= new ArrayList<>();
        //intiallizing  just like we did for 2d arrays row and column
    //     System.out.print("enter size:");
    //    int a=s.nextInt();
    //     for(int i=0;i<a;i++){
    //         l.add( new ArrayList<>());
    //     }

    //     // addinf element 
    //     for(int i=0;i<a;i++){
    //         for(int j=0;j<a;j++){
    //              l.get(i).add(s.nextInt());
    //         }
    //     }
    //     System.out.print(l);
    //  List<Integer> list = new ArrayList<>();
    //  list.add(1);
    //  list.add(2);
    //  list.add(3);
    // //  for(Integer i : list){
    // //     if(i==1){
    // //         list.remove(i);
    // //     }
    // //  }

    // for (int i = list.size() - 1; i >= 0; i--) {
    // // Check your condition here
    // if (list.get(i).equals(1)) {
    //     list.remove(i); // This is now 100% safe!
    // }

    // int[] a = {4,2,7,7,4,2,5};
    // HashMap<Integer,Integer> map = new HashMap<>();
    // for(int elem: a){
    //     map.put(elem,map.getOrDefault(elem,0)+1);
    // }

    // for(int i=0;i<a.length;i++){  // not map ki size ke
    //     if(map.get(a[i])==1){
    //         System.out.println(a[i]);
    //         return;
    //     }
    // }
    int[]nums = {2, 7,7, 11, 15};
    Arrays.sort(nums);
    int target = 9;
   // System.out.println(Arrays.toString(twosum(nums, target)));
   //System.out.println(appear(nums));
   System.out.println(firstnonrepeating(nums));
    

}


public static int firstnonrepeating(int[] a){
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i : a) {
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(int i=0;i<a.length;i++){
        if(map.get(a[i])==1){
            return a[i];
        }
    }

    return -1;
}

public static int appear(int[] a){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int elem : a){
        if(map.containsKey(elem)){
            return elem;
        }
        map.put(elem,map.getOrDefault(elem,0)+1);
    }

    return -1;
}

public static int[] twosum(int[] a,int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    // for (int i=0;i<a.length;i++) {
    //     map.put(a[i], map.getOrDefault(a[i],0)+1);
    // }
    for(int i=0;i<a.length;i++){
        int ans=target-a[i];
        if(!map.containsKey(ans)){
           map.put(a[i],i );
        }
        else{
            return new int[]{map.get(ans),i};
        }
    }
    return new int[]{};


}
     

        

    }
