package arraypractise;

import java.util.Arrays;

public class leader {
    public static void main(String[] args) {
         int []a={2,5,7,8,4,1,6};
        //  int temp[]=new int[a.length];
        //  int j=1;
        //  temp[0]=a[a.length-1];
        //  for(int i=a.length-2;i>=0;i--){
        //        for(int k=i+1;k<a.length-1;k++){
        //         if(a[i]>a[k]){
        //                                                                                                                                     
        
        
        
        /// this is wrong i am storing the number each time if it is greater in a[k] we dont want that we need to find leader not to store elem which is greater 
      
        ///   
        //             temp[j]=a[i];
                    
        //         }
        //        }
        //  }
        //  for(int i=j-1;i>=0;i--){
        // System.out.println(temp[i]);
                //brtue force
    //    for (int i = 0; i < a.length; i++) {
    //     boolean j=true;
    //     for(int k=i+1;k<a.length;k++){
    //         if(a[i]<a[k]){
    //              j=false;
    //              break;
    //         }
    //     }
    //     if(j==true){
    //         System.out.println(a[i]);
    //     }
        
    //    }

             //optimal apporch:
        // so we know that last element itself is the leader : toh usko store kar liya 0th index pe temp arry ki then update karte ja rahe hai leader to and loop ke andar and temp ki jth indexes pe store karte  ja rahe hai and we print arr.tostring form::::::

    int temp[]=new int[a.length-1];
    int l=a[a.length-1];
    temp[0]=l;
    int j=1;
    for(int i=a.length-2;i>=0;i--){
        if(a[i]>l){
            l=a[i];
            temp[j]=l;
            j++;
        }
    }
    System.out.print(Arrays.toString(temp));        
       }

    }
     

