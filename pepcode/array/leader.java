package array;
public class leader{
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        int t[]=new int[a.length];
        int j=0;
        // for(int i=0;i<a.length;i++){
        //     boolean l=true;
        //     for(int k=i+1;k<a.length;k++){
        //            if(a[k]>a[i]){
        //             l=false;
        //             break;
        //            }    
        //     }
        //     if(l){
        //         a[j]=a[i];
        //         j++;
        //     }
        // }
        // for(int p=0;p<j;p++){
        //         System.out.println(a[p]);
        // }
        //#optima;
    int m=a[a.length-1];
    t[j]=m;
    j++;
    
        for(int i=(a.length-2);i>=0;i--){
            if(a[i]>m){
                m=a[i];
                t[j]=m;
                j++;
                
            }
        }
        for(int element:t){
            System.out.println(element);    
        }

    }
}