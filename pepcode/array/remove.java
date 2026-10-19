package array;

public class remove {
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,4,4,5};
        int val=2;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val){
                a[j]=a[i];
                j++;
            }
        }
        for(int k=0;k<j;k++){
            System.out.println(a[k]);
        }
    }
    
}
