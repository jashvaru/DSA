public class PrintNTo1 {
    public static void printNos(int n) {
        if(n < 1) {
            return;
        }
        System.out.print(n + " ");
        printNos(n-1);
    }    
    
    public static void main(String[] args) {
        int n = 5;
        printNos(n);
    }
}

/*
-Print the values and let n get subtracted till 1 using recursion

Time complexity 
O(n) - as func call will go upto n

Space complexity
O(n) - As each method call will allocate memory to variables upto n 
*/

//Time taken 6 mins
