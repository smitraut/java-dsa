import java.util.Scanner;

//-----ARRAYS------------------//
//SYNTAX:  datatype variable_name[] = new datatype[size];
//         datatype variable_name[] = {a, a, a, a, a};

//2D ARRAYS: SYNTAX // datatype variable_name[][] = new datatype[num][num];
//                     datatype variable_name[][] = {   
//                                                      {1, 2, 3} 
//                                                      {4, 5, 6} 
//                                                      {7, 8, 9}
//                                                    };

//--------------QUESTION IN THIS FILE-------------------------//

//PROGRAM-1 // REVERSE AN ARRAY
//PROGRAM-2 // MAXIMUM VALUE OF AN ARRAY
//PROGRAM-3 // FIND THE INDEX OF KEY IF THE NUMBER EXISTS IN AN ARRAY ELSE RETURN-1
//PROGRAM-4 // SEARCH IN RANGE OF INDEX
//PROGRAM-5 // SEARCH FOR A STRING IN ARRAY
//PROGRAM-6 // MINIMUM NUMBER IN ARRAY
//PROGRAM-7 // EVEN DIGITS

 
public class arrays_linearSearch_4 {

    //PROGRAM-1 // REVERSE AN ARRAY
        // public static void reverse(int numbers[]) {
        //     int first = 0;
        //     int last = numbers.length-1;

        //     while(first < last) {
        //         int temp = numbers[first];
        //         numbers[first] = numbers[last];
        //         numbers[last] = temp;

        //         first++;
        //         last--;
        //     }
        // }


    //PROGRAM-2 // MAXIMUM VALUE OF AN ARRAY
        // public static int maxNumber(int numbers[]) {
        //     int maxNum = Integer.MIN_VALUE;

        //     for(int i=0; i<numbers.length; i++) {
        //         if(numbers[i] > maxNum) {
        //             maxNum = numbers[i];
        //         } 
        //     }
        //     return maxNum;
        // }

    //PROGRAM-3 // FIND THE INDEX OF KEY IF THE NUMBER EXISTS IN AN ARRAY ELSE RETURN-1
        // public static int linearSearch(int numbers[], int key) {
        //     for(int i=0; i<numbers.length; i++) {
        //         if(numbers[i]==key) {
        //             return i;
        //         }
        //     }
        //     return -1;
        // }

    //PROGRAM-4 // SEARCH IN RANGE OF INDEX
        // public static int linearSearch(int numbers[], int key, int start, int end) {
        //     for(int i=start; i<end; i++) {
        //         if(numbers[i] == key) {
        //             return i;
        //         }
        //     }
        //     return -1;
        // }
    
    //PROGRAM-5 // SEARCH FOR A STRING IN ARRAY
        // public static int linearSearch(String[] menu, String key) {
        //     for(int i=0; i<menu.length; i++) {
        //         if(menu[i] == key) {
        //             return i;
        //         }
        //     }
        //     return -1;
        // }
        
    //PROGRAM-6 // MINIMUM NUMBER IN ARRAY
        // public static int minNumber(int numbers[]) {
        //     int minNumber = Integer.MAX_VALUE;
        //     int n = numbers.length; 
        //     for(int i=0; i<n; i++) {
        //         if(numbers[i] < minNumber) {
        //             minNumber = numbers[i];
        //         }
        //     }
        //     return minNumber;
        // }

    //PROGRAM-7 // EVEN DIGITS
        // public static int findNumbers(int numbers[]) {
        //     int count = 0;
        //     for(int num : numbers) {
        //         if(even(num)) {
        //             count++;
        //         }
        //     }
        //     return count;
        // }

        // public static boolean even(int num) {
        //     int numberOfDigits = digits(num);
        //     return numberOfDigits % 2 == 0;
        // }

        // public static int digits(int num) {
        //     if(num < 0) {
        //         num = num * -1;
        //     }

        //     return (int)(Math.log10(num)) + 1; 
        // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//PROGRAM-1 // REVERSE AN ARRAY
    // int numbers[] = {2, 4, 5, 8, 3, 7}; 
    // reverse(numbers);
    // System.out.print(Arrays.toString(numbers));



//PROGRAM-2 // MAXIMUM VALUE OF AN ARRAY
    // int numbers[] = {4, 6, 7, 2, 5, 9};
    // System.out.print5ln(maxNumber(numbers));

//PROGRAM-3 // FIND THE INDEX OF KEY IF THE NUMBER EXISTS IN AN ARRAY ELSE RETURN-1
    // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    // int key=10;

    // int index = linearSearch(numbers, key);
    // if(index == -1) {
    //     System.out.println("Key Not Found");
    // } else {
    //     System.out.println("key is at index: " + index);
    // }

//PROGRAM-4 // SEARCH IN RANGE OF INDEX
    // int numbers[] = {4, 5, 2, 5 ,7, 4, 2, 4, 6, 7, 2, 8};
    // int key = 6;

    // System.out.println(linearSearch(numbers, key, 2, 9));

//PROGRAM-5 // SEARCH FOR A STRING IN ARRAY
    // String menu[] = {"roti", "chicken", "pizza", "burger"};
    // String key = "pizza";

    // int index = linearSearch(menu, key);
    // if(index == -1) {
    //     System.out.println("Key not found");
    // } else {
    //     System.out.println("Key found at index: " + index);
    // }

//PROGRAM-6 // MINIMUM NUMBER IN ARRAY
    // int numbers[] = {3, 5, 7, 2, 7, 4, 6, 2, 1, 5, 7, 4};
    // System.out.println(minNumber(numbers));

//PROGRAM-7 // EVEN DIGITS
    // int numbers[] = {3, 53, 7, 256, 75, 4, 6778, 2, 1, 58, 7, 475546};
    // System.out.println(findNumbers(numbers));





    }
}
