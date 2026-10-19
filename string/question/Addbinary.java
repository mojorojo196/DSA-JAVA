package string.question;

public class Addbinary {
    public static void main(String[] args) {
        String a="11";
        String b="11";
        System.out.println(addBinaString(a, b));
    }
    static String addBinaString(String s1 , String s2){
        StringBuilder ans = new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;

        int carry = 0;

        while (i>=0 || j>=0 || carry!=0) {
            if(i>=0){
                carry+=s1.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                carry+=s2.charAt(j) - '0';
                j--;
            }
            ans.append(carry%2);
            carry=carry/2;
        }

        return ans.reverse().toString();
    }
}
