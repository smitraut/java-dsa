package DSA.Assignments.Solutions;
import java.util.Scanner;

public class conditionals_loops_3 {

    // FACT FUNCTION

    // public static int fact(int n) {
    //         int fact=1;
    //         while(n!=1) {
    //             fact = fact*n;
    //             n--;
    //         }
    //         return fact;
    // }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

    // ### EASY JAVA PROGRAMS

        // 1. Area Of Circle Java Program
            // double radius = sc.nextDouble();
            // double arocircle = 3.14 * (radius * radius);
            // System.out.println("Area of Circle is: " + arocircle);


        // 2. Area Of Triangle
            // double base = sc.nextDouble();
            // double height = sc.nextDouble();
            // double arotriangle = (base * height) / 2;
            // System.out.println("Area od triangle with " + base + " and " + height + " is " + arotriangle);


        // 3. Area Of Rectangle Program 
            // double lenght = sc.nextDouble();
            // double width = sc.nextDouble();
            // double arorectangle = lenght*width;
            // System.out.println(arorectangle);


        // 4. Area Of Isosceles Triangle 
            // same as 2

        // 5. Area Of Parallelogram
            // double base = sc.nextDouble();
            // double height = sc.nextDouble();
            // double aroparallelogram = base *height;
            // System.out.println(aroparallelogram);


        // 6. Area Of Rhombus
            // double diagonal1 = sc.nextDouble();
            // double diagonal2 = sc.nextDouble();
            // double arorhombus = diagonal1 *diagonal2 /2;
            // System.out.println(arorhombus);

        // 7. Area Of Equilateral Triangle
            // double side = sc.nextDouble();
            // double aroequitri = Math.sqrt(3) / 4 * side*side;
            // System.out.println(aroequitri);

        // 8. Perimeter Of Circle
            // double radius = sc.nextDouble();
            // double perimeterocircle = 2*3.14*radius;
            // System.out.println(perimeterocircle);

        // 9. Perimeter Of Equilateral Triangle
            // double side = sc.nextDouble();
            // double perimeteroequtri = 3*side;
            // System.out.println(perimeteroequtri);

        // 10. Perimeter Of Parallelogram
            // double base = sc.nextDouble();
            // double side = sc.nextDouble();
            // double perimeteroparallelogram = 2 * (base+side);
            // System.out.println(perimeteroparallelogram);

        // 11. Perimeter Of Rectangle
            // double length = sc.nextDouble();
            // double width = sc.nextDouble();
            // double perimeterorectangle = 2 * (length+width);
            // System.out.println(perimeterorectangle);

        // 12. Perimeter Of Square
            // double side = sc.nextDouble();
            // double perimeterosquare = 4*side;
            // System.out.println(perimeterosquare);

        // 13. Perimeter Of Rhombus
            // double side = sc.nextDouble();
            // double perimeterorhombus = 4*side;
            // System.out.println(perimeterorhombus);

        // 14. Volume Of Cone Java Program
            // double radius = sc.nextDouble();
            // double height = sc.nextDouble();
            // double volumeocone = 3.14 * (radius*radius) * height / 3;
            // System.out.println(volumeocone);

        // 15. Volume Of Prism
            // double base = sc.nextDouble();
            // double height = sc.nextDouble();
            // double volumeoprism = base*height;
            // System.out.println(volumeoprism);

        // 16. Volume Of Cylinder
            // double radius = sc.nextDouble();
            // double height = sc.nextDouble();
            // double volumeocylinder = 3.14 * (radius*radius) * height;
            // System.out.println(volumeocylinder);

        // 17. Volume Of Sphere
            // double radius = sc.nextDouble();
            // double volumeosphere = 4/3 * 3.14 * (radius*radius*radius);
            // System.out.println(volumeosphere);

        // 18. Volume Of Pyramid
            // double length = sc.nextDouble();
            // double width = sc.nextDouble();
            // double height = sc.nextDouble();
            // double volumeopyramid = length*width*height/3;
            // System.out.println(volumeopyramid);

        // 19. Curved Surface Area Of Cylinder
            // double radius = sc.nextDouble();
            // double height = sc.nextDouble();
            // double areaocurvedsurface = 2*3.14*radius*height;
            // System.out.println(areaocurvedsurface);

        // 20. Total Surface Area Of Cube
            // double side = sc.nextDouble();
            // double surfaceareaocube = 6*side*side;
            // System.out.println(surfaceareaocube);

        // 21. Fibonacci Series In Java Programs
            // int n = sc.nextInt();
            // int num1 = 0;
            // int num2 = 1;
            // System.out.print(num1 + " " + num2);
           
            // for(int i = 1; i<=n; i++) {
            //     int sum = num1 + num2;
            //     System.out.print(" " + sum);
            //     num1 = num2;
            //     num2 = sum;
            
            // }
           

        // 22. Subtract the Product and Sum of Digits of an Integer.
            // int n = sc.nextInt();
            // int rem;
            // int prod = 1;
            // int sum = 0;
            // while (n!=0) {
            //     rem = n%10;
            //     prod=prod*rem;
            //     sum=sum+rem;
            //     n=n/10;
            // }
            // System.out.println(prod-sum);

        // 23. Input a number and print all the factors of that number (use loops).
            // int n = sc.nextInt();
            // for(int i = 1; i<=n; i++) {
            //     if(n%i == 0) {
            //         System.out.print(i);
            //     }
            // }
                     

        // 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
            // System.out.print("Enter a Number: ");        
            // int n = sc.nextInt();
            // int sum = 0;
            // do {
            //     sum = sum + n;
            //     System.out.print("Enter a number: ");
            //     n = sc.nextInt();
            // } while (n != 0);

            // System.out.println(sum);

            
        // 25. Take integer inputs till the user enters 0 and print the largest number from all.  
            // System.out.print("Enter a number: ");
            // int n = sc.nextInt();

            // int largest = n;
            // do {
            //     n = sc.nextInt();
            //     if (n > largest) {
            //         largest = n;
            //     }
            // } while (n != 0);

            // System.out.println("Largest number entered: " + largest);
          

        // 26. Addition Of Two Numbers
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int add = a + b;
            // System.out.println(add);




            

    // ### INTERMEDIATE JAVA PROGRAMS

        // 1. Factorial Program In Java
            // int n = sc.nextInt();
            // int fact=1;
            // while(n!=1) {
            //     fact = fact*n;
            //     n--;
            // }
            // System.out.println(fact);

        // 2. Calculate Electricity Bill
                // System.out.print("Units consumed: ");
                // int units = sc.nextInt();
                // System.out.print("Price per unit: ");
                // int price = sc.nextInt();
                // int bill = units * price;
                // System.out.println(bill);
                 
        // 3. Calculate Average Of N Numbers
                // System.out.print("Total Numbers: ");
                // int n = sc.nextInt();
                // int sum = 0;
                // double avg;

                // for(int i =1; i<=n;i++) {
                //     System.out.print("Enter a Number: ");
                //     int num = sc.nextInt();
                //     sum = sum + num;  
                // }
                // avg = sum/n;
                // System.out.print(avg + " the average of the numbers you have entered");
              
        // 4. Calculate Discount Of Product
                // System.out.print("Enter the price of your items: ");
                // double price = sc.nextDouble();
                // System.out.print("Discount on these items: ");
                // double discount = sc.nextDouble();

                // double total = price - discount%price;
                // System.out.print("Total: " + total);

        // 5. Calculate Distance Between Two Points 
            // int x1,x2,y1,y2;
            // x1 = sc.nextInt();
            // y1 = sc.nextInt();
            // x2 = sc.nextInt();
            // y2 = sc.nextInt();

            // System.out.println("Distance = " + Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)));

        // 6. Calculate Commission Percentage
                // int sales = sc.nextInt();
                // int amount = 20%sales;
                // System.out.println(amount);    

        // 7. Power In Java
                // int num = sc.nextInt();
                // int pow = sc.nextInt();
                // int prod = 1;
                // int c = 0;
                // while(c!=pow) {
                //     prod= prod*num;
                //     c++;
                // }
                // System.out.print(prod);

            //OPTIMIZED
                // int num = sc.nextInt();
                // int pow = sc.nextInt();
                // int number = (int)Math.pow(num, pow);
                // System.out.println(number);

                   
        // 8. Calculate Depreciation of Value
                // int n, pv, r;
                // n = sc.nextInt();
                // pv = sc.nextInt();
                // r = sc.nextInt();

                // System.out.println("Final Value: " + Math.pow((1+0.01*r), n));

        // 9. Calculate Batting Average
                    // int n, sum=0;
                    // n = sc.nextInt();
                    // for(int i=1; i<=n; i++) {
                    //     sum+=sc.nextInt();
                    // }
                    // System.out.println("Average = : " + sum/n);

        // 10. Calculate CGPA Java Program
                    // double sum=0;
                    // for(int i=1; i<=8; i++) {
                    //     System.out.print("Enter gpa of sem " + i + " = ");
                    //     sum+=sc.nextDouble();
                    // }
                    // System.out.println("Final CGPA is : " + sum/8);
                        
        // 11. Compound Interest Java Program
        // 12. Calculate Average Marks
                // System.out.print("Total number of subjects: ");
                // int n = sc.nextInt();
                // int sum = 0;
                // int avg;

                // for(int i=1;i<=n;i++) {
                //     System.out.print("Enter the mks in subject: ");
                //     int mks = sc.nextInt();
                //     sum = sum + mks;
                // }
                // avg = sum/n;
                // System.out.print(avg);

        // 13. Sum Of N Numbers
                // System.out.print("Total numbers: ");
                // int n = sc.nextInt();
                // int sum = 0;
                // int avg;

                // for(int i=1;i<=n;i++) {
                //     System.out.print("Enter a number: ");
                //     int num = sc.nextInt();
                //     sum = sum + num;
                // }
                // avg = sum/n;
                // System.out.print(avg);

        // 14. Armstrong Number In Java
                // int n = sc.nextInt();
                // int original = n;
                // int pow = String.valueOf(n).length();
                // int sum = 0;
                // while(n>0){
                //     int rem = n%10;
                //     sum +=Math.pow(rem, pow);
                //     n = n/10;
                // }

                // System.out.println(sum == original); 
            
        // 15. Find Ncr & Npr  // uncomment the function fact()
                    // int n = sc.nextInt();
                    // int r = sc.nextInt();

                    // int ncr = fact(n) / (fact(r) * fact(n-r));
                    // System.out.println(ncr);
                    // int npr = fact(n) / fact(n-r);
                    // System.out.println(npr);

        // 16. Reverse of a number In Java
                // int n = sc.nextInt();
                // while(n>0) {
                //     int lastDigit = n%10;
                //     System.out.print(lastDigit);
                //     n = n/10;
                // }

        // 19. HCF and LCM Of Two Numbers Program
                    // int n1,n2,temp,temp1,temp2;
                    // n1 = sc.nextInt();
                    // n2=sc.nextInt();
                    // temp1 = n1;
                    // temp2 = n2;
                    // while(temp2 != 0) {
                    //     temp = temp2;
                    //     temp2 = temp1%temp2;
                    //     temp1 = temp;
                    // }
                    // double hcf = temp1;
                    // double lcm = n1*n2/temp1;

                    // System.out.println("HCF : " + hcf + " LCM : " + lcm);

        // 21. Java Program Vowel Or Consonant 
                    // char ch = sc.next().charAt(0);
                    // if(ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u' ) {
                    //     System.out.println("Vowels");
                    // } else {
                    //     System.out.println("Constants");
                    // }


        // 22. Perfect Number In Java
                // int n = sc.nextInt();
                // int sum=0;
                // for(int i=1;i<=n/2;i++){
                //     if(n%i==0) {
                //     sum+=i;
                //     }
                // }
                // if(sum==n){
                //     System.out.println("Perfect Number");
                // } else {
                //     System.out.println("Not A Perfect Number");
                // }

        // 23. Check Leap Year Or Not
                // int n = sc.nextInt();
                // if((n%400==0) || (n%4==0 && n%100!=0)) {
                //     System.out.println("Leap Year");
                // } else {
                //     System.out.println("Not Leap Year");
                // }
                
        // 24. Sum Of A n Naturnal Number
            // int n = sc.nextInt();
            // int sum = 0;
            // for(int i=0;i<=n;i++) {
            //     sum = sum+i;
            // }
            // System.out.print(sum);

        // 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August. 
                // for(int i=1; i<=31; i++) {
                //     if(i%2==0) {
                //         System.out.print(i + " ");
                //     }
                // }

        // 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.



        }
   } 
   