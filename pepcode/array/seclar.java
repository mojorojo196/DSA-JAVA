package array;

public class seclar {
    public static void main(String[] args) {
        int a[]={1,4,9,5};
        int max=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                seclar=max;
                max=a[i];
            }
            else if(a[i]>seclar && a[i]!=max){
                seclar=a[i];
            }
        }
        System.out.println(max );
        System.out.println(seclar);
    }
}
