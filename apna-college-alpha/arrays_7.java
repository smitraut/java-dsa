import java.util.Scanner;

//-----------------ARRAYS------------------------------------//
//ARRAYS: List of elements of the same type placed in a contigious memory location
//SYNTAX:  dataType arrayName[] = new dataType[size];  
//         dataType arrayName[] ={1, 2 , 3};

//------QUESTIONS IN THIS FILE-----------//

//PROGRAM-1 // INPUT-OUTPUT IN ARRAY
//PROGRAM-2 // ARRAYS AS FUNCTION ARGUMENTS
//PROGRAM-3 // LINEAR SEARCH // find the index of element in a given array // key = 10
    //EXAMPLE-1
	//EXAMPLE-2	
//PROGRAM-4 // LARGEST & SMALLEST NUMBER IN A GIVEN ARRAY
//PROGRAM-5 // BINARY SEARCH // prerequisite - sorted arrays
//PROGRAM-6 // REVERSE AN ARRAY
//PROGRAM-7 // PAIRS IN AN ARRAY
//PROGRAM-8 // PRINT SUBARRAYS
//PROGRAM-9 // MAX SUBARRAY SUM - 1 (BRUTE FORCE)
//PROGRAM-10 // MAX SUBARRAY SUM - 2 (PREFIX SUM)
//**PROGRAM-11 // MAX SUBARRAY SUM - 3 (KADANES ALGORITHM)
    //**EXAMPLE-1
    //EXAMPLE-2
//**PROGRAM-12 // TRAPPING RAINWATER // given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//**PROGRAM-13 // BUY & SELL STOCKS // you are given an array pieces where pieces[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.If you cannot achieve any profit return 0.

//------PRACTICE QUESTIONS---------//

//PROGRAM-1 // RETURN TRUE IF SAME NUMBER APPEAR MORE THAN ONCE IN AN ARRAY ELSE FALSE
//PROGRAM-2 // SEARCH IN ROTATED SORTED ARRAY

public class arrays_7 {

    //PROGRAM-2 // ARRAYS AS FUNCTION ARGUMENTS
        // public static void update(int marks[], int nonChangeable) {
        //     nonChangeable = 10;                    //pass by value: will not change in main function
        //     for(int i=0; i<marks.length; i++) {    //arrays are => pass by reference: will change in the main function
        //         marks[i] = marks[i] + 1;
        //     }
        // }

    //PROGRAM-3 // LINEAR SEARCH // find the index of element in a given array // key = 10
        //EXAMPLE-1
            // public static int linearSearch(int numbers[], int key) {
            //     for(int i=0; i<numbers.length; i++) {
            //         if(numbers[i]==key) {
            //             return i;
            //         }
            //     }
            //     return -1;
            // }

        //EXAMPLE-2
            // public static int linearSearch(String menu[], String key) {
            //     for(int i=0; i<menu.length; i++) {
            //         if(menu[i]==key) {
            //             return i;
            //         }
            //     }
            //     return -1;
            // }

    //PROGRAM-4 // LARGEST & SMALLEST NUMBER IN A GIVEN ARRAY
            // public static int getLargest(int numbers[]) {
            //     int largest = Integer.MIN_VALUE; // -infinity
            //     int smallest = Integer.MAX_VALUE; // +infinity

            //     for(int i=0; i<numbers.length; i++) {
            //         if(largest < numbers[i]) {
            //             largest = numbers[i];
            //         }
            //         if(smallest > numbers[i]) {
            //             smallest = numbers[i];
            //         }
            //     }
            //     System.out.println("Smallest value is: " + smallest);
            //     return largest;
            // }

    //PROGRAM-5 // BINARY SEARCH // prerequisite - sorted arrays
            // public static int binarySearch(int numbers[], int key) {
            //     int start = 0;
            //     int end = numbers.length-1;
            //     while(start<=end) {
            //         int mid = (start + end) / 2;

            //         //comparisons
            //         if(numbers[mid] == key) { //found
            //             return mid;
            //         }
            //         if(numbers[mid] < key) { //right
            //             start = mid+1;
            //         } else { //left
            //             end = mid-1;
            //         }
            //     }
            //     return -1;
            // }

    //PROGRAM-6 // REVERSE AN ARRAY
            // public static void reverse(int numbers[]) {
            //     int first = 0;
            //     int last = numbers.length-1;

            //     while(first < last) {
            //         //swap
            //         int temp = numbers[last];
            //         numbers[last] = numbers[first];
            //         numbers[first] = temp;

            //         first++;
            //         last--;
            //     }
            // }
    //PROGRAM-7 // PAIRS IN AN ARRAY
            // public static void printPairs(int numbers[]) {
            //     int tp = 0;
            //     for(int i=0; i<numbers.length; i++) {
            //         int curr = numbers[i]; // 2, 4, 6, 8, 10
            //         for(int j=i+1; j<numbers.length; j++) {
            //             System.out.print("(" + curr + "," + numbers[j] + ") ");
            //             tp++;
            //         }
            //         System.out.println();
            //     }
            //     System.out.println("Total Pairs = " + tp);
            // }
    
    //PROGRAM-8 // PRINT SUBARRAYS
            // public static void printSubarrays(int numbers[]) {
            //     int ts = 0;
            //     for(int i=0; i<numbers.length; i++) {
            //         int start = i;
            //         for(int j = i; j<numbers.length; j++) {
            //             int end = j;
            //             for(int k=start; k<=end; k++) {
            //                 System.out.print(numbers[k] + " ");
            //             }
            //             ts++;
            //             System.out.println();
            //         }
            //         System.out.println();
            //     }
            //     System.out.println("Total subarrays = " + ts);
            // }

    //PROGRAM-9 // MAX SUBARRAY SUM - 1 (BRUTE FORCE)
            // public static void maxSubarraySum(int numbers[]) {
            //     int currSum = 0;
            //     int maxSum = Integer.MIN_VALUE;

            //     for(int i=0; i<numbers.length; i++) {
            //         int start = i;
            //         for(int j=i; j<numbers.length; j++) {
            //             int end = j;
            //             currSum = 0;
            //             for(int k=start; k<=end; k++) {
            //                 currSum += numbers[k];
            //             }
            //             System.out.println(currSum);
            //             if(maxSum < currSum) {
            //                 maxSum = currSum;
            //             }
            //         }
            //     }
            //     System.out.println("Max sum =  " + maxSum );
            // }

    //PROGRAM-10 // MAX SUBARRAY SUM - 2 (PREFIX SUM)
            // public static void maxSubarraySum(int numbers[]) {
            //     int currSum = 0;
            //     int maxSum = Integer.MIN_VALUE;
            //     int prefix[] = new int [numbers.length];

            //     prefix[0] = numbers[0];
            //     //calculate prefic array
            //     for(int i=1; i<prefix.length; i++) {
            //         prefix[i] = prefix[i-1] + numbers[i];
            //     }

            //     for(int i=0; i<numbers.length; i++) {
            //         int start = i;
            //         for(int j=i ; j<numbers.length; j++) {
            //             int end = j;

            //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

            //             if(maxSum < currSum) {
            //                 maxSum = currSum;
            //             }
            //         }
            //     }
            //     System.out.println("Max Sum = " + maxSum);
            // }

    //PROGRAM-11 // MAX SUBARRAY SUM - 3 (KADANE'S ALGORITHM)
        //EXAMPLE-1
            // public static void kadanes(int numbers[]) {
            //     int currSum = 0;
            //     int maxSum = Integer.MIN_VALUE;

            //     for(int i=0; i<numbers.length; i++) {
            //         currSum = currSum + numbers[i];
            //         if(currSum < 0) {
            //             currSum = 0;
            //         }
            //         maxSum = Math.max(currSum, maxSum);
            //     } 
            //     System.out.println("Max Subarray Sum = " + maxSum);
            // }

        //EXAMPLE-2 // IF ALL NUMBERS ARE NEGATIVE
            // public static void kadanes(int numbers[]) {
            //     int currSum = 0;
            //     int maxSum = Integer.MIN_VALUE;

            //     for(int i=0; i<numbers.length; i++) {
            //         currSum = currSum+ numbers[i];
                
            //         maxSum = Math.max(currSum, maxSum);
            //     }
            //     System.out.println("Max sum is= " + maxSum);
            // }

    //PROGRAM-12 // TRAPPING RAINWATER
        // public static int trappedRainwater(int height[]) {
        //     int n = height.length;

        //     //calculate left max boundary - array
        //     int leftMax[] = new int[n];
        //     leftMax[0] = height[0];
        //     for(int i=1; i<n; i++) {
        //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
        //     } 

        //     //calculate right max boundary - array
        //     int rightMax[] = new int[n];
        //     rightMax[n-1] = height[n-1];
        //     for(int i=n-2; i>=0; i--) {
        //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
        //     }


        //     int trappedWater = 0;
        //     //loop
        //     for(int i=0; i<n; i++) {
        //         //waterLevel = min(leftMax bound, rightmMax bound)
        //         int waterLevel = Math.min(leftMax[i], rightMax[i]);
        //         //trapped water = waterLevel - height[i]
        //         trappedWater += waterLevel - height[i];
        //     }

        //     return trappedWater;
        
            
        // }

    //PROGRAM-13 // BUY & SELL STOCKS 
        // public static int buyAndSellStocks(int prices[]) {
        //     int buyPrice = Integer.MAX_VALUE;
        //     int maxProfit = 0;

        //     for(int i=0; i<prices.length; i++) {
        //         if(buyPrice < prices[i]) { //profit
        //             int profit = prices[i] - buyPrice; //today's profit
        //             maxProfit = Math.max(maxProfit, profit);
        //         } else {
        //             buyPrice = prices[i];
        //         }
        //     }


        //     return maxProfit;
        // }



//------PRACTICE QUESTIONS---------//

    //PROGRAM-1 // RETURN TRUE IF SAME NUMBER APPEAR MORE THAN ONCE IN AN ARRAY ELSE FALSE
        // public static boolean containsDuplicate(int numbers[]) {
        //     for(int i=0; i<numbers.length; i++) {
        //         for(int j=i+1; j<numbers.length; j++) {
        //             if(numbers[i] == numbers[j]) {
        //                 return true;
        //             }
        //         }
        //     }
        //     return false;
        // }

    //PROGRAM-2 // SEARCH IN ROTATED SORTED ARRAY
        // public static int search(int[] nums, int target) {
        //     int pivot = pivot(nums);
        //     int firstTry = binarySearch(nums, target, 0, pivot);
        //     if(firstTry != -1) {
        //         return firstTry;
        //     }
        //     return binarySearch(nums, target, pivot + 1, nums.length -1);

        // }


        // public static int pivot(int[] nums) {
        //     int start = 0;
        //     int end = nums.length - 1;

        //     while(start < end) {
        //         int mid = start + (end - start) / 2;
        //         if(nums[mid] > nums[mid+1]) {
        //             return mid;
        //         } else if(nums[mid] > nums[end]) {
        //             start = mid + 1;
        //         } else {
        //             end = mid;
        //         }
        //     }
        //     return start;
        // }

        // public static int binarySearch(int[] nums, int target, int start, int end) {
        //     while(start<=end) {
        //         int mid = start + (end-start) / 2;
        //         if(target < nums[mid]) {
        //             end = mid - 1;
        //         } else if(target > nums[mid]) {
        //             start = mid + 1;
        //         } else {
        //             return mid;
        //         }
        //     }
        //     return -1;
        // }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//PROGRAM-1 // INPUT-OUTPUT IN ARRAY
    // int marks[] = new int[10];
    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2] = sc.nextInt();
    // System.out.println("phy: " + marks[0]);
    // System.out.println("chem: " + marks[1]);
    // System.out.println("math: " + marks[2]);

    // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    // System.out.println("percentage: " + percentage + "%");
    // System.out.println("length of array" + marks.length);

//PROGRAM-2 // ARRAYS AS FUNCTION ARGUMENTS
    // int marks[] = {97, 98, 99};
    // int nonChangeable = 5;     

    // update(marks, nonChangeable);
    // System.out.println(nonChangeable);      //pass by value

    // for(int i=0; i<marks.length;i++) {
    //     System.out.print(marks[i] + " ");   //pass by reference
    // }

//PROGRAM-3 // LINEAR SEARCH  
        //EXAMPLE-1
            // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
            // int key=10;

            // int index = linearSearch(numbers, key);
            // if(index == -1) {
            //     System.out.println("Key Not Found");
            // } else {
            //     System.out.println("key is at index: " + index);
            // }

        //EXAMPLE-2
            // String menu[] = {"chicken", "dosa", "roti", "noodles"};
            // String key = "roti";

            // int index = linearSearch(menu, key);
            // if(index == -1) {
            //     System.out.println("Key Not Found");
            // } else {
            //     System.out.println("key is at index: " + index);
            // }

//PROGRAM-4 // LARGEST & SMALLEST NUMBER IN A GIVEN ARRAY
    // int numbers[] = {1, 2, 6, 3, 5};
    // int largest = getLargest(numbers);
    // System.out.println("Largest value is: " + largest);

//PROGRAM-5 // BINARY SEARCH // prerequisite - sorted arrays
    // int numbers[] = {2, 4, 6, 8, 10, 12, 24};
    // int key = 10;
    // int binarySearch = binarySearch(numbers, key);
    // System.out.println("Index for key is: " + binarySearch);

//PROGRAM-6 // REVERSE AN ARRAY
    // int numbers[] = {2, 4, 6, 8, 10};
    // reverse(numbers);
    // for(int i=0; i<numbers.length; i++) {
    //     System.out.print(numbers[i] + " ");
    // }

//PROGRAM-7 // PAIRS IN AN ARRAY
    // int numbers[] = {2, 4, 6, 8, 10};
    // printPairs(numbers);

//PROGRAM-8 // PRINT SUBARRAYS
    // int numbers[] = {2, 4, 6, 8, 10};
    // printSubarrays(numbers);

//PROGRAM-9 // MAX SUBARRAY SUM - 1 (BRUTE FORCE)
    // int numbers[] = {1, -2, 6, -1, 3};
    // maxSubarraySum(numbers);

//PROGRAM-10 // MAX SUBARRAY SUM - 2 (PREFIX SUM)
    // int numbers[] = {1, -2, 6, -1, 3};
    // maxSubarraySum(numbers);

//PROGRAM-11 // MAX SUBARRAY SUM - 3 (KADANE'S ALGORITHM)
    //EXAMPLE-1
        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // kadanes(numbers);        
    //EXAMPLE-2
        // int numbers[] ={-1, -2, -3, -4};
        // kadanes(numbers);  

//PROGRAM-12 // TRAPPING RAINWATER 
    // int height[] = {4, 2, 0, 6, 3, 2, 5};
    // int trappedWater = trappedRainwater(height);
    // System.out.println(trappedWater);

//PROGRAM-13 // BUY & SELL STOCKS // 
    // int prices[] = {7, 1, 5, 3, 6, 4};
    // int buyAndSellStocks = buyAndSellStocks(prices);
    // System.out.println(buyAndSellStocks);


//------PRACTICE QUESTIONS---------//

//PROGRAM-1 // RETURN TRUE IF SAME NUMBER APPEAR MORE THAN ONCE IN AN ARRAY ELSE FALSE
    // int numbers[] = {4, 5, 2, 4, 8, 9};
    // System.out.println(containsDuplicate(numbers));

//PROGRAM-2 // SEARCH IN ROTATED SORTED ARRAY
    // int[] nums  = {4, 5, 6, 7, 8, 0, 3, 5, 8};
    // System.out.println(search(nums, 3));








    }
    
}
