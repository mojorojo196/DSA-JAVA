package arraypattern.prefixsum;
import java.util.*;
public class longestsubk {
    


    public static void main(String[] args) {
        int[] a={10,5,1,7,2,-10};
        int k=15;
        System.out.println(longestsubarr(a,k));
    }


    public  static int longestsubarr(int[] a,int k){
        int maxlen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixsum=0;
        for(int i=0;i<a.length;i++){
            prefixsum+=a[i];
            if(prefixsum==k){
                maxlen=Math.max(maxlen, i+1);
            }
            else if(map.containsKey(prefixsum-k)){
                maxlen=Math.max(maxlen,i-map.get(prefixsum-k));
            }
            // store first occuring index
            if(!map.containsKey(prefixsum)){
                map.put(prefixsum, i);
            }

        }

        




        return maxlen;
    }
}
