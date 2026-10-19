public class diagonal {
    public static void main(String[] args) {

        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    static int  diagonalSum(int[][] mat){
     int n=mat.length-1;
     int sum=0;
     if(mat.length%2!=0){
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        int col=n;
        for(int i=0;i<mat.length;i++){
            if(i==col){
                col--;
                continue;
            }
            sum+=mat[i][col];
            col--;
        }
     }   
     return sum;
    }
}
