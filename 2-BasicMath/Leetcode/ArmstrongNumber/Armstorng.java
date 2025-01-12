public class Armstorng {

    public static void main(String[] args) {
        int x = 9474;
        int og = x;
        int arm = 0;
        int ld = 0;

        while(x > 0) {
            ld = x % 10;
            System.out.println("last digit: " + ld);
            System.out.println("last digit cube: " + ld * ld * ld);
            arm = arm + ld * ld * ld;
            System.out.println("arm: " + arm);
            x = x / 10;
            System.out.println("x: " + x);
        }

        System.out.println(og == arm ? true : false);
    }
}
