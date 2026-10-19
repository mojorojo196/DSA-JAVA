package arraypattern.kadels;

public class maxproduct {
    public static void main(String[] args) {
        int a[]={0,0,0,0,0,0,0,0,0,0};
        // brute force
        // int maxpro=Integer.MIN_VALUE;
        // for (int i = 0; i < a.length; i++) {
        //     int pro=1;
        //     for (int j = i; j < a.length; j++) {
        //         pro*=a[j];
        //         maxpro=Math.max(maxpro, pro);
        //     }
        // }
        // System.out.println(maxpro);
        System.out.println(maxpro(a));
    }
    static  int maxpro(int a[]){
          //kaden's algo
        int maxpro=Integer.MIN_VALUE;
        int pro=1;
        for (int i = 0; i < a.length; i++) {
            pro*=a[i];
            maxpro=Math.max(maxpro, pro);
            if(pro==0)pro=1;   
        }
        pro=1;
        for (int i = a.length-1; i>=0; i--) {
            pro*=a[i];
            maxpro=Math.max(maxpro, pro);
            if(pro==0)pro=1;
        }
        return maxpro;
    }
}
