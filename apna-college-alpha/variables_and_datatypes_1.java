import java.util.Scanner;

// ---------------------- // VARIABLES AND DATA TYPES //---------------------------

// QUESTIONS IN THIS FILE

// PROGRAM-1 // BOILERPLATE CODE
// PROGRAM-2 // VARIABLES
// PROGRAM-3 // PRIMITIVE DATA TYPES= 8
// PROGRAM-4 // INPUT 
// PROGRAM-5 // SUM AND PRODUCT OF A AND B 
// PROGRAM-6 // AREA OF CIRCLE
// PROGRAM-7 // TYPE CONVERSION, TYPE CASTING,  TYPE PROMOTION
// FUNCTIONING OF JAVA CODE   

// PRACTICE QUESTIONS-1

// -- 1 --  AVG OF THREE NUMS
// -- 2 --  AREA OF SQUARE


public class variables_and_datatypes_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




// PROGRAM-1 // BOILERPLATE CODE
        // System.out.println("Hello World");



// PROGRAM-2 // VARIABLES
        // int a=4;
        // int b=5;
        // System.out.println(a + b);



//PROGRAM-3 // PRIMITIVE DATA TYPES= 8
        // byte b = 8;                      1 Byte
        // char ch = 'a';                   2 Byte
        // boolean var = true;              1 Byte
        // int num = 5;                     4 Byte
        // float num2 = (float) (3.14);     4 Byte
        // long num3 = 46643;               8 Bytes
        // double num4 = 345.54213;         8 Bytes
        // short num5 = 24;                 2 Bytes



//PROGRAM-4 // INPUT 

        // String input = sc.nextLine();
        // int num = sc.nextInt();
        // float num2 = sc.nextFloat();
        // boolean var = sc.nextBoolean();
        // short num3 = sc.nextShort();
        // long num4 = sc.nextLong();
        // byte num5 = sc.nextByte();
        // double num6 = sc.nextDouble();
        // String input = sc.next();
     
        // System.out.println(input);
        // System.out.println(num);
        // System.out.println(num2);
        // System.out.println(var);
        // System.out.println(num3);
        // System.out.println(num4);
        // System.out.println(num5);
        // System.out.println(num6);
        // System.out.println(input);



// PROGRAM-5 // SUM AND PRODUCT OF A AND B 
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int product = a * b; 
        // System.out.println(sum);
        // System.out.println(product);



// PROGRAM-6 // AREA OF CIRCLE
        // float rad = sc.nextInt();
        // float pi = (float)3.14;
        // float aroc = pi * (rad * rad);
        // System.out.println(aroc);



// PROGRAM-7 // TYPE CONVERSION, TYPE CASTING,  TYPE PROMOTION

// TYPE CONVERSION // byte < short < int < float < long < double
        // int a = 5;
        // long b = a;  // possible cause long in greater than int
        // int c = b;   // not possible cause int is smaller than long

// TYPE CASTING
        // float num1 = (float)3.14;  //forcefull conversion from double to float
        // int num2 = (int) num1;   //forcefull conversion from float to int
        // System.out.println(num2);

// TYPE PROMOTION
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a); //automatically converts byte, short, char to int

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // int ans = (a + b + c + d);  // cannot convert from double to int -> automatically converted everything to double
        // System.out.println(ans);



// FUNCTIONING OF JAVA CODE   
        //                                          ---------------------EXECUTION--------------------- 
        //                                          |                                                 |
        // Source Code (.java) -> Compiler -> Byte Code (.class) -> Java Virtual Machine (JVM) -> Native Code
        //     |                      |
        //     ------COMPILATION-------



// PRACTICE QUESTIONS-1

// -- 1 --  AVG OF THREE NUMS
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a + b + c) / 3;
        // System.out.println(avg);

// -- 2 --  AREA OF SQUARE
        // int a = sc.nextInt();
        // int aros = a * a;
        // System.out.println(aros);

        // -- 3 --  // TOAL AMOUNT OF THREE ITEMS WITH GST
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // double total =  (pencil + pen + eraser);
        // double bill = total * 0.18;
        // double billTotal = total + bill;
        // System.out.println(billTotal);

    }
    
}
