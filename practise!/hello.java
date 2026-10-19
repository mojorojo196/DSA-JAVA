import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m[][]={{2,2,2},{2,2,2}};
        int n[][]={{2,2,2},{2,2,2}};
        int x[][]={};
        for(int i=0;i<m.length;i++){
            for(int j=0;j<n.length;j++){
                x[i][j]=m[i][j] + n[i][j];
            }
        }
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++)
                System.out.print(x[i][j]);

        }
        System.out.println();

    }
}
