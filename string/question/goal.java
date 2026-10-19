package string.question;

public class goal {
    public static void main(String[] args) {
        String s="G()(al)";
        StringBuilder a= new StringBuilder();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='G'){
            a.append("G");
           }
           else if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
            a.append("o");
            i++;
           }
           else{
            a.append("al");
            i+=3;
           }
        }
        System.out.println(a);
    }
    // static String gol(String a,char b){
    //     // if(b==){

    //     // }
    // }
}
