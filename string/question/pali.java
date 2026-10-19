package string.question;

public class pali {
    public static void main(String[] args) {
           // check wheter string is palindrome or not 
        String a="A man, a plan, a canal: Panama";
        System.out.println(ispalindrome(a));
       // System.out.println(Character.isLetterOrDigit(a.charAt(5)));  this f(x) checks that is an character in string is letter or digit or not 
    }
      // 
    static boolean ispalindrome(String s){
        // int i=0;
        // int j=a.length()-1;
        // while(i<j){
        //     if(a.charAt(i)==a.charAt(j)){
        //         i++;
        //         j--;
        //     }
        //     else{
        //         return false;
        //     }
        // }

        // return true;
        s=s.toLowerCase();
        if(s== null || s.length()==0){
            return true;
        }   
      int start=0;
      int end=s.length()-1;
 
      while(start<end){
        if(!Character.isLetterOrDigit(s.charAt(start))){
            start++;
            continue;
        }
        else if(!Character.isLetterOrDigit(s.charAt(end))){
            end--;
            continue;
        }
        if(s.charAt(start)==s.charAt(end)){
            start++;
            end--;
        }
        else{
            return false;
        }
        
      }
      return true;
    }
}
