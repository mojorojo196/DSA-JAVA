package string.question;

public class vaildpalin2 {
    public static void main(String[] args) {
        // leetcode easy
//  check if string is palindrome if we can remove atmost 1 element for it;
  // if we skip c or b the string is palindrome // i was not able to solve it at first and copypaste solution so this is an red problem::
boolean c=true;

String s="acccbba";
int i =0;
int j=s.length()-1;
while(i<j){
    if(s.charAt(i)==s.charAt(j)){
        i++;
        j--;
    }
    else{
        c=check(s, i+1, j) || check(s,i,j-1);
        // if we never break see nothing is changing like both pointer stay  same and it become an infinite loop
       break;
    }

}
System.out.println(c);

    }
    static boolean check(String a,int left,int right){
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
