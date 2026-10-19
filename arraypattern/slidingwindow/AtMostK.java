package arraypattern.slidingwindow;

import java.util.*;

public class AtMostK {
    public static void main(String[] args) {
        System.out.println(longestLen(new int[]{1,2,1,3,3}, 2));
    }
    public static int longestLen(int[] a , int k){
        int max=0;
        // for(int i = 0 ; i<a.length;i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j=i;j<a.length;j++){
        //         set.add(a[j]);
        //         if(set.size()<=k){
        //             max=Math.max(max, j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return max;
        HashMap<Integer,Integer> map = new  HashMap<>();
        int left = 0;
        for(int ri=0;ri<a.length;ri++){
            map.put(a[ri],map.getOrDefault(a[ri],0)+1);
            while(map.size()>k){
                map.put(a[left],map.get(a[left])-1);
                if(map.get(a[left])==0){
                    map.remove(a[left]);
                }
                left++;
            }
            max=Math.max(max, ri-left+1);
        }
        return max;
    
    }
}
