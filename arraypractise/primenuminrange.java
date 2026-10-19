package arraypractise;

import java.util.Scanner;

public class primenuminrange {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int inp=s.nextInt();
        for(int i=2;i<=inp;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i==j){
                    continue;
                }
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }

        }
    }
}
