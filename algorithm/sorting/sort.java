package sorting;


import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("ENTER NO OF ELEMENT");
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=s.nextInt();
      }  
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
    static void bubble(int[] a){
      boolean swap=false;
      for(int i=0;i<a.length;i++){

        for(int j=1;j<a.length-i;j++){
          if(a[j]<a[j-1]){
            int tem=a[j];
            a[j]=a[j-1];
            a[j-1]=tem;
            swap=true;
          }
        }
        if(!swap){
          break;
        }
      }
    }
}
