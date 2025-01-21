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