import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    
    public static int singleNumber(int[] nums) {
        
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }

        return xor;
        
        /* Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if(numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0; */

        /* Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if(numSet.contains(num)){
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }
        return numSet.stream().findFirst().orElse(0); */
    }


    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(singleNumber(nums));
    }
}

/* 
 * Optimal approach
 * -Using XOR operation, this operation with itself provide 0 since there will be only one number not appearing twice
 * final value will be that number
 * 
 * Time Complexity
 * O(n) - as we iterate through entire array
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 */
