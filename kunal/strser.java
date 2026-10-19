package kunal;

import java.util.Arrays;

public class strser {
    public static void main(String[] args) {
        String name="mohit";  // while string are written in double qoutes ::
        char target='e';   // char are written in single qoutes 
        System.out.println(name.toCharArray());
             // although we using string instead of int but data type of string is char so inside for each loop instead of writing string : , we write char because data type is charb
             System.out.println(searchstr(name, target));

    }


    static boolean searchstr(String name,char target){

        for (char ele : name.toCharArray()) {
            if(ele==target){

                return true;

            }
            else if(name.length()==0){
                return false;

            }

            
        }
        return false;

    }
}
