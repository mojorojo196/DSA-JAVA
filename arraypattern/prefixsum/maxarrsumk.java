package arraypattern.prefixsum;

import java.util.HashMap;
import java.util.stream.Gatherer.Integrator;

public class maxarrsumk {
    public static void main(String[] args) {
        int a[]={1,2,1,0,0,0,0,0};
        int k=3;

        HashMap<Integer,Integer> n = new HashMap<>();
        n.put(0, 1);
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(n.containsKey(sum-k)){
                count++;
            }
            n.put(sum,n.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}