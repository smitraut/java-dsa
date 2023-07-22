import java.util.Scanner;

// HOW TO APPROACH PATTERN PROBLEMS

//STEP-1 -> no. of line == no. rows == no. of times outer loop will run == n
//STEP-2 -> identify no. of columns with each row
//STEP-3 -> what do you need to print

public class patterns_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int n = sc.nextInt();
                     

// 1.  *****
//     *****
//     *****
//     *****
//     *****
        // for(int i=1; i<=5; i++) {
        //     for(int j=1; j<=5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// 2.  *
//     **
//     ***
//     ****
//     *****
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// 3.  *****
//     ****
//     ***
//     **
//     *
        // for(int i=1; i<=n; i++) {
        //     for(int j=i; j<=n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// 4.  1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// 6.       *
//         **
//        ***
//       ****
//      *****
        // for(int i=1; i<=n; i++) {
        //     for(int j=i; j<=n; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// 7.   *****
//       ****
//        ***
//         **
//          *
        // for(int i=1; i<=n; i++) {
        //     for(int j=1;j<=i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j<=n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



// 8.      *
//        ***
//       *****
//      *******
//     *********
        // for(int i=1; i<=n; i++) {
        //         for(int j=i; j<=n; j++) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=1; j<=i; j++) {
        //                 System.out.print("*");
        //         }
        //         for(int j=2; j<=i; j++) {
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }


// 9.  *********
//      *******
//       *****
//        ***
//         *
        // for(int i=1; i<=n; i++) {
        //         for(int j=1; j<=i; j++) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print("*");
        //         }
        //         for(int j=i; j<=n-1; j++) {
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }


// 10.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
        // for(int i=1; i<=n; i++) {
        //         for(int j=i;j<=n; j++) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++) {
        //                 System.out.print("*" + " ");
        //         }
        //         System.out.println();
        // }

// 11.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
        // for(int i=1; i<=n; i++) {
        //         for(int j=1; j<=i; j++) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print("*" + " ");
        //         }
        //         System.out.println();
        // }


// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
        // for(int i=1; i<=n; i++) {
        //         for(int j=1; j<=i; j++) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print("*" + " ");
        //         }
        //         System.out.println();
        // }
        // for(int i=n; i>=1; i--) {
        //         for(int j=1; j<=i; j++) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print("*" + " ");
        //         }
        //         System.out.println();
        // }


// 13.      *
//         * *
//        *   *
//       *     *
//      *********


// 14.  *********
//       *     *
//        *   *
//         * *
//          *


// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *


// 16.           1
//             1   1
//           1   2   1
//         1   3   3   1
//       1   4   6   4   1


// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1
        // for(int i=1; i<=n; i++) {
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=i; j>=1; j--) {
        //                 System.out.print(j);
        //         }
        //         for(int j=2; j<=i; j++) {
        //                 System.out.print(j);
        //         }
        //         System.out.println();
        // }
        // for(int i=n-1; i>=1; i--) {
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print(" ");
        //         }
        //         for(int j=i; j>=1; j--) {
        //                 System.out.print(j);
        //         }
        //         for(int j=2; j<=i; j++) {
        //                 System.out.print(j);
        //         }
        //         System.out.println();
        // }


// 18.   **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********


// 19.    *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *


// 20.    ****
//        *  *
//        *  *
//        *  *
//        ****

// 21.    1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

// 23.        *      *
//          *   *  *   *
//        *      *      *

// 24.    *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *

// 25.       *****
//          *   *
//         *   *
//        *   *
//       *****

// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6
        // for (int i=1; i<=n; i++) {
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print(i + " ");
        //         } 
        //         System.out.println();
        // }

// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11

// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *


// 29.      
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5
        // for(int i=1; i<=n; i++) {
        //         for(int j=n; j>=i; j--) {
        //                 System.out.print("  ");
        //         }
        //         for(int j=i; j>=1; j--) {
        //                 System.out.print(j + " ");
        //         }
        //         for(int j=2; j<=i; j++) {
        //                 System.out.print(j + " ");
        //         }
        //         System.out.println();
        // }


// 31.      4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4   
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4   
// for(int i=1; i<=2*n-1; i++) {
//         for(int j=1; j<=2*n-1; j++) {
//                 System.out.print("4 ");
//         }
//         System.out.println();
// }

// 32.    E
//        D E
//        C D E
//        B C D E
//        A B C D E

// 33.    a
//        B c
//        D e F
//        g H i J
//        k L m N o
     
// 34.    E D C B A
//        D C B A
//        C B A
//        B A
//        A
       
// 35.    1      1
//        12    21
//        123  321
//        12344321
        // for(int i=1; i<=n; i++) {
        //         for(int j=1; j<=i; j++) {
        //                 System.out.print(j);
        //         }
        //         for(int j=n-1; j>=i; j--) {
        //                 System.out.print("  ");
        //         }
        //         for(int j=i; j>=1; j--) {
        //                 System.out.print(j);
        //         }
        //         System.out.println();
        // }
































    }
    
}
