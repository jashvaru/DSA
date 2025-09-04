import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


   public static int majorityElement(int[] nums) {
        //Brute force   
        Arrays.sort(nums);
        return nums[nums.length/2];
        
        //Better
        /* Map<Integer, Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
            if(mpp.get(num) > nums.length/2) {
                return num;
            }
        }

        return 0; */

        //Optimal
        /* int ele = nums[0];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == ele) {
                cnt++;
            } else {
                cnt--;
                if(cnt == 0) ele = nums[i+1];
            }
        }

        return ele; */
   }



    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        // int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }    
}

/* 
 * Brute force approach
 * -Sort the array
 * -The element at n/2th index of the array is majority
 * 
 * 
 * Time Complexity
 * O(n log n) - as we are using sorting
 * 
 * Space Complexity
 * O(1) - as we are not using any new space
 * 
 * Better
 * -Use hasing to keep count of each number
 * -At the end iterate through the hashmap and check which number have count more than n/2
 * 
 * Time Complexity
 * O(2n) - as we are using two loops one to check freq and one to check majority element
 * 
 * Space Complexity
 * O(1) - as we are not using any new space
 * 
 *
 * Optimal approach (Moore's Voting Algorithm)
 * -Majority element will cancel all other element and still have value
 * 
 * Time Complexity
 * O(n) - as we are iterating through only once
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 * 
 */
