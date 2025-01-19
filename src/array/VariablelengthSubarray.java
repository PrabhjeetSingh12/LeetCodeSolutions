package array;

import java.util.Arrays;

class VariablelengthSubarray{
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            int start = Math.max(0,i-nums[i]);
            int[] subar = Arrays.copyOfRange(nums,start,i+1);

            for(int j=0;j<subar.length;j++){
                sum += subar[j] ;
            }
        }
        return sum;
    }
}