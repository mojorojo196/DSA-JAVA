package arraypattern.kadels;

public class maxsumsubar {
    public static void main(String[] args) {
        int arr[]={3,-4,5,4,-1,7,-8};

        // brute force O(n^2)
        int max=0;
        // for(int i=0;i<arr.length;i++){
        //     int currsum=0;
        //     for (int j = i; j < arr.length; j++) {
        //         currsum+=arr[j];
        //         max=Math.max(currsum,max);
        //     }
        // }
        // System.out.println(max);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=Math.max(arr[i], sum+arr[i]);
            max=Math.max(max, sum);
        }
        System.out.println(max);
    }
}
