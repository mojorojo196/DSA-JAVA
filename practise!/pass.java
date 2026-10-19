import java.util.*;
public class pass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
float b=s.nextFloat();
float c=s.nextFloat();
float per=(a+b+c)/(300)*100;
System.out.println(per);
if(per>100){
    System.out.println("enter valid numbers");
}
else if(per>=33){
    System.out.println("congrats");
}
else{
    System.out.println("sorry tey next time");
}
    }
}
