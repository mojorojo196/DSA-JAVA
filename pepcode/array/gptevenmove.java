package array;

public class gptevenmove {
    public static void main(String[] args) {
        int a[]={7,2,9,4,6,1,3};
        

int j = 0;

for(int i = 0; i < a.length; i++){
    if(a[i] % 2 == 0){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;

        
        j++;
    }
}


        for(int element:a){
            System.out.println(element);
        }
    }
}
