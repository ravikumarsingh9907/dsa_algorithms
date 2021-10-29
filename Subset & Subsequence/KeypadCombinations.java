/*
Leetcode Link :- https://leetcode.com/problems/letter-combinations-of-a-phone-number/
*/

// this soultions consists multiple ways to print combinations, you choose any one type.


import java.util.ArrayList;

public class CombinationPad {
    public static void main(String[] args) {
        String digit1 = "12";

        // Printing simple way----------------without return statement------------
        Combination(digit1, " ");

        System.out.println();
        String digit2 = "132";

        // Printing in ArrayList--------------------------------------------------
        System.out.println(CombinationRet("", digit2));

        // Print size of the Possible combinations---------------------------------
        System.out.println(CombinationRet("", digit2).size());
    }

    // without return statement------------------------
    static void Combination(String up, String p) {

        // if input is empty (base condition)--------------------------------------
        if(up.isEmpty()) {
            System.out.print(p+ " ");
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {

            char ch = (char)('a' + i);
            Combination(up.substring(1), p+ch);
        }
    }

    // with return statement as ArrayList<String>----------------------------------
    static ArrayList<String> CombinationRet (String pro, String up) {

        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        int digit2 = up.charAt(0) - '0';
        ArrayList<String> result = new ArrayList<>();

        for (int i = (digit2-1) * 3; i < digit2 * 3; i++) {

            char ch = (char) ('a' + i);
            result.addAll(CombinationRet(pro + ch, up.substring(1)));
        }

        return result;
    }
}
