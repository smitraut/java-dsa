import java.util.Scanner;

//------QUESTIONS IN THIS FILE----------//

// PROGRAM-1  // FUNCTION SYNTAX 
// PROGRAM-2  // SUM OF TWO NUMBERS
// PROGRAM-3  // CALL BY VALUE
// PROGRAM-4  // PRODUCT OF A AND B
// PROGRAM-5  // FACTORIAL OF N
// PROGRAM-6  // BINOMIAL COEFFICIENT //  UNCOMMENT PROGRAM 5 FUNCTION FOR THIS TO RUN
// PROGRAM-7  // CHECK IF NUMBER IS PRIME OR NOT
//** PROGRAM-8  // CHECK IF NUMBER IS PRIME OR NOT OPTIMIZED
//** PROGRAM-9  // CHECK IF NUMBER IS PRIME OR NOT FROM RANGE A TO B // UNCOMMENT PROGRAM 7 FUNCTION FOR THIS TO RUN
// PROGRAM-10 // CONVERT FROM BINARY TO DECIMAL
// PROGRAM-11 // CONVERT FROM DECIMAL TO BINARY 

//---PRACTICE QUESTIONS - 4
//PROGRAM-1 // AVERAGE OF THREE NUMBERS
//PROGRAM-2 // NUMBER IS EVEN OR ODD
//PROGRAM-3 // NNUMBER IS PALINDROME
//PROGRAM-4 // SUM OF N NATURAL NUMBERS
//PROGRAM-5 // SUM OF DIGITS

public class functions_5 {
    // PROGRAM-1 // FUNCTION SYNTAX // Functions inside of class are called methods //always written above the before function
        // public static void printHelloWorld() {
        //     System.out.println("Hello World");
        //     return;
        // }
    
    // PROGRAM-2 // SUM OF TWO NUMBERS
        // public static int addTwoNumbers(int a, int b){  // value whoch is input is called parameters or formal parameters
        //     int sum = a+b;
        //     return sum;
        // }

    // PROGRAM-3 // CALL BY VALUE
        // public static void swap( int a, int b) {
        //     int temp = a;
        //     a=b;
        //     b=temp;

        //     System.out.println("A = " + a);
        //     System.out.println("B = " + b);
        //     return;
        // }

    // PROGRAM-4 // PRODUCT OF A AND B
        // public static int prod (int a, int b) {
        //     int product = a*b;
        //     return product;
        // }

    // PROGRAM-5 // FACTORIAL OF N
        // public static int factorial(int n){
        //     int fact = 1 ;
        //     if (n==0) {
        //         return 0;
        //     }
        //     for(int i=1;i<=n;i++) {
        //         fact=fact*i;
        //     }
        //     return fact;
        // }
    
    // PROGRAM-6 // BINOMIAL COEFFICIENT
        // public static int binomialCoefficient(int n, int r) {
        //     int factN= factorial(n);
        //     int factR = factorial(r);
        //     int factnmr = factorial(n-r);
         
        //    int binomialCoefficient = factN / (factR * factnmr);
        //    return binomialCoefficient;
        // }

    // PROGRAM-7 // CHECK IF NUMBER IS PRIME OR NOT

        // public static boolean isPrime(int n) {
        //     for(int i=2;i<=n-1;i++) {
        //         if(n % i == 0) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }

    // PROGRAM-8 // CHECK IF NUMBER IS PRIME OR NOT OPTIMIZED
        // public static boolean isPrime(int n) {
        //     if(n==2) {
        //         return true;
        //     }
        //     for(int i=2; i<=Math.sqrt(n); i++) {
        //         if(n % i == 0) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }
    
    // PROGRAM-9 // CHECK IF NUMBER IS PRIME OR NOT FROM RANGE A TO B
        // public static void primeInRange(int n) {
        //     for(int i=2;i<=n;i++){
        //         if(isPrime(i)) {
        //             System.out.print(i + " ");
        //         }
        //     }
        //     System.out.println();
        // }

    // PROGRAM-10 // CONVERT FROM BINARY TO DECIMAL
            // public static void binToDec(int binNum){
            //     int num = binNum;
            //     int pow = 0;
            //     int decNum = 0;

            //     while(binNum>0) {
            //         int lastDigit = binNum % 10;
            //         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            //         pow++;
            //         binNum = binNum/10;
            //     }
            //     System.out.println("Decimal of " + num + " = " + decNum);
            // }
    
    // PROGRAM-11 // CONVERT FROM DECIMAL TO BINARY 
            // public static void decToBin(int decNum) {
            //     int num = decNum;
            //     int pow = 0;
            //     int binNum = 0; 

            //     while(decNum>0) {
            //         int rem = decNum % 2;
            //         binNum = binNum + (rem * (int)Math.pow(10, pow));
            //         pow++; 
            //         decNum = decNum/2;
            //     }
            //     System.out.println("Binary of " + num + " = " + binNum);
            // }

        //PRACTICE PROGRAMS

        //PROGRAM-1 // AVERAGE OF THREE NUMBERS
            // public static int average(int a, int b, int c) {
            //     int avg =  (a+b+c) / 3;
            //     return avg;
            // }

        //PROGRAM-2 // NUMBER IS EVEN OR ODD
            // public static boolean isPrime(int n) {
            //     if(n%2==0) {
            //         return true;
            //     }
            //     return false;
            // }

        //PROGRAM-3 // NUMBER IS PALINDROME
            // public static boolean isPalindrome(int n) {
            //     int temp = n;
            //     int rev = 0;
            //     int rem;
            //     while(temp!=0) {
            //         rem  = temp%10;
            //         rev = rev*10 + rem;
            //         temp = temp/10;
            //     }   
            //     if(n==rev) {
            //         return true;
            //     }
            //     return false;

            // }

        //PROGRAM-4 // SUM OF N NATURAL NUMBERS
            // public static int sum(int n) {
            //     int sum =0;
            //     for(int i=0;i<=n;i++) {
            //         sum+=i;
            //     }
            //     return sum;
            // }

        //PROGRAM-5 // SUM OF DIGITS
            // public static int sumDigits(int n) {
            //     int sumOfDigits=0;
            //     while(n>0) {
            //         int lastDigit=n%10;
            //         sumOfDigits+=lastDigit;
            //         n/=10;
            //     }
            //     return sumOfDigits;
            // }
        
        
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

    // PROGRAM-1 // PRINT HELLO WORLD 
        // printHelloWorld(); //function call

    // PROGRAM-2 // SUM OF TWO NUMBERS  
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = addTwoNumbers(a, b); // value which is passed in function call is called is called arguments or actual parameters
        // System.out.println("Sum is: " + sum);

    // PROGRAM-3 // CALL BY VALUE // means copy of original variable is sent to function and not the original variable
        // int a =sc.nextInt();
        // int b = sc.nextInt();
        // swap(a, b );                      // value of a and b only changed for function
        // System.out.println("A = " + a);   // value is the same here
        // System.out.println("B = " + b);
    
    // PROGRAM-4 // PRODUCT OF TWO NUMBERS
        // while(true) {
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int prod = prod(a, b);
        //     System.out.println("Product = " + prod);
        // }

    // PROGRAM-5 // FACTORIAL OF N
            // int n = sc.nextInt();
            // int fact = factorial(n);
            // System.out.println(fact);

    // PROGRAM-6 // BINOMIAL COEFFICIENT  //
            // int n = sc.nextInt();
            // int r = sc.nextInt();
            // System.out.println("Binomial Coefficient = " + binomialCoefficient(n, r));

    // PROGRAM-7 // CHECK IF NUMBER IS PRIME OR NOT
            // int n = sc.nextInt();
            // boolean isPrime = isPrime(n);
            // System.out.println(isPrime);
    
    // PROGRAM-8 // CHECK IF NUMBER IS PRIME OR NOT OPTIMIZED
            // int n = sc.nextInt();
            // boolean isPrime = isPrime(n);
            // System.out.println("Number " + n + " is Prime : " + isPrime);

    // PROGRAM-9 // CHECK IF NUMBER IS PRIME OR NOT FROM RANGE A TO B
        // int n = sc.nextInt();
        // primeInRange(n);

    // PROGRAM-10 // CONVERT FROM BINARY TO DECIMAL
        // int binNum = sc.nextInt();
        // binToDec(binNum);

    // PROGRAM-11 // CONVERT FROM DECIMAL TO BINARY 
        // int decNum = sc.nextInt();
        // decToBin(decNum);
    
    //PRACTICE QUESTIONS
    
    //PROGRAM-1 // AVERAGE OF THREE NUMBERS
        // int a = sc.nextInt();
        // int b =  sc.nextInt();
        // int c = sc.nextInt();
        // double avg = average(a, b, c);
        // System.out.println(avg);

    //PROGRAM-2 // NUMBER IS EVEN OR ODD
        // int n = sc.nextInt();
        // boolean isPrime = isPrime(n);
        // System.out.println(isPrime);

    //PROGRAM-3 // NNUMBER IS PALINDROME
        // int n = sc.nextInt();
        // boolean isPalindrome = isPalindrome(n);
        // System.out.println(isPalindrome);
        
    //PROGRAM-4 // SUM OF N NATURAL NUMBERS
        // int n = sc.nextInt();
        // int sum = sum(n);
        // System.out.println(sum);

    //PROGRAM-5 // SUM OF DIGITS

        // System.out.print("Input an integer: ");
        // int digits=sc.nextInt();
        // System.out.println("The sum is "+sumDigits(digits));
















    }
}
