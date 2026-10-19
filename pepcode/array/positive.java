package array;

public class positive {
    public static void main(String[] args) {
        int a[]={5,-2,8,-1,7,-3,4};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
