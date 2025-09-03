import java.util.HashMap;
import java.util.Map;

public class SortColors {

    public static void sortColors(int[] nums) {
        //Optimal
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                int tmp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = tmp;
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tmp;
                high--;
            }
        }
        
        //Brute force
        /* int cZero = 0;
        int cOne = 0;
        int cTwo = 0;
        for (int num : nums) {
            if(num == 0) cZero++;
            else if(num == 1) cOne++;
            else cTwo++;
        }

        for(int i = 0; i < cZero; i++) {
            nums[i] = 0;
        }
        for(int i = cZero; i < cZero + cOne; i++) {
            nums[i] = 1;
        }
        for(int i = cZero + cOne; i < nums.length; i++) {
            nums[i] = 2;
        } */
    }

    public static void main(String[] args) {
       int[] nums = {2,0,1};
       sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
/* 
 * Brute force approach
 * -Run a loop to count the frequency of 0, 1 & 2
 * -Once we have freq just set the values in the array as per the freq
 * 
 * Time Complexity
 * O(n) + O(n) = O(2n) - as we iterate through entire array twice 1st to count freq and 2nd to set the values
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 * 
 * Optimal approach (Dutch National Flag Algorithm)
 * -Use DNF by taking 3 pointers
 * 
 * * Time Complexity
 * O(n) - as at each iteration we just swap or move the pointer which is nothing but O(1)
 *
 * Space Complexity
 * O(1) - as we are not using any new spac
 * 
 */

}
