package collectionframeworks;
import java.util.HashSet;

public class av {



    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
            //     for (int j = 1; j <=5-i; j++) {
                //         System.out.print(" "); 
                //     }
                //     for (int j = 1; j <=5; j++) {
                    //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(7000);
        // set.add(50000);
        // set.add(50);
        // set.add(20);
        // for (int i = 0; i < 100000; i++) {
            //     set.add(i);
        // }
        // System.out.println(set)
        Student s1 = new Student("dhoni",7);
        Student s2 = new Student("dhoni",7);
        String s="dhoni";
        String n= new String("dhoni");
       // System.out.println(s==n);
       // System.out.println(s.equals(n));//this will give true because we have overridden the equals method in String class

        System.out.println(s1==s2);// this will give false because they are two different objects in memory
        System.out.println(s1.equals(s2));// this will give false because we have not overridden the equals method in Student class 
// ish case mai hame overiding karna padega equals method ko Student class mai taki dono objects ke values ko compare kiya ja sake
// String name =  new String("dhoni");
//         System.out.println(s1.equals(name));  // classcastexcption agar koi duri type ka object hai toh 
//     }

      HashSet<Student> set1 = new HashSet<>();
      set1.add(s1);
      set1.add(s2);
      System.out.println(set1.size()); // this will give 2 because we have not overridden ,, 
      // ab sab sahi hai override kiya hai do duplicate student nahi lega 
      System.out.println(set1);




}
}
        class Student{
            String name;
            int rollno;
            Student(String name, int rollno){
                this.name = name;
                this.rollno = rollno; 
            }
            @Override 
            public String toString(){
                return this.name+" "+this.rollno;
            }
              @Override 
            public boolean equals(Object obj) { // if we are overriding the object equal method then parameter must be of object type 
                // because obj is of object type we need to convert it to student object that's how we can check to its instance

                if(!(obj instanceof Student)){
                    return false;
                }
                Student s=(Student)obj;//cant blindly cast it to student because obj can be of any type so we need to check if it is instance of student or not
                return this.name.equals(s.name) && this.rollno == s.rollno;
            }
            @Override 
            public int hashCode(){
                return this.name.hashCode() + this.rollno;
            }
            
            
        }
    