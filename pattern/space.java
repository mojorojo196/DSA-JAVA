public class space {
    public static void main(String[] args) {
        int sp=4;
        int st=1;
        for(int i=1;i<=5;i++){
             for(int j=1;j<=sp;j++){
                System.out.print(" ");
             }
             for(int j=1;j<=st;j++){
                if(i==4 || i==5){

                }
                System.out.print(" *");
             }
             System.out.println();

             st++;
             sp--;

        }
    }
}
