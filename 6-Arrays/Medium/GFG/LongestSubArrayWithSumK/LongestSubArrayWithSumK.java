public class LongestSubArrayWithSumK {
    
    public static int longestSubarray(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int sum = arr[left]; 
        int longest = 0;
        while(right < arr.length) {
            while(left <= right && sum > k) {
                sum = sum - arr[left];
                left++;   
            }
            
            if(sum == k) {
                longest = Math.max(longest, (right-left)+1);
            }

            right++;
            if(right < arr.length) {
                sum = sum + arr[right];
            }
        }
        return longest;
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        System.out.println(longestSubarray(arr, 6));
    }
}

/* 
 * Optimal approach (for array having positive and negative numbers)
 * -We will use prefixSum + hashing approach
 * 
 * Optimal approach (only if array have posiive numbers)
 * -We will use variable *sliding window* patter to solve this
 * -We will expand window by moving the right pointer
 * -If sum matches k, check if this is the longest window
 * -If the sum is large then k, subtract leftmost value from the sum and shrink the window
 * 
 * Time Complexity
 * O(2n) - as we iterate through entire array and with each iteration we also iterate for sub array
 *
 * Space Complexity
 * O(1) - as we are not using any new space
 */
