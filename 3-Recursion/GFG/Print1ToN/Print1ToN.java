public class Print1ToN {
    public static void printNos(int n) {
        if(n < 1) {
            return;
        }
        printNos(n-1);
        System.out.print(n + " ");
    }    
    
    public static void main(String[] args) {
        int n = 5;
        printNos(n);
    }
}

/*
-let n get subtracted till 1 using recursion and than start to print the values

Time complexity 
O(n) - as func call will go upto n

Space complexity
O(n) - As each method call will allocate memory to variables upto n 
*/

//Time taken 6 mins
