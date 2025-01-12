
public class Palindrome {

    public static void main(String[] args) {
        int x = 121;
        int og = x;
        int reverse = 0;
        int ld = 0;

        while (x != 0) {
            ld = x % 10;
            reverse = reverse * 10 +ld;
            x = x / 10;
        }

        System.out.println(og < 0 ? false : og == reverse ? true : false); 
    }
}