

public class MissingNumber {

    public int findMissingNumber(int[] nums) {
        int n = nums.length;

        int i = 0;
        while (i < n) {
            
            boolean present = false;
            for(int j = 0; j < n; j++) {
                if(i == nums[j]) {
                    present = true;
                }
            }
            if(!present) {
                break;
            }
            i++;
        }
        return i;
    }

    public int findMissingNumberOpt(int[] nums) {
        int n = nums.length;
        int sumOfN = n*(n+1)/2;

        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sumOfN-sum;
    }
    
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        // int[] nums = {9,6,4,2,3,5,7,0,1};
        MissingNumber missingNumber = new MissingNumber();
        int missingNum = missingNumber.findMissingNumberOpt(nums);
        System.out.println("Missing num = " + missingNum);
    }
}

/*
 * Logic
 * Brute Force
 * -I am using two loops, one to get numbers from 0 to n and other to iterate through array to check
 * if n is present or not in that array.
 * -To keep a track of the number present I am using a boolean for each num for which I am checking in array
 * -If number is not present break through the loop and return that number
 *
 * Time Complexity
 * It takes
 * O(n*n) -> O(n^2) - considering worst case scenario we will need to iterate through enitre array n times
 * if missing number is not found early
 *
 * Space Complexity
 * O(1) - as we are not using any new space
 * 
 * 
 * Logic
 * Optimal Solution
 * -I can get the sum of N natural numbers through simple forumla
 * -As we know that only 1 number is missing by some math we can find it as sum of N natural number
 * subrated from the sum of array.
 * -Subtration of the sums will give you the missing number
 *
 * Time Complexity
 * It takes
 * O(n) - As will need to loop through array to get the sum
 *
 * Space Complexity
 * O(1) - as we are not using any new space
 *
 * */
