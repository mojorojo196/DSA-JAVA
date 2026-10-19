package arrays.gptprobs;

public class maxsumsubarr {
    public static void main(String[] args) {
        
    int a[]={2,-3,4,-1,-2,1,5,-3};
     int max=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum>max){
                    max=sum;
                }
            } 
        }
        System.out.println(max);
    }
}
