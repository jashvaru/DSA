public class StockBuyAndSell {

    public static int stockBuyAndSell(int[] nums) {
        //Brute Force
        /* int maxProfit = -1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                int profit = nums[j] - nums[i];
                if(profit < 0) {
                    continue;
                } else {
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
        }
        return maxProfit < 0 ? 0 : maxProfit; */

        //Optimal
        /* int min = nums[0];
        int maxProfit = 0;
        for(int i = 1; i < nums.length; i++) {
            int profit = nums[i] - min;
            maxProfit = Math.max(maxProfit, profit);
            min = Math.min(min, nums[i]);
        }

        return maxProfit; */

        //Optimal
        int buy = nums[0];
        int profit = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < buy) {
                buy = nums[i];
            } else if (nums[i] - buy > profit) {
                profit = nums[i] - buy;
            }

        }

        return profit;
    }
    
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        // int[] nums = {7,6,4,3,1};
        System.out.println(stockBuyAndSell(nums));
    }
}

/* 
 * Brute force approach
 * -Compare each day buying price with each day(days after buying) selling price
 * -While doing so keeping track of max profit
 * 
 * Time Complexity
 * O(n^2) - as we need to use 2 loops
 * 
 * Space Complexity
 * O(1) - as we are not using any new space
 *
 * Optimal approach 
 * -For each day compare the buying prices and update the buy price if min is found
 * -If buy price is not less than min then check if profit is greater than previous profit(initially 0)
 * This will keep track of the maxProfit by the end of the array
 * 
 * Time Complexity
 * O(n) - as we are iterating through only once
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 * 
 */
