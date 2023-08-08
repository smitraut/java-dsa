import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//-------SORTING ALGORITHMS---------//
//PROGRAM-1 : BUBBLE SORT
//PROGRAM-2 : SELECTION SORT
//PROGRAM-3 : INSERTION SORT
//PROGRAM-4 : CYCLE SORT

//QUESTIONS ON CYCLIC SORT
    //MISSING NUMBERS
    //FIND ALL THE NUMBERS DISSAPEARED IN AN ARRAY
    //FIND THE DUPLICATE NUMBER
    //SET MISMATCH
    //FIND ALL THE DUPLICATES 



public class sorting_6 {

//PROGRAM-1 : BUBBLE SORT
    // public static void bubbleSort(int[] nums) {
    //     boolean swapped;

    //     for(int i=0; i<nums.length-1; i++){
    //         swapped = false;
    //         for(int j=1; j<nums.length-i; j++) {
    //             if(nums[j] < nums[j-1]) {
    //                 int temp = nums[j];
    //                 nums[j] = nums[j-1];
    //                 nums[j-1] = temp;
    //                 swapped = true;
    //             }
    //         }

    //         if(!swapped) {
    //             break;
    //         }
    //     }   
    // }


//PROGRAM-2 : SELECTION SORT
    // public static void selectionSort(int[] nums) {
    //     for(int i=0; i<nums.length-1; i++) {
    //         int smallest = i;
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[smallest] > nums[j]) { //change to < for descending order
    //                 smallest = j;
    //             }
    //         }
    //     int temp = nums[smallest];
    //     nums[smallest] = nums[i];
    //     nums[i] = temp;
    //     }
    // }


//PROGRAM-3 : INSERTION SORT
    // public static void insertionSort(int[] nums) {
    //     for(int i=1; i<nums.length; i++) {
    //         int curr = nums[i];
    //         int prev = i-1;
    //         while(prev >= 0 && nums[prev] > curr) { // change to < for descending
    //             nums[prev+1] = nums[prev];
    //             prev--;
    //         }
    //         nums[prev+1] = curr;
    //     }
    // }
        
    


//PROGRAM-4 : CYCLE SORT
    // public static void cyclicSort(int[] nums) {
    //     int i = 0;
    //     while(i<nums.length) {
    //         int correct = nums[i] - 1;
    //         if(nums[i] != nums[correct]) {
    //            swap(nums, i, correct);
    //         } else {
    //             i++;
    //         }
    //     }
    // }

    // public static void swap(int[] nums, int first, int second) {
    //     int temp = nums[first];
    //     nums[first] = nums[second];
    //     nums[second] = temp;
    // }

//QUESTIONS ON CYCLIC SORT

    //MISSING NUMBERS
        // public static int missingNumber(int[] nums) {
        //     int i = 0;
        //     while(i<nums.length) {
        //         int correct = nums[i];
        //         if(nums[i] < nums.length && nums[i] != nums[correct]) {
        //         swap(nums, i, correct);
        //         } else {
        //             i++;
        //         }
        //     }

        //     //search for first missing number
        //     for(int j=0; j<nums.length; j++) {
        //         if(nums[j] != j) {
        //             return j;
        //         }
        //     }
        //     // If no missing number found, the missing number is equal to the array length
        //     return nums.length;
        // }

        // public static void swap(int[] nums, int first, int second) {
        //     int temp = nums[first];
        //     nums[first] = nums[second];
        //     nums[second] = temp;
        // }

    //FIND ALL THE NUMBERS DISSAPEARED IN AN ARRAY
        // public static List<Integer> allMissingNumbers(int[] nums) {
        //     int i = 0;
        //     while (i < nums.length) {
        //         int correct = nums[i] - 1;
        //         if (nums[i] != nums[correct]) {
        //             swap(nums, i, correct);
        //         } else {
        //             i++;
        //         }
        //     }
        
        //     // Find all the missing numbers
        //     List<Integer> ans = new ArrayList<>();
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[j] != j + 1) {
        //             ans.add(j + 1);
        //         }
        //     }
        //     return ans;
        // }
        
        // public static void swap(int[] nums, int first, int second) {
        //     int temp = nums[first];
        //     nums[first] = nums[second];
        //     nums[second] = temp;
        // }

    //FIND THE DUPLICATE NUMBER
        // public static int findDuplicate(int[] nums) {
        //     int i = 0;
        //     while(i<nums.length) {
        //         if(nums[i] != i + 1) {
        //             int correct = nums[i] - 1;
        //             if (nums[i] != nums[correct]) {
        //                 swap(nums, i, correct);
        //             } else {
        //                 return nums [i];
        //             }
        //         } else {
        //             i++;
        //         }
        //     }
        //     return -1;
        // }

        // public static void swap(int[] nums, int first, int second) {
        //     int temp = nums[first];
        //     nums[first] = nums[second];
        //     nums[second] = temp;
        // }

    //FIND ALL THE DUPLICATES 
        // public static List<Integer> findDuplicate(int[] nums) {
        //     int i = 0;
        //     while(i<nums.length) {
        //             int correct = nums[i] - 1;
        //             if (nums[i] != nums[correct]) {
        //                 swap(nums, i, correct);
        //             } else {
        //                 i++;
        //             }
        //     }

        //       List<Integer> ans = new ArrayList<>();
        //         for (int j = 0; j < nums.length; j++) {
        //             if (nums[j] != j + 1) {
        //                 ans.add(nums[j]);
        //             }
        //         }
        //         return ans;
        //     }
        

        // public static void swap(int[] nums, int first, int second) {
        //     int temp = nums[first];
        //     nums[first] = nums[second];
        //     nums[second] = temp;
        // }

    //SET MISMATCH
        // public static int[] setMismatch(int[] nums) {
        //     int i = 0;
        //     while (i < nums.length) {
        //         int correct = nums[i] - 1;
        //         if (nums[i] != nums[correct]) {
        //             swap(nums, i, correct);
        //         } else {
        //             i++;
        //         }
        //     }
        
        //     // Search for the first missing number
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[j] != j + 1) {
        //             return new int[]{nums[j], j + 1};
        //         }
        //     }
        //     return new int[]{-1, -1};
        // }
        
        // public static void swap(int[] nums, int first, int second) {
        //     int temp = nums[first];
        //     nums[first] = nums[second];
        //     nums[second] = temp;
        // }
    
    
    






    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

    //PROGRAM-1 : BUBBLE SORT
        // int[] nums = {3, 5, 2, 1, 4};
        // bubbleSort(nums);
        // System.out.println(numsays.toString(nums));

    //PROGRAM-2 : SELECTION SORT
        // int[] nums = {5,4, 3, 2, 1};
        // selectionSort(nums);
        // System.out.println(numsays.toString(nums));

    //PROGRAM-3 : INSERTION SORT
        // int[] nums = {5, 4, 3, 2, 1};
        // insertionSort(nums);
        // System.out.println(Arrays.toString(nums));

    //PROGRAM-4 : CYCLE SORT
        // int[] nums = {5, 4, 3, 2, 1};
        // cyclicSort(nums);
        // System.out.println(Arrays.toString(nums));

    //QUESTIONS ON CYCLIC SORT

        //MISSING NUMBERS
            // int[] nums = {3, 2, 0, 1, 4};
            // missingNumber(nums);
            // System.out.println(missingNumber(nums));

        //FIND ALL THE MISSING NUMBERS IN AN ARRAY
            // int[] nums = {4, 3, 2, 7, 8, 2, 1, 1}; // Example array
            // List<Integer> missingNumbers = allMissingNumbers(nums);
            //     for (int num : missingNumbers) {
            //         System.out.print(num + " ");
            //      }

        //FIND THE DUPLICATE NUMBER
            // int[] nums = {1, 3, 4, 5, 2, 3};
            // findDuplicate(nums);
            // System.out.println(findDuplicate(nums));

         //FIND ALL THE DUPLICATES 
            // int[] nums = {1, 3, 2, 4, 2, 3};
            // findDuplicate(nums);
            // System.out.println(findDuplicate(nums));
        
        //SET MISMATCH
            // int[] nums = {1, 3, 2, 3, 5};
            // int[] result = setMismatch(nums);
            // System.out.println("Duplicate: " + result[0]);
            // System.out.println("Missing: " + result[1]);
        
            
      
        




    }
}
