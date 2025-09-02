
public class LCMandGCD {
    public static int[] lcmAndGcd(int a, int b) {
        int gcd = 1;
        int lcm = 0;
        int tmpa = a;
        int tmpb = b;
        int[] result = new int[2];
        while(tmpa > 0 && tmpb > 0) {
            if(tmpa > tmpb) {
                tmpa = tmpa % tmpb;
            } else {
                tmpb = tmpb % tmpa;
            }
        }
        if (tmpa == 0) {
            gcd = tmpb;
        } else {
            gcd = tmpa;
        }
        
        lcm = Math.abs(a * b) / gcd;
        result[0] = lcm;
        result[1] = gcd;
        return result;
    }

    public static void main(String[] args) {
        int[] result = lcmAndGcd(5, 10);
        System.out.println("LCM: " + result[0] + " GCD: " + result[1]);
    }
}


/*
-To compute GCD we have used Euclidean formula
The Euclidean algorithm is a method for finding the greatest common divisor (GCD) of two integers. 
The formula for the Euclidean algorithm is GCD(m,n)=GCD(n,m mod n), where (m mod n) is the remainder 
when (m) is divided by (n). But the condition is m should be greater than n. If not than do (m, n mode m).
continue doing this until either m or n is equal to 0. at the end m or n not equal to 0 is our GCD

-Once you have GCD, formula for LCM is absolute of (m . n)/gcd(m,n)


Time complexity 
O(logΦ(min(m.n))) - Taking Phi - Φ because divisor can be either m or n. 

Space complexity
O(1) - As we are using constant number of variable irrespective of input 
*/

//Time taken 12 mins
