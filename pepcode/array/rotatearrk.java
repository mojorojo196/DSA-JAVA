package array;

public class rotatearrk {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7};
        int k=3;
       // k%k=k;
        int t[]=new int[a.length];
        for(int i=0;i<k;i++){
            t[i]=a[a.length-k+i];
        }
       int  p=k;
        for(int i=0;i<(a.length-k);i++){
            t[p]=a[i];
            p+=1;
        }
        for(int i=0;i<a.length;i++){
            a[i]=t[i];
        }   
        for(int element:a){
           System.out.println(element); 
        }
     }
}
