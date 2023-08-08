import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

//--------SORTING-------//
// ASCENDING
// DESCENDING

//-----QUESTIONS IN THIS FILE -------//

//PROGRAM-1 // BUBBLE SORT : large elements come to the end of array by swapping with the adjacent elem ent
//PROGRAM-2 // SELECTION SORT : pick the largest , put it at the beginning
//PROGRAM-3 // INSERTION SORT : pick an element and place in the right position in the sorted part
//PROGRAM-4 // INBUILT SORT : in built method of java to sort arrays
//PROGRAM-5 // COUNTING SORT : counts the number of times an element has occured and then sorts it

//------------------PRACTICE QUESTIONS----------------//

//PROGRAM-1 // BUBBLE SORT :  SORT IN DESCENDING ORDER
//PROGRAM-2 // SELECTION SORT : SORT IN DESCENDING ORDER
//PROGRAM-3 // INSERTION SORT : SORT IN DESCENDING ORDER
//PROGRAM-4 // INBUILT SORT : SORT IN DESCENDING ORDER
//PROGRAM-5 // COUNTING SORT : SORT IN DESCENDING ORDER



public class sorting_8 {

    //PROGRAM-1 // BUBBLE SORT
        // public static void bubbleSort(int[] nums) {
        //     for(int i=0; i<nums.length-1; i++) {
        //         for(int j=1; j<nums.length-1-i; j++) {
        //             if(nums[j] > nums[j + 1]) {
        //                 int temp = nums[j];
        //                 nums[j] = nums[j+1];
        //                 nums[j+1] = temp;
        //             }
        //         }
        //     }
        // }

        // public static void printBubbleSort(int[] nums) {
        //     for(int i=0; i<nums.length; i++) {
        //         System.out.print(nums[i] + " ");
        //     }
        // }


    //PROGRAM-2 // SELECTION SORT
        // public static void selectionSort(int[] nums) {
        //     for(int i=0; i<nums.length-1; i++) {
        //         int largest = i;
        //         for(int j=i+1; j<nums.length; j++) {
        //             if(nums[largest] > nums[j]){   //change to < for descending order
        //                 largest = j;
        //             }
        //         }
        //         int temp = nums[largest];
        //         nums[largest] = nums[i];
        //         nums[i] = temp;
        //     }
        // }

        // public static void printSelectionSort(int[] nums) {
        //     for(int i=0; i<nums.length; i++) {
        //         System.out.print(nums[i] + " ");
        //     }
        // }

    //PROGRAM-3 // INSERTION SORT
        // public static void insertionSort(int[] nums) {
        //     for(int i=1; i<nums.length; i++) {
        //         int curr = nums[i];
        //         int prev = i-1;
        //         while(prev >=0 && nums[prev] > curr) {
        //             nums[prev+1] = nums[prev];
        //             prev--;
        //         }
        //         nums[prev+1] = curr;
        //     }
        // } 

        // public static void printInsertionSort(int[] nums) {
        //     for(int i=0; i<nums.length; i++) {
        //         System.out.print(nums[i] + " ");
        //     }
        // }

    //PROGRAM-4 // INBUILT SORT
        // public static void printInbuiltSort(int[] nums) {
        //     for(int i=0; i<nums.length; i++) {
        //         System.out.print(nums[i] + " ");
        //     }
        // }

    //PROGRAM-5 // COUNTING SORT
        // public static void countingSort(int[] nums) {
        //     int largest = Integer.MIN_VALUE;
        //     for (int i = 0; i < nums.length; i++) {
        //         largest = Math.max(largest, nums[i]);
        //     }

        //     int[] count = new int[largest + 1];
        //     for (int i = 0; i < nums.length; i++) {
        //         count[nums[i]]++;
        //     }

        //     int j = 0;
        //     for (int i = 0; i < count.length; i++) {
        //         while (count[i] > 0) {
        //             nums[j] = i;
        //             j++;
        //             count[i]--;
        //         }
        //     }
        // }

        // public static void printCountingSort(int[] nums) {
        //     for(int i=0; i<nums.length; i++) {
        //         System.out.print(nums[i] + " ");
        //     }
        // }


//------------------PRACTICE QUESTIONS----------------//

        //PROGRAM-1 // BUBBLE SORT :  SORT IN DESCENDING ORDER
            // public static void bubbleSort(int[] nums) {
            //     for(int i=0; i<nums.length; i++) {
            //         for(int j=0; j<nums.length-1-i; j++) {
            //             if(nums[j] < nums[j+1]) {
            //                 int temp = nums[j];
            //                 nums[j] = nums[j + 1];
            //                 nums[j + 1] = temp;
            //             }
            //         }
            //     }
            //     System.out.println(Arrays.toString(nums));
            // }

        //PROGRAM-2 // SELECTION SORT : SORT IN DESCENDING ORDER
            // public static void selectionSort(int[] nums) {
            //     for(int i=0; i<nums.length-1; i++) {
            //         int largest = i;
            //         for(int j=i+1; j<nums.length; j++) {
            //             if(nums[largest] < nums[j]){   //change to < for descending order
            //                 largest = j;
            //             }
            //         }
            //         int temp = nums[largest];
            //         nums[largest] = nums[i];
            //         nums[i] = temp;
            //     }
            //     System.out.println(Arrays.toString(nums));
            // }
            
        //PROGRAM-3 // INSERTION SORT : SORT IN DESCENDING ORDER
            // public static void insertionSort(int[] nums) {
            //     for(int i=1; i<nums.length; i++) {
            //         int curr = nums[i];
            //         int prev = i-1;
            //         while(prev >=0 && nums[prev] < curr) {
            //             nums[prev+1] = nums[prev];
            //             prev--;
            //         }
            //         nums[prev+1] = curr;
            //     }
            //     System.out.println(Arrays.toString(nums));
            // } 

       
        //PROGRAM-4 // INBUILT SORT : SORT IN DESCENDING ORDER
            // public static void inbuiltSort(int[] nums) {
            //     Arrays.sort(nums, Collections.reverseOrder());
            //     System.out.println(Arrays.toString(nums));
            // }

        //PROGRAM-5 // COUNTING SORT : SORT IN DESCENDING ORDER
        // public static void countingSort(int[] nums) {
        //     int smallest = Integer.MAX_VALUE;
        //     for (int i = 0; i < nums.length; i++) {
        //         smallest = Math.min(smallest, nums[i]);
        //     }

        //     int[] count = new int[smallest + 1];
        //     for (int i = 0; i < nums.length; i++) {
        //         count[smallest - nums[i]]++;
        //     }

        //     int j = 0; // Start from the beginning of the array
        //     for (int i = 0; i < count.length; i++) {
        //         while (count[i] > 0) {
        //             nums[j] = smallest - i;
        //             j++;
        //             count[i]--;
        //         }
        //     }

        //     System.out.println(Arrays.toString(nums));
        // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //PROGRAM-1 // BUBBLE SORT
            // int[] nums = {5, 4, 1, 3, 2};
            // bubbleSort(nums);
            // printBubbleSort(nums);
            
        //PROGRAM-2 // SELECTION SORT
            // int[] nums = {5, 4, 1, 3, 2};
            // selectionSort(nums);
            // printSelectionSort(nums);

        //PROGRAM-3 // INSERTION SORT
            // int[] nums = {5, 4, 1, 3, 2};
            // insertionSort(nums);
            // printInsertionSort(nums);
        
        //PROGRAM-4 // INBUILT SORT
            // int[] nums = {5, 4, 1, 3, 2};
            // Arrays.sort(nums);
            // printInbuiltSort(nums);

        //PROGRAM-5 // COUNTING SORT
            // int[] nums = {1, 4, 1, 3, 2, 4, 2, 7};
            // countingSort(nums);
            // printCountingSort(nums);


//------------------PRACTICE QUESTIONS----------------//

        //PROGRAM-1 // BUBBLE SORT :  SORT IN DESCENDING ORDER
            // int[] nums = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
            // bubbleSort(nums);
        //PROGRAM-2 // SELECTION SORT : SORT IN DESCENDING ORDER
            // int[] nums = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
            // selectionSort(nums);
        //PROGRAM-3 // INSERTION SORT : SORT IN DESCENDING ORDER
            // int[] nums = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};  
            // insertionSort(nums);
        
        //PROGRAM-4 // INBUILT SORT : SORT IN DESCENDING ORDER
            // int[] nums = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};  
            // inbuiltSort(nums);

        //PROGRAM-5 // COUNTING SORT : SORT IN DESCENDING ORDER
            // int[] nums = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1}; 
            // countingSort(nums);






    }
}
