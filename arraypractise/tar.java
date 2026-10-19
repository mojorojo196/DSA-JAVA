package arraypractise;

public class tar {
    public static void main(String[] args) {
         int a[]={2,4,5,7,8,8,9};
         int b=3;
         boolean c=false;
         for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==b){
                    System.out.print(i);
                    System.out.print(" and " +j+" index ");
                    c=true;
                }
            }
            if(c==false){
                System.out.println("sum not found equal to target");
                break;
            }
         }
    }
}
