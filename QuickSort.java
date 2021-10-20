import java.util.Arrays;

public class Quicsort {
    public static void main(String[] args) {
        int[] arr= {5, 4, 3, 2, 1, 6, 7, 9, 8};
      
      // Use any one method to call
      
      //METHOD-1(calling)
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
       // METHOD-2(calling) JCF property using hybrid sorting
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while (start <= end) {
            while(arr[start] < pivot) {
                start++;
            }
            while(arr[end] > pivot) {
                end--;
            }

            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sort(arr, start, high);
        sort(arr, low, end);
    }
}
