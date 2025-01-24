import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
 
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,3,3,2};
        List<Integer> res = frequencyCount(arr);
        res.forEach(i -> System.out.print(i + " "));
    }
}
