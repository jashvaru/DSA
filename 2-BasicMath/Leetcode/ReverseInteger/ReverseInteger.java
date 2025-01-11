public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        int ld = 0;
        int reverseNum = 0;
        while (x != 0) {
            ld = x % 10;

            if(reverseNum > Integer.MAX_VALUE/10 || (reverseNum == Integer.MAX_VALUE/10 && ld > Integer.MAX_VALUE % 10)) {
                reverseNum = 0;
                break;
            }

            if(reverseNum < Integer.MIN_VALUE/10 || (reverseNum == Integer.MIN_VALUE/10 && ld < Integer.MIN_VALUE % 10)) {
                reverseNum = 0;
                break;
            }


            reverseNum = reverseNum * 10 + ld;
            x = x / 10;
        }
        System.out.println(reverseNum);
    }
}

/*
-We know how to reverse input using basic math that is extract digit using modulus of 10 and 
add that digit into the reference number(initially 0) by multiplying it by 10.
To reduce input by 1 digit divide by 10.
-As we want to reverse both positive and negative value while loop will stop when input is 0
-Java have predefined values of max int and min int use that for comparision
-before adding the last digit check if the last digit is min/max of the left most digit of MIN/MAX int to avoid overflow

-Concept of int overflow make this problem a bit tricky

Time Complexity
O(log10(n)) - because while loop will run till input is 0 and modulus can be 
represented using log10 as we are dividing the number with 10. (if divide by 2 it would be log2(n))

Space Complexity
O(1) - As we are using constant number of variable irrespective of input
 */

//Time taken to solve = 21 mins (with some help of chat gpt)