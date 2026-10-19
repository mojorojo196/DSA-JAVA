package string.question;

public class rotatestring {
    public static void main(String[] args) {
        String s="abcde";
        String goal="bcde";
    

        System.out.println(rotatedornot(s, goal));
        
    }
    static boolean rotatedornot(String s,String goal){
    //     for(int i=0;i<s.length();i++){
    //         String rotate=s.substring(1)+s.charAt(0);
    //         if(rotate.equals(goal))return true;
    //     }
    //   return false;
    return s.concat(s).contains(goal);
    }
}
