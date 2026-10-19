package array;

public class memo {
    public static void swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){

        //shallow copy concept maine new use nahi kiya jab a name ke arr ko m ke eqal dala toh woh dono heap mai same elemt and stack mai same address ko dekh rahe hai toh m[1]=2 , 2 ki jagha a[1]=20 , 20 aa jayga :

        //heap mai naya kuch new keyword se banta hai://
                     
         int []m;
         m=new int[3];
        m[0]=1;
        m[1]=2;
        m[2]=3;
       // int a[]=m;
       // a[1]=20;
       swap(m,0,2);
        for(int element:m){
            System.out.println(element);
        }
    }
}
