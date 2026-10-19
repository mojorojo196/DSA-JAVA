package stack;

import java.util.Stack;

public class validpr {
    public static void main(String[] args) {
        String s="(){}[]";
        if(s.length()%2!=0){
            System.out.println("false");
            return;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            
            else{
                if(st.isEmpty()){
                    System.out.println("false");
                    break;
                }
                char top=st.pop();
                
                if(ch=='}' && top!='{' || ch==']' && top!='[' || ch==')' && top!='('){
                    System.out.println("false");
                    break;
                }
                
            }
            
        }
        if(!st.isEmpty()){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }   
}
