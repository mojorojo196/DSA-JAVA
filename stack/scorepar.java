package stack;
import java.util.Stack;
public class scorepar {
    public static void main(String[] args) {
        System.out.println(score("(())"));   
    }
    public static int score(String s){

        Stack<Character> st = new Stack<>();
        int score= 0;
        for(int i =0 ; i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else{
                if( !st.isEmpty() && st.peek()=='('){
                score+=1;
                st.pop();
                }
                if( !st.isEmpty() && st.peek()=='('){
                    score+=2;
                    st.pop();
                }
            }
        }
        return score;
    }
}
