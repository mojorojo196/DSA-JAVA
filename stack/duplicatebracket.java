package stack;

import java.util.Stack;

public class duplicatebracket {
    public static void main(String[] args) {
        String s = "(a+b)+(c+d)";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println("true");
                    return;
                }
                while(st.peek()!='('){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println("false");

        for(int i=0;i<2;i++){
            System.out.println(i);
            i=0;
        }

    }
}
