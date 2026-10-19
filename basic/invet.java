package basic;
import java.util.Scanner;

public class invet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //method 1:
//we decreases the outer loop and print star according to value of rows
        //  for(int i=4;i>0;i--){
        //      for(int j=1;j<=i;j++){
        //          System.out.print("*");
        //      }
        //      System.out.println();

         
//method 2:
            //this changes inner loop and decreases the star number no change in outer loop and we use formula (n-i+1)
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=(4-i+1);j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
     //3 ; this combine both condition and loop
//      int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(j<=(n-i+1)){
// System.out.print("*");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//
// ****
// ***
// **
// *
//  
//         }
for(int i=10;i>=1;i--){
    for(int j=i;j>=1;j--){
    System.out.print("*");    
    }
    System.out.println();
}
    }
}
