
public class MaxConsecutiveOnes {

    private int findMaxConsecutiveOnes(int[] nums) {
        int cCounter = 0;
        int counter = 0;
        for (int n : nums) {
            if(n == 1) {
                counter++;
            } else {
                cCounter = Math.max(cCounter, counter);
                counter = 0;
            }
        }
        cCounter = Math.max(cCounter, counter);
        return cCounter;
    } 
    

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        MaxConsecutiveOnes max = new MaxConsecutiveOnes();
        int c = max.findMaxConsecutiveOnes(nums);
        System.out.println("Max Cosecutive ones = " + c);
    }
}

/*
 * Logic
 * -Using a variable to count the consecutive 1's and other to keep track of max_count value
 * -Count will be reset if we come across 0, when this happens we compare count and max_count and get
 * max of those two.
 * -One loops get completed we again compare those two and get tha max value so at the end we have max value  
 *
 * Time Complexity
 * It takes
 * O(n) - we iterate through the loop once
 *
 * Space Complexity
 * O(1) - as we are not using any new space
 * */
