/*
write a program to return subset od an array with using iteration method.
INPUT = [1, 2, 3]
OUTPUT = [[1] [2] [3] [1,2] [1,3] [2,3] [1,2,3]
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
