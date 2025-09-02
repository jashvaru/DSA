import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountFrequencyOfNumberInArray {

    public static List<Integer> frequencyCount(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int[] freqArr = new int[arr.length+1];
        
        for(int i = 0; i < arr.length; i++) {
            int index = arr[i];
            freqArr[index] = freqArr[index] + 1; 
        }

        for(int i = 1; i < freqArr.length; i++) {
            System.out.println("index:" + i + "-" + "value:" + freqArr[i]);
            res.add(freqArr[i]);
        }
        return res;
    }
    
    public static List<Integer> frequencyCountOptimized(int[] arr) {
        List<Integer> res = new ArrayList<>(Collections.nCopies(arr.length+1, 0));
        
        for(int i = 0; i < arr.length; i++) {
            int index = arr[i]-1;
            res.set(index, res.get(index) + 1); 
        }
        return res;
    }
 
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,3,3,2};
        List<Integer> res = frequencyCountOptimized(arr);
        res.forEach(i -> System.out.print(i + " "));
    }
}

/* 
Brute force
-In the first approach I used two arrays one is input and other is to keep track of the frequency.
This needs 1 loop
-Based on the frequency array I create a list which need another loop to return a list

Optimized approach
-Create a list of fixed length with initial value as 0
-Use 1 for loop to update the value of the index

Time Complexity
brute force
O(n) - for the first loop and O(n) for the second loop so considering worst case it will be O(n)

Space Complexity
O(n) - As we will need n size list to store the frequency count

 */

//Time taken 10 mins
