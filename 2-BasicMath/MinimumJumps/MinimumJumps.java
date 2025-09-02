public class MinimumJumps {

    public static int minJumps(int[] arr) {
        int minJumps = 0;
        int i = 0;
        while(i < arr.length-1) {
            if(arr[i] == 0) {
                if(minJumps == 0) {
                    minJumps = -1;
                }
                break;
            } else {
                i = i + arr[i];
                minJumps++;
            }
        }

        return minJumps;
    }

    public static void main(String[] args) {
        int[] arr = {9,10,1,2,3,4,8,0,0,0,0,0,0,0,1};
        System.out.println(minJumps(arr));
    }
}
