package arraypractise;
public class houserobber {
    public static void main(String[] args) {
        int nums[]={2,7,9,3,1};
         int n=nums.length;
        int i=0;
        int j=1;
        int odd=0;
        int even=0; 
        while(i<n || j<n){
            /// this wont work cause this question using dynamic programming 
            odd+=nums[j];
            even+=nums[i];
            i=i+2;
            j=j+2;
        }
        int max=0;
        if(odd>even){
            max=odd;
        }
        else{
            max=even;
        }
        System.out.println(max);
    }
}
