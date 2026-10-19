package stack;

public class Backspace {
    public static void main(String[] args) {
        String s="ab#c";
        String t="ad#c";
        System.out.println(backspace(s,t));
    }
    static boolean backspace(String s,String t){
        StringBuilder fors = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                fors.deleteCharAt(fors.length()-1);
            }
            else{
                fors.append(s.charAt(i));
            }
        }

        StringBuilder fort = new StringBuilder();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                fort.deleteCharAt(fort.length()-1);
            }
            else{
                fort.append(t.charAt(i));
            }
        }
        return fors.toString().equals(fort.toString());

    }
}
