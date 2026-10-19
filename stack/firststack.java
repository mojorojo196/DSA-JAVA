package stack;

import java.util.Stack;

import string.output;

public class firststack {
    // implimentation
    int size=5;
    int[] stack = new int[size];
    int top=-1;

    void push(int value){
        if(top<size-1){
            top++;
            stack[top]=value;
        }
        else{
            System.out.println("overflow");
            return;
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("underflow");
            return -1;
        }
        int val=stack[top];
        top--;
        return val;
        
    }

    int peek(){
         if(top==-1){
            System.out.println("underflow");
            return -1;
         }
         return stack[top];  
    }
    public static void main(String[] args) {
    //     firststack obj1= new firststack();
    //     obj1.push(20);
    //     obj1.push(30);
    //     obj1.push(40);
    //     obj1.push(50);
    //     obj1.push(60);

    //    System.out.println( obj1.pop());

    //     System.out.println(obj1.peek());
    Stack<Integer> st= new Stack<>();
    //System.out.println(st.pop()); // error as stack is empty 
    st.add(0,50);
    st.add(0,0);
    System.out.println(st.size());
    }
}
