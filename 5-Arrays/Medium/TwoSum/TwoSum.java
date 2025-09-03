import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        //better
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int more = target - nums[i];
            if(mpp.containsKey(more)) {
                return new int[] {mpp.get(more), i};
            }
            mpp.put(nums[i], i);
        }
        return new int[] {};

        //brute force
        /* for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        
        return new int[] {}; */
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 11, 15, 7};
        int[] res = twoSum(nums, 9);
        System.out.println(res[0] +" "+ res[1]);
    }
}

/* 
 * Brute force approach
 * -Consider all the pairs by iterating through the array using nested for loop
 * -if any of the sum matches the target the return the value of loop index
 * 
 * Time Complexity
 * O(n^2) - as we iterate through entire array using nested loop
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 * 
 * Optimal approach (Hashing)
 * -We will use a hash map to store number and their index
 * -Consider reference + more = target, reference will be each element in the array and search for more in the hash map
 * -Loop through all the elements in the array if the more is already in the map solui=tion is found
 * -If not keep the entry of the reference with it index in the map
 * -Repeat until we find more in the map
 * 
 * * Time Complexity
 * O(n) + time taken to retrive element from the hash which is O(1) = O(n) 
 * as we iterate through entire array using nested loop
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 * 
 */