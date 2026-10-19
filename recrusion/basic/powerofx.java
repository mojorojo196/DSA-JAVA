package recrusion.basic;

public class powerofx {
    public static void main(String[] args) {
        System.out.println(power(0,0));
    }   
    static int power(int num , int powe){
        if(num==0)return 0;
        if(powe==0)return 1;
         if(powe==1){
            return num;
         }

         return num *  power(num , powe-1);
    } 
}

