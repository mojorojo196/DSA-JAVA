package arraypattern.twopointer;
import java.util.*;
public class threesum {
    public static void main(String[] args) {
        //Input: a = [-1,0,1,2,-1,-4]
        //Output: [[-1,-1,2],[-1,0,1]]
        //                  /// brute force:: 
        //         HashSet<List<Integer>> d=new HashSet<>();
    //         for(int i=0;i<a.length-2;i++){
    //             for(int j=i+1;j<a.length-1;j++){
        //                 for(int k=j+1;k<a.length;k++){
            //                     if(a[i]+a[j]+a[k]==0){
//                         ArrayList<Integer> c=new ArrayList<>();
//                             c.add(a[i]);
//                             c.add(a[j]);
//                             c.add(a[k]);
//                             Collections.sort(c);
//                         d.add(c);
//                     }
//                 }

//             }
//         }
//         List<List<Integer>> b= new ArrayList<>(d);

// System.out.println(b);

int a[]={-1,0,1,2,-1,-4};
Arrays.sort(a);
List<List<Integer>> n=new ArrayList<>();
//HashSet<ArrayList<Integer>> h=new HashSet<>();
int i=0;
while(i<a.length-2){
    int req=-(a[i]);
    
    int l=i+1;
    int r=a.length-1;
    
    while (l<r) {
        if(a[l]+a[r]==req){
            // ArrayList<Integer> temp=new ArrayList<>();
            // temp.add(a[i]);
            // temp.add(a[l]);
            // temp.add(a[r]);
            
            // h.add(temp);
             n.add(Arrays.asList(a[i], a[l], a[r]));// this is sort way to create triplet:::
            l++;
            r--;
        }
        else if(a[l]+a[r]>req){
            r--;
        }
        else{
            l++;
        }
    }
    i++;
}
System.out.println(n);
    }
}
