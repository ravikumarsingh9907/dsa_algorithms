/*
   Write a program to skip a specific character from the String

   INPUT = "baccadah"
   OUTPUT = bccdh
 */

public class SkipChar {
    public static void main(String[] args) {
        String value1 = "baccdahahd";
        skip("", value1);  // all 'a' from the string will be deleted

        System.out.println(); // For the line gap

        String value2 = "baccdah";
        System.out.println(SkipRet(value2)); // all 'a' from the string will be deleted
    }
    // without return statement--------------------------------------------
    static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p+ch, up.substring(1));
        }
    }

    // with return statement-----------------------------------------------
    static String SkipRet (String up) {
        if(up.isEmpty()) {
            return up;
        }
         char ch = up.charAt(0);
        if(ch == 'a') {
            return SkipRet(up.substring(1));
        }
        else {
            return ch + SkipRet(up.substring(1));
        }
    }
}
