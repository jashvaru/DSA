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