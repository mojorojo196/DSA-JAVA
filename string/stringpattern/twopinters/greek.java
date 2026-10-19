package string.stringpattern.twopinters;

import java.util.Arrays;

public class greek {
    public static void main(String[] args) {
        String s="..geeks..for.geeks.";
              // logic yi nhi ban raha 
        String[] a=s.split("\\.");
        System.out.println(Arrays.toString(a));
        StringBuilder ans=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            ans.append(a[i]);
            if(i>0){
                ans.append(".");
            }
        }
        System.out.println(ans);
    }
}
