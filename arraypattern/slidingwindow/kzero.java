package arraypattern.slidingwindow;

public class kzero {
    public static void main(String[] args) {
        int a[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;

        int max=0;
        int zerocount=0;

        int left=0;
        
        for(int ri=0;ri<a.length;ri++ ){

            if(a[ri]==0){
                zerocount++;
            }

            while(zerocount>k){
                if(a[left]==0){
                    zerocount--;
                }
                left++;
               
            }

            max=Math.max(max, ri-left+1);

        }
        System.out.println(max);
    }
    
}
