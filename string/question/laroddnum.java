package string.question;
public class laroddnum {
    public static void main(String[] args) {
        //1903. Largest Odd Number in String
//         You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

// A substring is a contiguous sequence of characters within a string.
    String s="523";
    int n=s.length();
    String a="";
    for (int i =n-1; i >=0; i--) {
        if(s.charAt(i)%2!=0){
            a+=s.substring(0,i+1);
            break;
        }
        
        
    }
System.out.println(a);

    }
}
