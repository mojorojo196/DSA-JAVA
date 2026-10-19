package leetcode;
public class maxconone{
    public static void main(String[] args) {
        int a[]={1,1,1,0,1,1,1,1,1};
        // sliding window 

        int i=0;
        int max=0;
        for (int j = 0; j < a.length; j++) {
            if(a[j]==0){
                i=j+1;
            }
            
            max=Math.max(max, j-i+1);
    }
        System.out.println(max);
    }
}