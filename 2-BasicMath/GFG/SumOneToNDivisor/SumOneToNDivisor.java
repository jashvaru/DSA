public class SumOneToNDivisor {

    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            int divSum = 0;
            for(int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    divSum = divSum + j;
                }
            }
            sum = sum + divSum;
        }
        System.out.println(sum);
    }
    
}

/* 
-The outer loop will run n times
-The inner loop will run from 1 to i times as we need to check each value if it is a 
divisor(divisor means if we divide that value with reference and remainder is 0) and than add it.
-Add the divisor value to a sum variable before outer loop ends

Time Complexity
O(n^2) - because first loop will run n times and inner loop will run i times

Space Complexity
O(1) - As we are using constant number of variable irrespective of input
*/

//Time take to solve: 17 mins

