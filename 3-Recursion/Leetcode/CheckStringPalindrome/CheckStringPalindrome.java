public class CheckStringPalindrome {
    static boolean checkStringPalindrome(String input) {
        String lowerCaseString = makeStringLowerCase(input);
        System.out.println("lower case string: " + lowerCaseString);
        int i = 0;
        int l = lowerCaseString.length();
        while (i < l/2) {
            if(lowerCaseString.charAt(i) != lowerCaseString.charAt(l-i-1)) {
                return false;
            }
            i++;
        }

        return true;
    }

   static String makeStringLowerCase(String input) {
    StringBuilder result = new StringBuilder();
        for (char charac : input.toCharArray()) {
            if (97 <= charac && charac <= 122) {
                result.append(charac);
            } else if (65 <= charac && charac <= 90) {
                charac = (char) (charac + 32);
                result.append(charac); 
            } else if (48 <= charac && charac <= 57) {
                result.append(charac);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // String input = "A man, a plan, a canal: Panama";
        // String input = "race a car";
        // String input = " ";
        String input = "0P";
        System.out.println(checkStringPalindrome(input));
    }
}

/* 
This is a brute force method
-I am checking each char of the string if it falls in the correct ascii range of digit and char and 
adding valid char one by one to make single lower case string
-Once that is done using 1 pointer technique to compare each char one by one at both start and end

Time Complexity
O(n) & O(n/2) - as we need to iterate through each char & compare char till half of string
worst case - O(n)

Space Complexity
O(n) - as a new string will be needed to store lowercase string
 */

//Time taken 25 mins
