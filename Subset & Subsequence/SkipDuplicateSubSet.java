/*
writ a program to retunr sub set of an array, which contains duplicate value. output should not repeate same subset more than 1 time.
INPUT = [1,2,2]
OUTPUT = [[1] [2] [1,2] [2,2] [1,2,2]]
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraySubSet {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = SubSet(arr);
        for (ArrayList<Integer> list : ans){
            System.out.println(list);
        }
    }

    static ArrayList<ArrayList<Integer>> SubSet(int [] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }
}
