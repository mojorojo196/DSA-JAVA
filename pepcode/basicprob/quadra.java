package basicprob;

import java.util.ArrayList;

public class quadra {
    public static void main(String[] args) {
        int a=1, b=-2,c=1;
        ArrayList<Integer> ans=new ArrayList<>();

        int dis=(b*b)-(4*a*c);
        if(dis==0){
            ans.add(-(b)/2*a);
            ans.add(-(b)/2*a);
        }
        
        }
} 
