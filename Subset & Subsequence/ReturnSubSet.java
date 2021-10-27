/*
write a program to return a subset of a string.
INPUT = "abc"
OUTPUT = a b c ab ac bc abc
*/

import java.util.ArrayList;

public class SubSetRetrun {
    public static void main(String[] args) {
         String value1 = "abc";
         SubSet("", value1);

        System.out.println();

        String value2 = "abc";
        System.out.println(SubSetRet("", value2));
    }

    // without retrun statement-------------------------------------
    static void SubSet(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        SubSet(p, up.substring(1));
        SubSet(p+ch, up.substring(1));
    }

    // Retrun in ArrayList-------------------------------
    static ArrayList<String> SubSetRet(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
         char ch = up.charAt(0);

        ArrayList<String> left = SubSetRet(p+ch, up.substring(1));
        ArrayList<String> right = SubSetRet(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
