package leetcode;

public class rotatebyk {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int t[]=new int[a.length];
        int j=0;
        int k=2;
         k=k%a.length;
        if(k<0){
            k+=a.length;
        }
       
        
        //#1logic split it into two pehle part ko aagye dusre ko peche//  extra space create karni pdh rahi hai ishme and we loop again n again instead logic 2 will more optimal or  code ::
        //#2logic split into two part first reverse a.len-k to a.len then sec reverse 0 to a.len-k-1 , then third reverse whole arry::: 
        // sample code in folder arraypractise;;
     //
        /// ye wali chiyj samaj nahi ayi [[[[k%n=k;]]]]
        /// 
        /// 
        for(int i=(a.length-k);i<a.length;i++){
            t[j]=a[i];
            j++;
        }
        for(int i=0;i<(a.length-k);i++){
            t[j]=a[i];
            j++;
        }
        for(int i=0;i<a.length;i++){
            a[i]=t[i];
        }
        for(int element:a){
            System.out.print(element);
        }
    }
}
