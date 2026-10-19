package arraypattern.slidingwindow;
import java.util.*;

public class Longestworchar {
    public static void main(String[] args) {
        System.out.println(lonSubstrWiRepea("ww"));
    }
    public static int lonSubstrWiRepea(String s){
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int max = 0;
        for(int ri=0;ri<s.length();ri++){
            while (set.contains(s.charAt(ri))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(ri));
            max=Math.max(max, ri-left+1);
        }
        return max;
    }
}
