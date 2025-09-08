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

        return 0;
    }
    
    public static void main(String[] args) {
        // int[] nums = {7,1,5,3,6,4};
        int[] nums = {7,6,4,3,1};
        System.out.println(stockBuyAndSell(nums));
    }
}
