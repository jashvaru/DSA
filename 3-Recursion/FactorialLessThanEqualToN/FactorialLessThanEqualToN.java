import java.util.ArrayList;

public class FactorialLessThanEqualToN {
    
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> res = new ArrayList<>();
        long fact = 1;
        long i = 1;

        while(fact <= n) {
            res.add(fact);
            i++;
            fact = fact * i;
        }
        return res;
    }


    public static void main(String[] args) {
        int n = 6;
        factorialNumbers(n).forEach(num -> System.out.println(num + " "));
    }
}

/*
-formula for factorial - n!=n×(n−1)×(n−2)×⋯×1
-As we need to find the factorial numbers less than or equal to n we can do that while calculating 
factorial itself
-factorial of each number starting from 1 will go in this manner
1! = 1          = 1
2! = 1*2        = 2
3! = 1*2*3      = 6
4! = 1*2*3*4    = 24
5! = 1*2*3*4*5  = 120
and so on....
-Keep fact as 1 and incremental number(i) also 1
-Check if fact is less than n if yes than increment i, multiply it with fact and save the 
result in fact. fact = fact * i;

Time complexity 
O(log(n)) - as while loop will run based on the factorial less than or equal to n.
higher the value of n more itreations it will take.

Space complexity
O(log(n)) - As size of array list will grow with the increase in the value of n 
*/

//Time taken 10 mins


/* 
-Brute force way using recursion

import java.util.ArrayList;

public class FactorialLessThanEqualToN {
    
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> res = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            long factRes = fact(i);
            if(factRes <= n) {
                res.add(factRes);
            } else {
                break;
            }
        }
        
        return res;
    }


    static long fact(long n) {
        if(n < 1) {
            return 1;
        }
        return n * fact(n -1);
    }

    public static void main(String[] args) {
        int n = 6;
        factorialNumbers(n).forEach(num -> System.out.println(num + " "));
    }
}

 */