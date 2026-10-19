package arraypattern.twopointer;

import java.util.ArrayList;

public class union {
    public static void main(String[] args) {
        int a[]={1,1,2,4,5,7,8,68};
        int b[]={1,1,2,4,3,6,9};
        ArrayList<Integer> union = new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                if( union.size()==0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                    i++;
                    j++;
                }
                else{
                    i++;
                    j++;
                }
            }
            else if(a[i]>b[j]){
                if(b[j]!=union.get(union.size()-1)){
                    union.add(b[j]);
                    j++;
                }
                else{
                    j++;
                }
            }
            else{
                if(a[i]!=union.get(union.size()-1)){
                    union.add(a[i]);
                    i++;
                }
                else{
                    i++;
                }
            }
        }
        while (j<m) {
            union.add(b[j]);
            j++;
        }
        while (i<n) {
            union.add(a[i]);
            i++;
        }
        System.out.println(union);
    }
}
