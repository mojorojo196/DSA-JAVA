package leetcode;

public class zeroatend {
    public static void main(String[] args) {
        int a[]={0,1,4,52,0,4,0};
    int j=0;
    // for(int i=0;i<a.length;i++){
    //     if(a[i]!=0){
    //         a[j]=a[i];
    //         j++;
    //     }
    // }
    // for(int i=j;i<a.length;i++){
    //     a[i]=0;
    // }
    //#optimal approach
    for(int i=0;i<a.length;i++){
        if(a[i]!=0){
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
