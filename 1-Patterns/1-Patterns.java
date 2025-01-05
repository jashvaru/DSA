class Patterns {
    public static void main(String[] args) { 
        Patterns patterns = new Patterns();
        patterns.pattern8(5);
    }

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *****
         *****
         *****
         *****
         *****
        */
    }
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         */
    }
    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        /*
        1
        12
        123
        1234
        12345
         */
    }
    public void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }

        /*
        1
        22
        333
        4444
        55555
         */
    }
    public void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *****
         ****
         ***
         **
         *
         */

    }
    public void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        12345
        1234
        123
        12
        1
         */

    }
    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        /*
         *
         ***
         *****
         *******
         *********
         */

    }
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*n-(2*i+1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

/*
*********
 *******
  *****
   ***
    *
*/

    }
    public void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*n-(2*i+1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

/*
*********
 *******
  *****
   ***
    *
*/

    }
}
