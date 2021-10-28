/*
Example :- INPUT - "abc"
           OUTPUT - abc, bac, cab, bca, cba, acb.
           Above example is a kind of permutation example. Arrange Strings in different position
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
        permutation("", up);// it will print permutation in simple way

        System.out.println(); // For new line.

        ArrayList<String> result = permutationList("", "abc");
        System.out.println(result); // it will return arraylist
    }
// Without Return Statement-------------------------------------------------------------
    static void permutation(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }
    
// Return In ArrayList-------------------------------------------------------------------
    static ArrayList<String> permutationList (String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char character = up.charAt(0);
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String fir = p.substring(0, i);
            String sec = p.substring(i, p.length());
            result.addAll(permutationList((fir+character+sec), up.substring(1)));
        }
        return result;
    }
}
