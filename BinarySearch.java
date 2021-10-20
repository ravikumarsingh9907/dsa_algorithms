import java.util.Scanner;

public class Binaryleetcode {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i]= in.nextInt();
        }
         int target = 9;
        System.out.println(findele(array, target));
    }

    static int findele(int[] array, int target){
        int start=0;
        int end = array.length -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            for(int i=0;i<array.length;i++){
                if(array[mid] > target){
                    end = mid -1;
                } else if (array[mid] < target) {
                    start = mid+1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
