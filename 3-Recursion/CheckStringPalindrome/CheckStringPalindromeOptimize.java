public class CheckStringPalindromeOptimize {
    static boolean checkStringPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if(!Character.isLetterOrDigit(input.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(input.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(input.charAt(start)) != 
                Character.toLowerCase(input.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        // String input = "race a car";
        // String input = " ";
        // String input = "0P";
        System.out.println(checkStringPalindrome(input));
    }
}

/* 
This is a optimized method
-Using Character class method to check if char is letter or digit.
-I am using two pointer method to compare the char of input string.
-From the start = 0 if char is not equal to letter or digit move one step ahead start++;
-From the end = length - 1 if char is not equal to letter or digit move on step behind end--;
-Do this till mid of the string i.e. start < end

Time Complexity
O(n/2) - as we need to iterate through each char & compare char till half of string. 
1/2 is ignored so O(n)

Space Complexity
O(1) - as we are not using any extra space
 */

//Time taken 10 mins
