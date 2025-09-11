public class AlternatePositiveAndNegative {

    public static int[] alternatePositiveAndNegative(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] res = new int[nums.length];

        for (int num : nums) {
            if (num > 0) {
                res[pos] = num;
                pos = pos + 2;
            } else if (num < 0) {
                res[neg] = num;
                neg = neg + 2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] res = alternatePositiveAndNegative(nums);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}

/*
 * Optimal approach
 * -We are aware that result array will always start its 0th index with positive
 * value
 * -Then negative value at 1st index
 * -so whenever we come across positive value set the value in res array and
 * increase pos index by 2
 * -Do same for negative index
 * 
 * Time Complexity
 * O(n) - as we iterate through entire array
 *
 * Space Complexity
 * O(n) - as we use n size array to store result
 */
