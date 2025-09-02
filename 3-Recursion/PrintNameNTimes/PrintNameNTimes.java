public class PrintNameNTimes {
    public static void printName(int n) {
        if(n < 1) {
            return;
        }
        printName(n-1);
        System.out.print("Jash ");
    }    
    
    public static void main(String[] args) {
        int n = 5;
        printName(n);
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

