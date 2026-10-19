package string.question;

import java.util.*;

public class keyval {
    public static void main(String[] args) {
        
        List<List<String>> n=List.of(
            List.of("phone","blue","pixel"),
            List.of("computer","silver","lenovo"),
            List.of("phone","gold","iphone")
        );
        String rulekey="color";
        String rulevalue="silver";

        // int count=0;
         // wrong logic 
        // for(int i=0;i<n.size();i++){
        //     for(int j=0;j<n.get(i).size();j++)
        //         {
        //             if(n.get(i).get(j).equals(rulevalue)){
        //                 count++;
        //             }
        //         }

        // }
        // System.out.println(count);
        int index=0;
        int count=0;
        switch (rulekey) {
            case "color":
                index=1;
                break;
            case "name":
                index=2;
                break;
        }

        for(int i=0;i<n.size();i++){
            if(n.get(i).get(index).equals(rulevalue)){
                count++;    
            }

        }
        System.out.println(count);
    }
}
