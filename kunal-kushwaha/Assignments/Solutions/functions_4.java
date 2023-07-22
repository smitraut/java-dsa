package DSA.Assignments.Solutions;
import java.util.Scanner;

public class functions_4 {

    //PROGRAM-1 // MAX-MIN
        // public static int max(int a, int b, int c) {
        //     if(a>b) {
        //         return a;
        //     } else if(b>c) {
        //         return b;
        //     } else {
        //         return c;
        //     }
        // }

        //  public static int min(int a, int b, int c) {
        //     if(a<b) {
        //         return a;
        //     } else if(b<c) {
        //         return b;
        //     } else {
        //         return c;
        //     }
        // }

    //PROGRAM-2 // EVEN-ODD
        // public static boolean isEven(int n) {
        //     if(n%2==0) {
        //         return true;
        //     } else {
        //         return false;
        //     }
        // }

    //PROGRAM-3 // VOTE IF 18
        // public static boolean voteEligibility(int n) {
        //         if(n>18) {
        //         return true;
        //     } else {
        //         return false;
        //     }   
        // }
    
    //PROGRAM-4 // SUM OF TWO NUMBERS
            // public static int sum(int a, int b) {
            //     int sum = a + b;
            //     return sum;
            // }

    //PROGRAM-5 // PRODUCT OF TWO NUMBERS
        // public static int prod(int a, int b) {
        //     int prod = a * b;
        //     return prod;
        // }

    //PROGRAM-6 // AREA AND CIRCUMFERENCE OF CIRCLE
        // public static double circle(int r) {
        //     double circumference = 2*3.14*r;
        //     double area = 3.14*r*r;
        //     System.out.println("Circumference = " + circumference + " Area = " + area);
        //     return 1;
        // }
    
    //PROGRAM-7 // CHECK IF NUMBER IS PRIME
        public static boolean isPrime(int n) {
            if(n==2) {
                return true;
            }
            for(int i=2;i<=Math.sqrt(n);i++) {
                if(n%i==0) 
                return false;
            } 
            return true;
            }

    //PROGRAM-8 // MARKS
        //  public static void marks(int n) {
        //     if(n <= 40) {
        //         System.out.println("Fail");
        //     } else if(n>=41 && n<=50) {
        //         System.out.println("DD"); 
        //     } else if(n>=51 && n<=60) {
        //         System.out.println("CD");
        //     } else if(n>=61 && n<=70) {
        //         System.out.println("BC");
        //     } else if(n>=71 && n<=80) {
        //         System.out.println("BB");
        //     } else if(n>=81 && n<=90) {
        //         System.out.println("AB");
        //     } else if(n>=91 && n<=100) {
        //         System.out.println("AA");
        //     }    
        // }

    //PROGRAM-9 //FACTORIAl
        // public static int fact(int n) {
        //     int fact = 1;
        //     if (n==0) {
        //         return 0;
        //     }
        //     for(int i=1;i<=n;i++) {
        //         fact = fact*i;
        //     }
        //     return fact;    
        // }
    
    //PROGRAM-10 // CHECK IF NUMBER IS PALINDROME
        // public static int isPalindrome(int n) {
        //     int temp = n;
        //     int rev=0;
        //     int rem;
        //     while(temp!=0) {
        //         rem = temp%10;
        //         rev=rev*10 + rem;
        //         temp=temp/10;
        //     }
        //     if(n==rev) {
        //         System.out.println("Palindrome");
        //     } else {
        //         System.out.println("Not a Palindrome");
        //     }
        //     return 1;
        // }
    
    //PROGRAM-12 // CHECK IF GIVEN TRIPLET IS PYTHAGOREAN TRIPLET
        // public static void pythagoreanTriplet(int a, int b, int c) {
        //     if(a*a + b*b == c*c) {
        //         System.out.println("Pythagorean Triplet");
        //     } else {
        //         System.out.println("Not A Pythagorean Triplet");
        //     }
        // }

    //PROGRAM-13 // ALL PRIME NUMBERS IN RANGE
        // public static void primesInRange(int n) {
        //     for(int i=2;i<=n;i++){
        //         if(isPrime(i)) {
        //         System.out.print(i + " ");
        //     }
        //     }
        // }
    
    //PROGRAM-14 // SUM OF FIRST N NATURAL NUMBERS;
        // public static int sum(int n) {
        //     int sum = 0;
        //     for(int i=0;i<=n;i++) {
        //         sum=sum+i;
        //     }
        //     return sum;
        // }
        
            
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.](https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)
                // int a = sc.nextInt();
                // int b = sc.nextInt();
                // int c = sc.nextInt();
                // int max = max(a, b, c);
                // int min = min(a, b, c);
                // System.out.println("Max : " + max);
                // System.out.println("Min : " + min);

        // 2. [Define a program to find out whether a given number is even or odd.](https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)
                // int n = sc.nextInt();
                // boolean isEven = isEven(n);
                // System.out.println(isEven);

        // 3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.](https://www.efaculty.in/java-programs/voting-age-program-in-java/)
            // int n = sc.nextInt();
            // boolean age = voteEligibility(n);
            // System.out.println(age);

        // 4. [Write a program to print the sum of two numbers entered by user by defining your own method.](https://code4coding.com/addition-of-two-numbers-in-java-using-method/)
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int sum = sum(a, b);
            // System.out.println(sum);

        // 5. [Define a method that returns the product of two numbers entered by user.](https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int prod = prod(a, b);
            // System.out.println(prod);     

        // 6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.](https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)
            // int r = sc.nextInt();
            // double circle = circle(r);
            // System.out.println(circle);

        // 7. [Define a method to find out if a number is prime or not.](https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)
            // int n = sc.nextInt();
            // boolean isPrime = isPrime(n);
            // System.out.println(isPrime);

        // 8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) 
                // Marks        Grade 
                // 91-100         AA 
                // 81-90          AB 
                // 71-80          BB 
                // 61-70          BC 
                // 51-60          CD 
                // 41-50          DD 
                // <=40          Fail 
            // int n = sc.nextInt();
            // marks(n);
        
        // 9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
                //Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>
                // 4! = 1 * 2 * 3 * 4 = 24 
                // 3! = 3 * 2 * 1 = 6 
                // 2! = 2 * 1 = 2 
                // Also, 
                // 1! = 1 
                // 0! = 1
            // int n = sc.nextInt();
            // int fact = fact(n);
            // System.out.println(fact);
    
        // 10. [Write a function to find if a number is a palindrome or not. Take number as parameter.](https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)
            // int n = sc.nextInt();
            // int isPalindrome = isPalindrome(n);
            // System.out.println(isPalindrome);
            
        // 12. [Write a function to check if a given triplet is a Pythagorean triplet or not.](https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/) (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int c = sc.nextInt();
            // pythagoreanTriplet(a, b, c);

        // 13. [Write a function that returns all prime numbers between two given numbers.](https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)
            // int n = sc.nextInt();
            // primesInRange(n);

        // 14. [Write a function that returns the sum of first n natural numbers.](https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/)
            // int n = sc.nextInt();
            // int sum = sum(n);
            // System.out.println(sum);


    }

   
}