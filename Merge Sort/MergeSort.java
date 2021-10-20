import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
         int[] arr = {5, 4, 3, 2, 1, 7, 9, 8};
        arr = MergesortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] MergesortAlgo(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] leftPart = MergesortAlgo(Arrays.copyOfRange(arr, 0, mid));
        int[] RightPart = MergesortAlgo(Arrays.copyOfRange(arr, mid, arr.length));

        return merging(leftPart, RightPart);
    }

    private static int[] merging(int[] first, int[] second) {
        int[] NewArr = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                NewArr[k] = first[i];
                i++;
            } else {
                NewArr[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            NewArr[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            NewArr[k] = second[j];
            j++;
            k++;
        }
        return NewArr;
    }
}
