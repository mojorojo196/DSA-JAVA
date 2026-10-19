package array;

public class zero {
    public static void main(String[] args) {
        int a[]={1,0,4,0,6,0,8};
        int j=0;
        
        // for(int i=0;i<a.length;i++){
        //     if(a[i]!=0){
        //         a[j]=a[i];
        //         j++;
        //     }
        // }
        // for(int k=j;k<a.length;k++){
        //         a[k]=0;
        // }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }
    for(int element: a){
        System.out.println(element);
    }
    }
}
