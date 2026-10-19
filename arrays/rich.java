package arrays;

public class rich {
    public static void main(String[] args) {
        int a[][]={
        {1,2},
        {1,2},
        {1,2}
        };
        int rich=0;
        for (int i = 0; i < a.length; i++) {
           int sum=0;
           for (int j = 0; j < a.length; j++) {
            sum+=a[i][j];
           }
           if(sum>rich){
            rich=sum;
           }
        }
        System.out.println(rich);
    }
}
