package arraypractise;

import java.util.Arrays;

public class permu {
    public static void main(String[] args) {
        int a[]={1,2,3,4,0};
        System.out.println(Arrays.toString(permu(a)));
    }
    // brtue force approach::
    static int[] permu(int a[]){
        int ans[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i]=a[a[i]];
        }
        return ans;
}
}
