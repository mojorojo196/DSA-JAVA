package arraypattern.twopointer;

import java.util.Arrays;

public class cookies {
    public static void main(String[] args) {
        int g[]={1,2,3};
        int s[]={1,1,2,5,8};

        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
                i++;
            }
            j++;
        }
        System.out.println(count);

    }
}
