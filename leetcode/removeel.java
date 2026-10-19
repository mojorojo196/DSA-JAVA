package leetcode;

public class removeel {
    public static void main(String[] args) {
        int a[]={1,2,5,8,4,3};
        int val=5;
        int val2=2;//need to remove from arry;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val && a[i]!=val2){
                 a[j]=a[i];
                 j++;   
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(a[i]);
        }
        }
    }
