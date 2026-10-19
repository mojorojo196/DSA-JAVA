package arraypattern.slidingwindow;

public class maxsubarr {
    public static void main(String[] args) {
      int a[]={2, 3, 5, 1, 6, 4, 5 };
      int k=3;
//Find the maximum sum of any subarray of size 3.
//
//Example:
//
//Subarrays of size 3
//
//[2,3,5] → 10
//[3,5,1] → 9
//[5,1,6] → 12
//[1,6,4] → 11
// int max=0;

// for(int i=0;i<=a.length-k;i++){ // if we didnt use the equal we will miss the last window:::
//     int sum=0;
//       sum+=a[i];
//     for(int j=i+1;j<=k+i-1;j++){   /// j<k+i-1 because j is 
//         sum+=a[j];
//     }
//     if(max<sum){
//         max=sum;
//     }
// }
// System.out.println(max);
int sum=0;

for(int i=0;i<k;i++){
    sum+=a[i];
}
int max=sum;
int i=0;  // elem which is leaving the window
int j=k;  // elem which is entering the window

while (j<a.length) {
    sum=sum+a[j]-a[i]; //This one line is the heart of the Sliding Window pattern.

    max = Math.max(max, sum);

    i++;
    j++;
}
System.out.println(max);
    }
}
