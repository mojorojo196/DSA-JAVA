package array;
public class dupremo{
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,4,4,5};
       int j=1;
       for(int i=1;i<a.length;i++){
        if(a[i]!=a[i-1]){
            a[j]=a[i];
            j++;
        }
       }
       
//  maja aaya esh mai it took 1hr 19min to understand gpt se hint le le ke kiya kuch apna dimag bhi lagaya 
    
        for(int k=0;k<j;k++){
            System.out.print(a[k]);
        }
    }

  }