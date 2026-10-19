package recrusion;

public class palindromecheck {
    public static void main(String[] args) {
        int[] a={1};
        System.out.println(isPalindrome(a, 0, a.length-1));
    }
    static boolean isPalindrome(int[] a , int left , int right){
        if(left>right){
            return true;
        }
        if(a[left]!=a[right]){
            return false;
        }
        return isPalindrome(a, left+1, right-1);
    }
}
