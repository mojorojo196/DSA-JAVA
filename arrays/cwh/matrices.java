package arrays.cwh;
public class matrices {
    public static void main(String[] args){
        int m[][]={{5,5,10},{2,2,2}};
        int n[][]={{2,2,2},{2,2,2}};
        int x[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                x[i][j]=m[i][j] +n[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(x[i][j]+" ");

        }
        System.out.println(" ");

    }
    }
}
