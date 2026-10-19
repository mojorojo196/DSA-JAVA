package arraypractise;

import java.util.HashSet;

public class missingkmultiple {
    public static void main(String[] args) {
        int a[]={1,4,7,10,15};
        int k=10;
        // brute force
        // int target=k;
        
        // while(true){
            //     boolean found=false;
            //     for(int elem:a){
                //         if(elem==target){
                    //             found=true;
        //             break;
        //         }
        //  }
        //  if(!found){
        //     System.out.println(target);
        //     break;
        //  }
        //  target+=k;
        
        // optimal 
    int target=k;
    HashSet<Integer> n=new HashSet<>();
    for(int i=0;i<a.length;i++){
        n.add(a[i]);
    }

    for(int i=0;i<n.size();i++){
        if(n.contains(target)){
            target+=k;
        }
        else{
            break;
        }
    }
    System.out.println(target);

}
   
}


