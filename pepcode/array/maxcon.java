package array;
public class maxcon{
    public static void main(String[] args) {
        int a[]={1};
        //leetocde pe ye test case fail hua tha
        //consecuative one pata karne hai woh track kar na ki frequency wala pattern ko soch m****** c******;
        int count=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
                if(count>max){
                    max=count;
            }
                }
            else{
            count=0;   
            }
        }
        System.out.println(max);
    }
}