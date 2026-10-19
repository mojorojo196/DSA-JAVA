package recrusion.basic;

public class issorted {
    public static void main(String[] args) {
        System.out.println(check(new int[]{1,2,3,6,9}, 0));
    }
    static Boolean check(int[] a , int index){
       if(index==a.length-1){
        return true;
       }
       if(a[index]>a[index+1]){
        return false;
       }

       return check(a,index+1);
    }
}
