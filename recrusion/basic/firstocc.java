package recrusion.basic;

public class firstocc {



    public static void main(String[] args) {
        System.out.println(firstoc(new int[]{1,2,3,6,6,9}, 6, 5));
    }
    
    static int firstoc(int[] a ,int target,int index){
        if(index<0){
            return -1;
        }
        if(a[index]==target){
            return index;
        }
        return firstoc(a,target,index-1);
    }
}
