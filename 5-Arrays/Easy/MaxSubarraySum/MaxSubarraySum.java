public class MaxSubarraySum {
    
    public static int maxSubarraySum(int[] nums) {
        //brute force 
        /* int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum; */

        //better 
        /* int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum = sum + nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum; */

        //Optimal
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(nums));
    }
}

/* 
 * Brute force approach
 * -Find the sum of all possible sub arrays.
 * -Keep he track of max sum
 * 
 * Time Complexity
 * O(n^3) - as we need to use 3 loops 2 for subarrays and 1 for adding the values to find sum
 * 
 * Space Complexity
 * O(1) - as we are not using any new space
 * 
 * Better
 * -It is same as above only diff is that instead of adding all values to find the sum
 * keep the track of previous sub array sum and take it forward to calc next sum
 * 
 * Time Complexity
 * O(n^2) - as we are using two loops for subarrays
 * 
 * Space Complexity
 * O(1) - as we are not using any new space
 * 
 *
 * Optimal approach (Kadane's Algorithm)
 * -Keep the track of the sums from start
 * -If the sum is negative no point in carrying it forward as it will just reduce the value,
 * so in that case reset the sum to 0 if negative sum
 * -When you keep adding values to calc the sum keep the track of the max sum as well.
 * 
 * Time Complexity
 * O(n) - as we are iterating through only once
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 * 
 */
