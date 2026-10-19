package recrusion;

public class sumofarr {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5},0));
    }
    static int sum(int[] a,int index){
        if(index==a.length){
            return 0;
        }
        return a[index] + sum(a,index+1);
    }
}
