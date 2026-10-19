package array;

public class reversearr {
    public static void main(String[] args) {
        
        int a[]={1,2,4,8,6};
        int i=0;
        int j=a.length-1;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;

            i++;
            j--;
        }
             for(int element:a){
                System.out.print(element);
             }
        }
}
