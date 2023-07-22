import java.util.Scanner;

// -------------------------------- LOOPS --------------------------------- //

// QUESTIONS IN THIS FILE

// WHILE-LOOP
// PROGRAM - 1 // HELLO WORLD 5 TIMES
// PROGRAM - 2 // PRINT NUMBERS FROM 1 - 10
// PROGRAM - 3 // PRIINT NUMBERS FROM 1 - n
// PROGRAM - 4 // PRINT THE SUM OF FIRST N NATURAL NUMBERS
// PROGRAM - 5 // PRINT REVERSE OF A NUMBER
// PROGRAM - 6 // REVERSE THE NUMBER
// FOR-LOOP
// PROGRAM - 7 // PRINT HELLO WORLD n TIMES
// PROGRAM - 8 // PRINT SQUARE PATTERN
// DO-WHILE-LOOP
// PROGRAM - 9 // PRINT HELLO WORLD N TIMES
// PROGRAM - 10 // PRINT UNTIL USER ENTERS MULTIPLE OF 10
// PROGRAM - 11 // PRINT NUMBERS AND SKIP MULTIPLES OF 10
// PROGRAM - 12 // CHECK IF NUMBER IS PRIME OR NOT

// -- PRACTICE PROBLEMS - 3------------------------------------
    
// -- PROBLEM - 1 -- // WAP that reads set of integers and then prints the sum of even and odd integers
// -- PROBLEM - 2 -- // WAP TO FIND FACTORIAL OF ANY NUMBER ENTERED BY USER     
// -- PROBLEM - 3 -- // MULTIPLICATION TABLE OF  NUMBER


public class loops_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// LOOPS
        
        // while-loop
        // while(condition) {
        //         do something
        // }



// PROGRAM - 1 // HELLO WORLD 5 TIMES
        // int counter = 0;
        // while(counter < 5) {
        //      System.out.println("Hello World");
        //      counter++;
        // }



// PROGRAM - 2 // PRINT NUMBERS FROM 1 - 10
        // int counter = 1;
        // while(counter <= 10) {
        //         System.out.println(counter);
        //         counter++;
        // }



// PROGRAM - 3 // PRIINT NUMBERS FROM 1 - n
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter <= n) {
        //         System.out.println(counter);
        //         counter++;
        // }



// PROGRAM - 4 // PRINT THE SUM OF FIRST N NATURAL NUMBERS
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i <= n) {
        //         sum = sum + i;
        //         i++;
        // } 
        // System.out.println("Sum is : " + sum);



// PROGRAM - 5 // PRINT REVERSE OF A NUMBER
        // int n = sc.nextInt();
        // while(n > 0) {
        //         int lastDigit = n % 10;
        //         System.out.print(lastDigit);
        //         n = n / 10;
        // }
        


// PROGRAM - 6 // REVERSE THE NUMBER
        // int n = sc.nextInt();
        // int rev = 0;
        // while(n > 0) {
        //         int lastDigit = n % 10;
        //         rev = (rev*10) + lastDigit;
        //         n = n / 10;
        // }
        // System.out.println(rev);

        

        //for-loop
        // for(initialisation; condition; updation) {
        //         //do something
        // }



// PROGRAM - 7 // PRINT HELLO WORLD n TIMES
        // int n = sc.nextInt();
        // for(int i = 0; i <= n; i++) {
        //         System.out.println(i);
        // }



// PROGRAM - 8 // PRINT SQUARE PATTERN
        // int n = sc.nextInt();
        
        // for(int i = 1; i <= n; i++) {
        //         System.out.println("*****");
        // }



        // do-while loop
        // do {
        //         //do something
        // } while (condition)



// PROGRAM - 9 // PRINT HELLO WORLD N TIMES
        // int n = sc.nextInt();
        // int i = 1;
        // do {
        //         System.out.println(i);
        //         i++;
        // } while (i <= n);



// PROGRAM - 10 // PRINT UNTIL USER ENTERS MULTIPLE OF 10
        // do {
        //         System.out.println("Enter a number: ");
        //         int n = sc.nextInt();
        //         if (n % 10 == 0) {
        //                 break;
        //         }
        //         System.out.println(n);
        //  } while(true);



// PROGRAM - 11 // PRINT NUMBERS AND SKIP MULTIPLES OF 10
        //  do {
        //         System.out.println("Enter a number : ");
        //         int n = sc.nextInt();
        //         if (n % 10 == 0) {
        //                 continue;
        //         }
        //         System.out.println(n);
        //  } while(true);

        

// PROGRAM - 12 // CHECK IF NUMBER IS PRIME OR NOT
        // int n = sc.nextInt();

        // if(n == 2) {
        //         System.out.println("n is prime");
        // } else {
        //         boolean isPrime = true;
        //         for(int i=2; i<=Math.sqrt(n); i++) {
        //                 if (n% i == 0) {
        //                         isPrime = false;
        //                 }
        //         }
        
        //         if(isPrime == true) {
        //                 System.out.println("N is prime");
        //         } else {
        //                 System.out.println("n is not prime");
        //         }
        // }


// -- PRACTICE PROBLEMS - 3------------------------------------
    
// -- PROBLEM - 1 -- // WAP that reads set of integers and then prints the sum of even and odd integers

        // System.out.print("Enter the number of integers: ");
        // int count = sc.nextInt();

        // int evenSum = 0;
        // int oddSum = 0;

        // System.out.println("Enter the integers:");

        // for (int i = 0; i < count; i++) {
        //     int num = sc.nextInt();

        //     if (num % 2 == 0) {
        //         evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }
        // }

        // System.out.println("Sum of even integers: " + evenSum);
        // System.out.println("Sum of odd integers: " + oddSum);

        // sc.close();



// -- PROBLEM - 2 -- // WAP TO FIND FACTORIAL OF ANY NUMBER ENTERED BY USER     
                // System.out.print("Enter a number: ");
                // int number = sc.nextInt();

                // int factorial = 1;
                // for (int i = 2; i <= number; i++) {
                //         factorial = factorial * i;
                // }

                // System.out.println("Factorial of " + number + " = " + factorial);

                // sc.close();
        


 // -- PROBLEM  - 3 -- // MULTIPLICATION TABLE OF  NUMBER
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();

        // System.out.println("Multiplication Table for " + number + ":");

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(number + " x " + i + " = " + (number * i));
        // }

        // sc.close();
    }
    
}
