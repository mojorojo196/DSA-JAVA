package recrusion;

public class Number {
    public static void main(String[] args) {
        // write a function that takes in a number and print it 
        // print first 5 numbers from that number: 1 2 3 4 5
        print(1);
    } 
    static void print(int num){    /// notice here an function is calling function inside it and 
        if(num==5){
            System.out.println(num); 
            return;
        }
        System.out.println(num);
  
        // this is called tail recursion  
        // this is the last fuction call  

        print(num +1);
    }
    // static  void print2(int num){
    //     System.out.println(num); 
    //     print3(num + 1);
    // }
    // static void print3(int num){
    //     System.out.println(num);
    //     print4(num+1);
    // }
    // static void print4(int num){
    //     System.out.println(num);
    //     print5(num+1);
    // }
    // static void print5(int num){
    //     System.out.println(num);
    // }
}
 