package GFG.CountDigits;

public class CountDigits {
    public static void main(String[] args) {
        int n = 12;
        int divideEvenlyCount = 0;
        int reduceNum = n;
        
        while(reduceNum > 0) {
            int digit = reduceNum % 10;
            if(n != 0 && n%digit == 0) {
                divideEvenlyCount++;
            }
            reduceNum = reduceNum/10;
        }    
        System.out.println(divideEvenlyCount);    
    }
}

/*  
-Used simple math that modules with 10 will give you remainder which will give you individual
digits of the number
-Divide will help to check if digit can divide the number evenly
-Used simple math that divide by 10 will give you quotient which is number with 1 less digit

Time Complexity
O(log10(n)) - because while loop will run till all the digits is processed and modulus can be 
represented using log10 as we are dividing the number with 10. (if divide by 2 it would be log2(n))

Space Complexity
O(1) - As we are using constant number of variable irrespective of input
*/


