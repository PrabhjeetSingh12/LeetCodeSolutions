package array;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int [] nums,int target){
        int arr[] = new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[0]= nums[i];
                    arr[1]=nums[j];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int nnums[] = {2,0,11,15};
        TwoSum object = new TwoSum();
        int[] ans = object.twoSum(nnums,9);
        System.out.println(Arrays.toString(ans));
    }
}
