public class PrimeNumber {
    public static String isPrime(int num) {
        int cnt = 0;

        for(int i = 1; i * i < num; i++) {
            if(num % i == 0) {
                cnt++;
                if((num/i) != i) {
                    cnt++;
                }
            }
        }

        if(cnt == 2){
            return "YES";
        }
        else{ 
            return "NO"; 
        }
    }    
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
}

/*
-Basic condition of prime number and increase the count.
-Brute force solution is iterate the loop till n times and check if number is has only 2 factors
1 and itself (O(n))
-Optimal solution is iterate the loop till square root of the number as all the factors will be available
bofore it.

Time complexity 
O(sqrt(n)) - as loop will go upto that

Space complexity
O(1) - As we are using constant number of variable irrespective of input 
*/

//Time taken 10 mins
