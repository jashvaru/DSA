public class Fibonacci {

    static int fib(int n) {
        if(n <= 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        int fibSum = fib(n-1) + fib(n-2);
        System.out.println(fibSum);
    }
    
}

/* 
-Fibonacci number using multiple recursion call
-Here since we are calling recursion twice it will create a recursion tree with two nodes each

Time Complexity
O(2^n) - As it will have two nodes each it will grow exponentially till n

Space Complexity
O(n) - As each recursion call will occupy a stack frame in stack

 */

//Time taken 15mins

check out this optimized solution

class Solution 
{
    public int fib(int N)
    {
        if(N <= 1)
            return N;
        
		int a = 0, b = 1;
		
		while(N-- > 1)
		{
			int sum = a + b;
			a = b;
			b = sum;
		}
        return b;
    }
}