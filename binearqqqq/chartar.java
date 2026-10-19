package binearqqqq;

public class chartar {
    public static void main(String[] args) {
        char a[]={'c','f'};
        System.out.println(search(a, 'f'));

    }
    static char search(char a[],char target){
          int start=0;
    int end=a.length-1; 
    
   while(start <=  end){
    int mid=(start+end)/2;

         if(a[mid]>target){
            end=mid-1;
        }
        else {
            start=mid+1;
        }

       
    }
    if(start==a.length){
        return a[0];
    }
    return a[start];
    /// return a[start%a.length];   
    }
}
