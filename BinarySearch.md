import java.util.*;
public class EvenOddsorting {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i <size; i++) {
            nums[i] = scr.nextInt();
        }

        for(int i=1;i<size;i++){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
                i++;
            }
        }
        for(int i=0;i<size;i++){
            if(nums[i] % 2 != 0){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
