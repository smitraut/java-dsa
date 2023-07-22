import java.util.Scanner;

//----OUESTIONS IN THIS FILE-----//

//PROGRAM-1 // ADD TWO NUMBERS
//PROGRAM-2 // PRODUCT OF TWO NUMBERS
//PROGRAM-3 // SWAP TWO NUMBERS
//PROGRAM-4 // PRIME OR NOT
//PROGRAM-5 // CHECK IF NUMBER IS ARMSTRONG NUMBERS

public class functions_methods_2 {

//PROGRAM-1 // ADD TWO NUMBERS
    // public static int addTwoNumbers(int num1, int num2){
    //     int sum= num1 + num2;
    //     return sum;
    // }

//PROGRAM-2 // PRODUCT OF TWO NUMBERS
    // public static int product(int num1, int num2){
    //     int prod= num1 * num2;
    //     return prod;
    // }

//PROGRAM-3 // SWAP TWO NUMBERS
    // public static void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("A : " + a);
    //     System.out.print("B : " + b);  
    // }

//PROGRAM-4 // PRIME OR NOT
    // public static boolean checkPrime(int n) {
    //     if(n==2) {
    //         return true;
    //     } 
    //     for(int i=2; i<=Math.sqrt(n); i++) {
    //         if(n%i==0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

//PROGRAM-5 // CHECK IF NUMBER IS ARMSTRONG NUMBERS
    // public static boolean printArmstrong(int n){
    //     int original = n;
    //     int pow = String.valueOf(n).length();
    //     int sum = 0;
    //     while(n>0){
    //         int rem = n%10;
    //         sum +=Math.pow(rem, pow);
    //         n = n/10;
    //     }

    //     return sum == original;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

//PROGRAM-1 // ADD TWO NUMBERS
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int sum = addTwoNumbers(num1, num2);
        // System.out.print("Sum is : " + sum);

//PROGRAM-2 // PRODUCT OF TWO NUMBERS
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int prod = product(num1, num2);
        // System.out.print("Product is : " + prod);

//PROGRAM-3 // SWAP TWO NUMBERS
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // swap(a, b);
    
//PROGRAM-4 // PRIME OR NOT
        // int n = sc.nextInt();
        // boolean isPrime = checkPrime(n);
        // System.out.println(isPrime);

//PROGRAM-5 // CHECK IF NUMBER IS ARMSTRONG NUMBERS
        // int n = sc.nextInt();
        // boolean isArmstrong = printArmstrong(n);
        // System.out.println(isArmstrong);

    }
    
}
