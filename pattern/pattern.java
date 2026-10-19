import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        //         //solid square
        // int n=s.nextInt();//rows
        // int m=s.nextInt();//columns
        // //outer loop is for no of rows:
        // for(int i=1;i<=n;i++){
        //     //inner loop is for no of columns:
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

                      //hollow rectangle
                      //think it like an matrix (i,j)
// int r=s.nextInt();
// int c=s.nextInt();
//                       for(int i=1;i<=r;i++){
//                         for(int j=1;j<=c;j++){
//                             if( i==1 || j==1 || i==r || j==c ){
// System.out.print("*");
//                             }
//                             else{
//                                 System.out.print(" " );
//                             }
//                         }
//                         System.out.println();
//                       }
 
for(int i=4;i>0;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
}

    }
