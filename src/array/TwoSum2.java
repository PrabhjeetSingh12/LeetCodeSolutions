package array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target){

        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            if(numbers[start] + numbers[end] == target){
                return new int[]{start, end};
            }
            else if(numbers[start] + numbers[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum2.twoSum(nums, target);

        System.out.println(Arrays.toString(result));

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
