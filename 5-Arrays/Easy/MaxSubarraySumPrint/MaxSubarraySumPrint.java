
public class MaxSubarraySumPrint {
    
    public static int maxSubarraySumPrint(int[] nums) {
        //Optimal
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;
        for(int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }

            sum = sum + nums[i];
            if(sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println("start = " + ansStart + " end = " + ansEnd);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySumPrint(nums));
    }
}