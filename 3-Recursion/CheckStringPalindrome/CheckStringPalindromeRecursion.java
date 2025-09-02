public class CheckStringPalindromeRecursion {
    
    static boolean checkStringPalindrome(String input, int i) {
        if(i > input.length()/2) {
            return true;
        }

        if(input.charAt(i) != input.charAt(input.length() - i - 1)) {
            return false;
        }

        return checkStringPalindrome(input, i+1);
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println(checkStringPalindrome(input, 0));
    }
    
}

/* 
This is a using recursion (String is all letter)
-Using a single pointer method compare start and end letter of string if not equal 
means not palindrome return false
-If equal than move the pointer forward
-Continue this till pointer reaches mid of the string if it reaches mid means 
letters from start to mid and end to mid is same return true. This will be condition to break
recursion   

Time Complexity
O(n/2) - as we need to iterate through each char & compare char till half of string. 
1/2 is ignored so O(n)

Space Complexity
O(n) - As each recursion call will add a stack frame to the stack
    */

//Time taken 10 mins
