import java.util.Scanner;

// --------------------- CONDITIONAL STATEMENTS --------------------------------//

// QUESTIONS IN THIS FILE

// IF-ELSE
// ELSE-IF
// PROGRAM - 1 // INCOME TAX CALCULATOR
// PROGRAM - 2 // LARGEST OF THREE NUMBERS
// TERNARY OPERATOR
// SWITCH CASE
// CALCULATOR

// PRACTICE QUESTIONS - 2
// -- 1 --  NUMBER IS POSITIVE OR NEGATIVE
// -- 2 -- FEVER OR NOT
// -- 3 -- LEAP YEAR OR NOT
 

public class conditional_statements_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// CONDITIONAL STATEMENTS

        // if-else
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("Number is Even");
        // } else {
        //     System.out.println("Number is Odd");
        // }

        // else-if
        // int age = sc.nextInt();
        // if(age < 12) {
        //     System.out.println("You are a child");
        // } else if (age >= 12 && age < 18) {
        //     System.out.println("You are a teenager");
        // } else {
        //     System.out.println("You are an adult");
        // }



// PROGRAM - 1 // INCOME TAX CALCULATOR
        // int income = sc.nextInt();
        // int tax;
        // if(income < 500000) {
        //     tax = 0; 
        // } else if (income >= 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2);
        // } else {
        //     tax = (int) (income * 0.3);
        // }

        // System.out.println("Your tax is : " + tax);



 //PROGRAM - 2 // LARGEST OF THREE NUMBERS
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a > b && a > c) {
        //     System.out.println("Largest number is : " + a);
        // } else if (b > a && b > c) {
        //     System.out.println("Largest Number is : " + b);
        // } else {
        //     System.out.println("Largest number is : " + c);
        // }



// TERNARY OPERATOR
        // variable = condition ? statement1 : statement2;
        // int num = sc.nextInt();
        // String age = (num >= 18) ? "adult" : "kid";
        // System.out.println("You are a : " + age );
        
        // STUDENT PASS OR FAIL
        // int marks = 87;
        // String outcome = (marks >= 33) ? "pass" : "fail";
        // System.out.println(outcome);



// SWITCH CASE
        // int num = sc.nextInt();
        // switch(num) {
        //     case 1 : System.out.println("Monday");
        //             break;
        //     case 2 : System.out.println("Tuesday");
        //             break;
        //     case 3 : System.out.println("Wednesday");
        //             break;
        //     case 4 : System.out.println("Thursday");
        //             break;
        //     case 5 : System.out.println("Friday");
        //             break;
        //     case 6 : System.out.println("Saturday");
        //             break;
        //     case 7 : System.out.println("Sunday");
        //             break;
        //     default : System.out.println("Psych!");
        // }

// CALCULATOR
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("ENTER : +, -, *, /, %");
        // char ch = sc.next().charAt(0);
        // switch(ch) {
        //     case '+' : System.out.println(a + b);
        //               break;
        //     case '-' : System.out.println(a - b);
        //               break;
        //     case '*' : System.out.println(a - b);
        //               break;
        //     case '/' : System.out.println(a - b);
        //               break;
        //     case '%' : System.out.println(a % b);
        //               break;          
        // }



// PRACTICE QUESTIONS - 2
        // -- 1 --  NUMBER IS POSITIVE OR NEGATIVE
        // int num = sc.nextInt();
    
        // if(num > 0) {
        //     System.out.println("Number is positive");
        // } else {
        //     System.out.println("Number is negative");
        // }

 // -- 2 -- FEVER OR NOT
        // double temp = 103.5;
        // if(temp > 100) {
        //     System.out.println("You have fever");
        // } else {
        //     System.out.println("you dont have fever");
        // }

// -- 3 -- LEAP YEAR OR NOT
        // System.out.println("Input the year: ");
        // int year = sc.nextInt();

        // boolean x = (year % 4 ) == 0;
        // boolean y = (year % 100 ) != 0;
        // boolean z = ((year % 100 == 0) && (year % 400 == 0));

        // if(x && (y || z)){
        //     System.out.println("Its a leap year : " + year);
        // } else {
        //     System.out.println("It is not a leap year : " + year);
        // }

    }
    
}
