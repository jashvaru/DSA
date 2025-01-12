public class Armstorng {

    public static void main(String[] args) {
        int x = 9474;
        int og = x;
        int arm = 0;
        int ld = 0;

        while(x > 0) {
            ld = x % 10;
            arm = arm + ld * ld * ld;
            x = x / 10;
        }

        System.out.println(og == arm ? true : false);
    }
}

/*
-We know how to reverse input using basic math that is extract digit using modulus of 10 and 
add that digit into the reference number(initially 0) by multiplying it by 10.
To reduce input by 1 digit divide by 10.
-As we have each digit cube it and do a summation at each iteration


Time Complexity
O(log10(n)) - because while loop will run till input is 0 and modulus can be 
represented using log10 as we are dividing the number with 10. (if divide by 2 it would be log2(n))

Space Complexity
O(1) - As we are using constant number of variable irrespective of input
 */

//Time taken to solve = 5 mins
