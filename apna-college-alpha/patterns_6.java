import java.util.Scanner;

// HOW TO APPROACH PATTERN PROBLEMS ------------------------------------------//

//STEP-1 -> no. of line == no. rows == no. of times outer loop will run == n
//STEP-2 -> identify no. of columns with each row
//STEP-3 -> what do you need to print


// -------------------------------- PATTERNS -------------------------------------- //     

// PATTERNS (PART-1) ADVANCED

//-- PROGRAM-1 // PRINT STAR PATTERN
//-- PROGRAM-2 // PRINT INVERTED STAR PATTERN
//-- PROGRAM-3 // PRINT HALF PYRAMID PATTERN  
//-- PROGRAM-4 // PRINT HALF PYRAMID PATTERN  

// PATTERNS (PART-2) ADVANCED  
// PROGRAM-5    // HOLLOW RECTANGLE PATTERN  
// PROGRAM-6    // INVERTED & ROATED HALF-PYRAMID
// PROGRAM-7    // INVERTED HALF PYRAMID WITH NUMBERS
// PROGRAM-8    // FLYOD'S TRIANGLE
// PROGRAM-9    // 0-1 TRIANGLE
// PROGRAM-10   // BUTTERFLY PATTERN
// PROGRAM-11   // SOLID RHOMBUS
// PROGRAM-12   // HOLLOW RHOMBUS PATTERN
// PROGRAM-13   // TRIANGLE PATTERN
// PROGRAM-14   // DIAMOND PATTERN
// PROGRAM-15   // NUMBER PYRAMID
// PROGRAM-16   // PALINDROMIC PATTERN WITH NUMBERS


public class patterns_6 {
//-- PROGRAM-5 // HOLLOW RECTANGLE PATTERN 
        // public static void hollow_rectangle(int totRows, int totCols) {
        //         //outer loop
        //         for(int i=1; i<=totRows; i++) {
        //                 //inner - column
        //                 for(int j=1; j<=totCols; j++) {
        //                         //cell - (i,j)
        //                         if(i == 1 || i == totRows || j == 1 || j == totCols) {
        //                                 //boundary cells
        //                                 System.out.print("*");
        //                         } else {
        //                                 System.out.print(" ");
        //                         }
        //                 }
        //                 System.out.println();
        //         }
        // }

// PROGRAM-6 // INVERTED & ROATED HALF-PYRAMID
// public static void inverted_rotated_half_pyramid(int n){
//         for(int i=1; i<=n; i++) {
//                 //spaces
//                 for(int j=1; j<=n-i; j++) {
//                         System.out.print(" ");
//                 } 

//                 //stars
//                 for(int j=1; j<=i;j++) {
//                         System.out.print("*");
//                 }
//                  System.out.println();
//         }
       
// }

// PROGRAM-7 // INVERTED HALF PYRAMID WITH NUMBERS
        // public static void inverted_half_pyramid_with_numbers(int n) {
        //         for(int i=1; i<=n; i++) {
        //                 for(int j=1;j<=n-i+1; j++) {
        //                         System.out.print(j);
        //                 }
        //                 System.out.println();
        //         }
        // }

// PROGRAM-8 // FLYOD'S TRIANGLE
        // public static void flyods_triangle(int n) {
        //         int counter = 1;
        //         for(int i=1; i<=n; i++) {
        //                 for(int j=1;j<=i;j++) {
        //                         System.out.print(counter + " ");
        //                         counter++;
        //                 }
        //                 System.out.println();
        //         }
                
        // }

//PROGRAM-9 // 0-1 TRIANGLE
        // public static void zero_one_triangle(int n) {               
        //         for(int i=1; i<=n; i++) {
        //                 for(int j=1;j<=i;j++) {
        //                         if((i+j) % 2 == 0) {
        //                         System.out.print("1");
        //                         } else {
        //                                 System.out.print("0");
        //                         }
        //                 }
        //                 System.out.println();
        //         }
                
        // }

// PROGRAM-10 // BUTTERFLY PATTERN
        // public static void butterfly_pattern(int n) {
        //          //1st half
        //         for(int i=1; i<=n; i++) {
        //                 //stars
        //                 for(int j=1; j<=i; j++) {
        //                         System.out.print("*");
        //                 }
        //                 //spaces - 2*(n-i)
        //                 for(int j=1;j<=2*(n-i); j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //stars
        //                  for(int j=1; j<=i; j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.println();
        //         }
        //         //2nd half
        //         for(int i=n; i>=1; i--) {
        //                 //stars
        //                 for(int j=1; j<=i; j++) {
        //                         System.out.print("*");
        //                 }
        //                 //spaces - 2*()
        //                 for(int j=1;j<=2*(n-i); j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //stars
        //                  for(int j=1; j<=i; j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.println();
        //         }
        // }

// PROGRAM-11 // SOLID RHOMBUS
        // public static void solid_rhombus(int n) {
        //         for(int i=1; i<=n; i++) {
        //                 //spaces
        //                 for(int j=i; j<=n; j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //stars
        //                 for(int j=1;j<=n;j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.println();
        //         }

        // }

// PROGRAM-12 // HOLLOW RHOMBUS PATTERN
        //  public static void hollow_rhombus(int n) {
        //         for(int i=1; i<=n; i++) {
        //                 //spaces
        //                 for(int j=i; j<=n; j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //hollow rectangle - stars
        //                 for(int j=1;j<=n;j++) {
        //                         if( i == 1 || i == n || j == 1 || j == n) {
        //                                 System.out.print("*");
        //                         } else {
        //                                 System.out.print(" ");
        //                         }
        //                 }
        //                 System.out.println();
        //         }
        // }

// PROGRAM-13 // TRIANGLE
        // public static void triangle(int n) {
        //         for(int i=1; i<=n; i++) {
        //                 //spaces
        //                 for(int j=1;j<=n-i;j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //stars
        //                 for(int j=1;j<=2*i-1;j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.println();
        //         }
        // }

// PROGRAM-14 // DIAMOND PATTERN
        // public static void diamond(int n) {
        //         //1st half
        //         for(int i=1; i<=n; i++) {
        //                 //spaces
        //                 for(int j=1;j<=n-i;j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //stars
        //                 for(int j=1;j<=2*i-1;j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.println();
        //         }
        //         //2nd half
        //         for(int i=n; i>=1; i--) {
        //                 //spaces
        //                 for(int j=1;j<=n-i;j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //stars
        //                 for(int j=1;j<=2*i-1;j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.println();
        //         }
        
        // }

// PROGRAM-15 // NUMBER PYRAMID
        // public static void number_pyramid(int n) {
        //         for(int i=1; i<=n; i++) {
        //                 //spaces
        //                 for(int j=1;j<=n-i;j++) {
        //                         System.out.print(" ");
        //                 }
        //                 //stars
        //                 for(int j=1;j<=i;j++) {
        //                         System.out.print(i + " ");
        //                 }
        //                 System.out.println();
        //         }
        // }

// PROGRAM-16 // PALINDROMIC PATTERN WITH NUMBERS
        // public static void palindromic(int n) {
        //          for(int i=1; i<=n; i++) {
        //                 //spaces
        //                 for(int j=1;j<=n-i;j++) {
        //                         System.out.print(" ");
        //                 }
        //                 for(int j=i; j>=1; j--) {
        //                         System.out.print(j);
        //                 }
        //                 for(int j=2; j<=i; j++) {
        //                         System.out.print(j);
        //                 }
        //                 System.out.println();
        //         }
        // }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   

// -------------------------------- PATTERNS (PART-1) -------------------------------------- //     


//-- PROGRAM-1 // PRINT STAR PATTERN
        // int n = sc.nextInt();
        // for (int i=1;i<=n;i++) {
        //         for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        // }



//-- PROGRAM-2 // PRINT INVERTED STAR PATTERN
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++) {
        //      for(int j=i;j<=n;j++) {
        //               System.out.print("*");
        //       }
        //       System.out.println();
        // } 


//-- PROGRAM-3 // PRINT HALF PYRAMID PATTERN  
        // int n = sc.nextInt();
        // for(int i=0;i<=n;i++) {
        //         for(int j=1;j<=i;j++) {
        //                 System.out.print(j);
        //         }
        //         System.out.println();
        // }



//-- PROGRAM-4 // PRINT HALF PYRAMID PATTERN  
        // int n = sc.nextInt();
        // char ch = 'A';        
        // for (int i = 1; i <= n; i++) {
        //         for (int j = 1; j <= i; j++) {
        //         System.out.print(ch);
        //         ch++;
        //         }
        //         System.out.println();
        // }
    

// -------------------------------- PATTERNS (PART-2) ADVANCED -------------------------------------- //        

// PROGRAM-5 // HOLLOW RECTANGLE PATTERN
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // hollow_rectangle(a, b);

// PROGRAM-6 // INVERTED & ROATED HALF-PYRAMID
        // int n = sc.nextInt();
        // inverted_rotated_half_pyramid(n);

// PROGRAM-7 // INVERTED HALF PYRAMID WITH NUMBERS
        // int n = sc.nextInt();
        // inverted_half_pyramid_with_numbers(n);

// PROGRAM-8 // FLYOD'S TRIANGLE
        // int n = sc.nextInt();
        // flyods_triangle(n);

// PROGRAM-9 // 0-1 TRIANGLE
        // int n = sc.nextInt();
        // zero_one_triangle(n);

// PROGRAM-10 // BUTTERFLY PATTERN
        // int n = sc.nextInt();
        // butterfly_pattern(n);

// PROGRAM-11 // SOLID RHOMBUS
        // int n = sc.nextInt();
        // solid_rhombus(n);

// PROGRAM-12 // HOLLOW RHOMBUS PATTERN
        // int n = sc.nextInt();
        // hollow_rhombus(n);

// PROGRAM-13 // TRIANGLE PATTERN
        // int n =sc.nextInt();
        // triangle(n);

// PROGRAM-14 // DIAMOND PATTERN
        // int n =sc.nextInt();
        // diamond(n);

// PROGRAM-15 // NUMBER PYRAMID
        // int n = sc.nextInt();
        // number_pyramid(n);

// PROGRAM-16 // PALINDROMIC PATTERN WITH NUMBERS
        // int n = sc.nextInt();
        // palindromic(n);








    }
}
