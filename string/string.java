package string;
public class string {
    public static void main(String[] args) {
        // String s="mojorojo";
        // System.out.println(s);
        // s="avesh"; // string are immutable how can this be true why??
        // //we are not changing object we are creating new object ???
        //      // string tool
        // String c="mojorojo";
        // System.out.println(s);
        // String a="mojo";
        // String b="mojo";
       /// true why? beacuse a and b are pointing toward same object ??
        // a==b will give false if we create different object of same value new keyword::
        String d=new String("rohit");
        String e=new String("rohit");
        System.out.println(d==e); // this will give false::: because in heap memory both are pointing toward diffrent object although value is same 
        // if we need to check value we use equal method
          /// equal method::
        System.out.println(d.equals(e));// this will give true because we just seeing value not to for object :::

        // indexing
        System.out.println(d.charAt(0));  // r is at 0th index of rohit
        String s="";
        

    }
}
