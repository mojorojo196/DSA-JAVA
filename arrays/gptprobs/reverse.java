package arrays.gptprobs;
import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={1,2,3,4,5};
       int left=0;
       int right=a.length-1;
       while(left<right){
        int tem=a[left];
        a[left]=a[right];
        a[right]=tem;
        left++;
        right--;

       }
System.out.println(Arrays.toString(a));
        }
        
    }

