package recrusion;

public class maxinarr {
    public static void main(String[] args) {
        System.out.println(max( new int[]{-1,-2,-8,-3,2}, 0));
    }
    static int max(int[] a, int index){
       
        if(index==a.length-1){
            return a[index];
        }
        return Math.max(a[index],max(a,index+1));
    }
}
