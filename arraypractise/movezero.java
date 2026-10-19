package arraypractise;

public class movezero {
    public static void main(String[] args) {
         int a[]={1,1,0,2,0,4,0,5,0,2};
       int j=0;
       for (int i = 0; i < a.length; i++) {
         if(a[i]!=0){
            a[j]=a[i];
            j++;
         }
       }
       for (int i = j; i < a.length; i++) {
        a[i]=0;
       }
       for (int i = 0; i < a.length; i++) {
           System.out.print(a[i]+" ");
       }
    }
}
