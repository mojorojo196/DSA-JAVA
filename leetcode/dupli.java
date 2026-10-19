package leetcode;

public class dupli {
    public static void main(String[] args) {
        //condition hai ki arry sortred hai
       int a[]={1,1,2,2,4,7,8};
       int j=1;
       for(int i=1;i<a.length;i++){
        if(a[i]!=a[i-1]){
            a[j]=a[i];
            j++;
        }
       }
      for(int k=0;k<j;k++){
        System.out.println(a[k]);
      }
     }
}
