package recrusion.basic;

public class linearse {
    public static void main(String[] args) {
        System.out.println(linearsearch(new int[]{1,2,3,4,58,5},0,58));
    }
    static int linearsearch(int[] a , int index , int target){
        if(index==a.length){
            return -1;
        }
        if(a[index]==target){
            return index;    
        }
        return linearsearch(a, index+1, target);
    }
}
