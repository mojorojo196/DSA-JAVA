package arraypattern.slidingwindow;
public class beutiful {
    public static void main(String[] args) {
        String s="100011001";
        int k=3;
         int n=s.length();
        String ans="";
        int onecount=0;
        int left=0;
        for(int ri=0;ri<n;ri++){
            if(s.charAt(ri)=='1'){
                onecount++;
            }
            while(onecount>=k){
                if(onecount==k ){
                ans=s.substring(left,ri+1);
                }
                if(s.charAt(left)=='1'){
                    onecount--;
                }
                left++;
            }

        }
    }
}
