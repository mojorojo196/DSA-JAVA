package string.question;

import java.util.Arrays;

public class sortsentance{
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";

        StringBuilder ans=new StringBuilder();

        String[] word=s.split(" ");
        String[] arranged=new String[word.length];
        for(int i=0;i<word.length;i++){
            int index=word[i].charAt(word[i].length()-1)-'1';
            String goes=word[i].substring(0,word[i].length()-1);
            arranged[index]=goes;
        }
        //System.out.println(Arrays.toString(arranged));

        for(String words: arranged){
            ans.append(words);

            ans.append(" ");
        }
        System.out.println(ans);
    }
}
