
public class SumOfSeries {
    public static int sumOfSeries(int n) {
        if(n < 1) {
            return 0;
        }
        return n * n * n + sumOfSeries(n-1);
    }    
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfSeries(n));
    }
}

/*
-let n get subtracted till 0 using recursion and while making call to the func again cube the num 
and add it with func call

Time complexity 
O(n) - as func call will go upto n

Space complexity
O(n) - As each method call will allocate memory to variables upto n 
*/

//Time taken 6 mins

