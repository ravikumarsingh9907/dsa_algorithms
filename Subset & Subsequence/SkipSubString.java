/*
Write a progrm to skip specific sub string from the String. Suppose we have to skip "ravis" from string.
INPUT = "bbccravisdah"
OUTPUT = bbccdah (ravis removed )
*/


public class SkipSubString {
    public static void main(String[] args) {
        String value1 = "bbccravisdah";
        SubString("", value1); // it will skip apple from the String

        System.out.println(); // for a line gap

        String value2 = "ccbbravishad";
        System.out.println(SubStringRet(value2));
    }
    // without return statement------------------------------------------------
    static void SubString(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(up.startsWith("ravis")) {
            SubString(p, up.substring(5));
        }
        else {
            SubString(p+ch, up.substring(1));
        }
    }

    // with return statement--------------------------------------------
    static String SubStringRet(String up) {
        if(up.isEmpty()) {
            return up;
        }

        char ch = up.charAt(0);
        if(up.startsWith("ravis")) {
            return SubStringRet(up.substring(5));
        }
        else {
            return ch + SubStringRet(up.substring(1));
        }
    }
}
