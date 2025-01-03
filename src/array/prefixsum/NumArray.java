package array.prefixsum;

class NumArray {
    private int[] sum;

    // Constructor
    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }


    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};


        NumArray numArray = new NumArray(nums);


        System.out.println("Sum of range (0, 2): " + numArray.sumRange(0, 2)); // Output: 6
        System.out.println("Sum of range (1, 3): " + numArray.sumRange(1, 3)); // Output: 9
        System.out.println("Sum of range (0, 4): " + numArray.sumRange(0, 4)); // Output: 15
    }

}