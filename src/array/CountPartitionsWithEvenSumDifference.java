package array;
public class CountPartitionsWithEvenSumDifference {

    public int countPartitions(int[] nums) {
        int totalSum = 0;
        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        int sumLeft = 0;
        int count = 0;

        // Iterate through the array and check each partition
        for (int i = 0; i < nums.length - 1; i++) {
            sumLeft += nums[i];
            int sumRight = totalSum - sumLeft;

            // Check if both left and right subarrays have the same parity (even/even or odd/odd)
            if (sumLeft % 2 == sumRight % 2) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountPartitionsWithEvenSumDifference obj = new CountPartitionsWithEvenSumDifference();
        int[] nums = {10, 10, 3, 7, 6};  // Example input
        int result = obj.countPartitions(nums);
        System.out.println(result);  // Output: 4
    }
}
