package binearqqqq;

public class searchinroII {
    public static void main(String[] args) {
        int a[]={2,3,4,5,0,0,1};
        int target=0;
    }
    static int searchinRotatedII(int[] a,int target){
        int s=0;
        int e=a.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==target){
                return a[mid];
            }
            if(a[mid]>a[s]){

            }
            
        }

        return -1;
    }
}
