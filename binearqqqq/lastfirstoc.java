package binearqqqq;

import java.util.Arrays;

public class lastfirstoc {
    public static void main(String[] args) {
        int a[]={5,7,7,8,8,8,8,10};
      //  System.out.println(Arrays.toString(search(a, 9)));
    //  System.out.println(Arrays.toString();
        }
        static int[] search(int a[],int target){

                // brute force approch :::
            int b[]=new int[2]; 
            int j=0;
            boolean find=false;
            for (int i = 0; i < a.length; i++) {
                if(a[i]==target){

                    find=true;
                    b[j]=i;
                    j++;
                    break;
                }   
            }
            if(find==false){
                b[0]=-1;
                b[1]=-1;

                return b;
            }
            for (int i = a.length-1; i >0; i--) {
                if(a[i]==target){
                    b[j]=i;
                    break;
                }   
            }
            return b;
        }

     
        }

