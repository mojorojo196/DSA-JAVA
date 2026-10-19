package array;

import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m[]= new int [n];
        for(int i=0;i<n;i++){
            m[i]=s.nextInt();
        }
        int a=s.nextInt();
        for(int i=0;i<m.length;i++){
            if(m[i]==a){
                System.out.println(i);
            }
        }
    }
}
