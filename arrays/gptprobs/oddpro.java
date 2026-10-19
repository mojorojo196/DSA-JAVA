package arrays.gptprobs;

public class oddpro {
    public static void main(String[] args) {
        int a[]={1,2,4,7,8};
        // int p=1;
        // for(int i=0;i<a.length;i++){
        //     if(i%2!=0){
        //         p*=a[i];
        //     }
        // }
        // System.out.println(p);
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>5){
                count++;
            }
        }
        System.out.println(count);
    }
}
