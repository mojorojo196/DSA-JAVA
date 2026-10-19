package string;

import java.util.*;

public class method {
    public static void main(String[] args) {
        String s= "a good   example";
        s=s.strip();
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));
        List<String> n=new ArrayList<>();
        int j=0;
        for (int i=arr.length-1; i >=0 ; i--) {
            if(arr[i].equals("")){
                continue;
            }
            else{
                n.add(j,arr[i]);
                j++;
            }
        }


        System.out.println(String.join(" ", n));
        //  int i=0;
        // int j=arr.length-1;
        // while(i<=j){
        //     if(arr[i]==" "){
        //         i++;
        //         continue;
        //     }
        //     else if(arr[j]==" "){
        //         j--;
        //         continue;
        //     }
        //     else{
        //         String temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;

        //         j--;
        //         i++;

        //     }
        // }
//         System.out.println(s);
//         System.out.println(s.length());
//         System.out.println(s.charAt(0));
//         System.out.println(s.toCharArray());// so this is coverted to charArray but for that we need to use tostring 
//         System.out.println(Arrays.toString(s.toCharArray()));// this will give output as an proper formatted array
//         System.out.println(s.toLowerCase()); /// original stay same no change in that is just create new object why string is immuntable
//         System.out.println(s);
// // spaces are removed  by strip();
//         System.out.println(s.strip());
//  // it split string from space [Mohit, Kum, , awat] from mohit kum awat
//         System.out.println(Arrays.toString(s.split(" ")));
// String a="string  string";
// System.out.println(Arrays.toString(a.split(" ")));
String s1= "..geeks..for.geeks.";
String[] a= s1.split("\\.");
System.out.println(Arrays.toString(a));
    }
}
