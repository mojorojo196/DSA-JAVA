package arraypattern.slidingwindow;

import java.util.HashMap;

public class fruit {
 public static void main(String[] args) {
    
      int nums[]={3,3,3,1,2,1,1,2,3,3,4};
      int mx=0;
      int l=0;
           HashMap<Integer,Integer> n=new HashMap<>();
           for(int r=0;r<nums.length;r++){
            n.put(nums[r],n.getOrDefault(nums[r],0)+1);
               while(n.size()>2){
                   n.put(nums[l], n.get(nums[l])-1);
                   if(n.get(nums[l])==0) {
                    n.remove(nums[l]);
                   }
                   l++;
               }
               mx=Math.max(mx,r-l+1);
            }
           
           System.out.println(mx);
 }   
}
