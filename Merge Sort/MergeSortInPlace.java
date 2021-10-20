import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
         int[] arr = {5, 4, 3, 2, 1, 7, 9, 8};
        MergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
  
   // Merge Sort In-place method
    static void MergeInPlace(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
        int mid = (start+end)/2;

        MergeInPlace(arr, start, mid);
        MergeInPlace(arr, mid, end);

        MergingInPlace(arr, start, mid, end);
    }

    private static void MergingInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while( i < mid && j < end) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while( i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < end-start; l++) {
            arr[start+l] = mix[l];
        }
    }
}
