import java.util.Scanner;

//---------QUESTIONS IN THIS FILE----------------------------//

//PROGRAM-1 // BINARY SEARCH // FIND IF THE KEY EXISTS IN THE ARRAY // SORTED ARRAY ASCENDING OR DESCENDING
//PROGRAM-2 // CEILING OF A NUMBER // SMALLEST NUMBER >= TARGET ELEMENT
//PROGRAM-3 // FLOOR OF A NUMBER // BIGGEST NUMBER <= TARGET NUMBER
//PROGRAM-4 // SMALLEST LETTER > TARGET LETTER
//PROGRAM-5 // FIND FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY
//PROGRAM-6 // POSITION OF AN ELEMENT IN AN INFINITE SORTED ARRAY
//PROGRAM-7 // PEAK INDEX IN MOUNTAIN ARRAY
//PROGRAM-8 // TARGET ELEMENT IN MOUNTAIN ARRAY
//PROGRAM-9 // SEARCH IN ROTATED SORTED ARRAY
//PROGRAM-10 // SPLIT ARRAY LARGEST SUM


public class arrays_binarySearch_5 {

    //PROGRAM-1 // BINARY SEARCH // FIND IF THE KEY EXISTS IN THE ARRAY // SORTED ARRAY ASCENDING OR DESCENDING
        // public static int binarySearch(int numbers[], int key) {
        //     int start = 0;
        //     int end = numbers.length-1;

        //     // find if array is sorted in ascending or descending
        //     boolean isAsc = numbers[start] < numbers[end];
        
        //     while (start <= end) {
        //     //finds the middle index
        //     int mid = start + (end - start) / 2;
        
        //         if (numbers[mid] == key) {
        //             return mid;
        //         } 

        //         if(isAsc) {
        //             if (numbers[mid] < key) {
        //                 start = mid + 1;
        //             } else {
        //                 end = mid - 1;
        //             }   
        //         } else { 
        //             if(numbers[mid] < key) {
        //                 end = mid -1;
        //             } else {
        //                 start = mid + 1;
        //             }
        //         }     
        //     }
        //     return -1;
        // }

    //PROGRAM-2 // CEILING OF A NUMBER // SMALLEST NUMBER >= TARGET ELEMENT
        // public static int ceiling(int[] arr, int target) {
        //     if(target > arr[arr.length - 1]) {
        //          return -1;
        //     }
        //     int start = 0;
        //     int end = arr.length-1;
        //     while(start <= end) {
        //         int mid = start + (end - start) / 2;

        //         if( arr[mid] == target) {
        //             return mid; //arr[mid];
        //         } else if(arr[mid] < target) {
        //             start = mid + 1;
        //         } else {
        //             end = mid - 1;
        //         }
        //     }
        //     return start; //arr[start];
        // }

    //PROGRAM-3 // FLOOR OF A NUMBER // BIGGEST NUMBER <= TARGET NUMBER
        // public static int floor(int[] arr, int target) { 
        //         int start = 0;
        //         int end = arr.length-1;
        //         while(start <= end) {
        //             int mid = start + (end - start) / 2;

        //             if( arr[mid] == target) {
        //                 return mid; //arr[mid];
        //             } else if(arr[mid] < target) {
        //                 start = mid + 1;
        //             } else {
        //                 end = mid - 1;
        //             }
        //         }
        //         return end; //arr[end];
        //     }

    //PROGRAM-4 // SMALLEST LETTER > TARGET LETTER
        // public static char characters(char[] letters, char target) {
        //     int start = 0;
        //     int end = letters.length - 1;

        //     while(start<=end) {
        //         int mid = start + (end - start) / 2;


        //         if(target < letters[mid]) {
        //             end = mid -1;
        //         } else {
        //             start = mid + 1;
        //         }
        //     }
        //     return letters[start % letters.length];
        // }

    //PROGRAM-5 // FIND FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY
        // public static int[] searchRange(int[] nums, int target) {
        //     int[] ans = {-1, -1};

        //     ans[0] = search(nums, target, true);
        //     if(ans[0] != -1) {
        //         ans[1] = search(nums, target, false);
        //     }
        //     return ans;
        // }

        // public static int search(int[] nums, int target, boolean findStartIndex) {
        //     int ans = -1;

        //     int start = 0;
        //     int end = nums.length - 1;

        //     while(start<=end) {
        //        int mid = start + (end - start) / 2;

        //         if(target < nums[mid]) {
        //             end = mid - 1;
        //         } else if(target > nums[mid]) {
        //             start = mid + 1;
        //         } else {
        //             ans = mid;
        //             if(findStartIndex) {
        //                 end = mid -1;
        //             } else {
        //                 start = mid + 1;
        //             }
        //         }
        //     }
        //     return ans;
        // }

    //PROGRAM-6 // POSITION OF AN ELEMENT IN AN INFINITE SORTED ARRAY
        // public static int ans(int[] nums, int target) {
        //     //first find the range
        //     //first start with a box of size 2
        //     int start = 0;
        //     int end = 1;

        //     //condition for the target to lie in the range
        //     while(target > nums[end]) {
        //         int temp = end +1;    // this is my new start
        //         //double the box value
        //         //end = previous end + sizeofbox * 2
        //         end = end + (end - start + 1) * 2;
        //         start = temp;
        //     }
        //     return binarySearch(nums, target, start, end);          
        // }
        
        // public static int binarySearch(int[] nums, int target, int start, int end)  {
        //     while(start<=end) {
        //         int mid = start + (end - start) / 2;
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

    //PROGRAM-7 // PEAK INDEX IN MOUNTAIN ARRAY
        // public static int peakIndexInMountainArray(int[] arr) {
        //     int start = 0;
        //     int end = arr.length - 1;

        //     while(start < end) {
        //         int mid = start + (end - start) / 2;
        //         if(arr[mid] > arr[mid+1]) {
        //             // you are in decreasing part od array
        //             // this may be ans, but look at left
        //             // this is why end != mid - 1
        //             end = mid;
        //         } else {
        //             // you are in asc part of array
        //             start = mid + 1; // because we know that mid+1 element > mid element
        //         }
        //     }
        //     // in the end start == end and pointing to the largest number because of the two checks above
        //     // start and end are always tru=ying to find max element in the above two checks
        //     // hence, when  they are pointing to just one element, that is the max one because that is what the checks say
        //     // more elobaration: at every pont of time for start and end, they have the best possible answer till that time
        //     // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
        //     return start; // or return end as both are equal
        // }

    //PROGRAM-8 // TARGET ELEMENT IN MOUNTAIN ARRAY
        // public static int search(int[] arr, int target) {
        //     int peak = peakIndexInMountainArray(arr);
        //     int firstTry = binarySearch(arr, target, 0, peak);
        //     if(firstTry != -1) {
        //         return firstTry;
        //     } 
        //     return binarySearch(arr, target, peak + 1, arr.length - 1);
        // }
        
        // public static int peakIndexInMountainArray(int[] arr) {
        //     int start = 0;
        //     int end = arr.length - 1;

        //     while(start < end) {
        //         int mid = start + (end - start) / 2;
        //         if(arr[mid] > arr[mid+1]) {
        //             end = mid;
        //         } else {    
        //             start = mid + 1;
        //         }
        //     }
        //      return start;
        // }

        // public static int binarySearch(int arr[], int target, int start, int end) {
        //     boolean isAsc = arr[start] < arr[end];
        
        //     while (start <= end) {
    
        //     int mid = start + (end - start) / 2;
        
        //         if (arr[mid] == target) {
        //             return mid;
        //         } 

        //         if(isAsc) {
        //             if (arr[mid] < target) {
        //                 start = mid + 1;
        //             } else {
        //                 end = mid - 1;
        //             }   
        //         } else { 
        //             if(arr[mid] < target) {
        //                 end = mid -1;
        //             } else {
        //                 start = mid + 1;
        //             }
        //         }     
        //     }
        //     return -1;
        // }

    //PROGRAM-9 // SEARCH IN ROTATED SORTED ARRAY
    //     public static int search(int[] arr, int target) {
    //         int pivot = pivot(arr);
    //         int firstTry = binarySearch(arr, target, 0, pivot);
    //         if(firstTry != -1) {
    //             return firstTry;
    //         } 
    //         return binarySearch(arr, target, pivot + 1, arr.length-1);
    //     }

    //     public static int pivot(int[] arr) { // pivot and peakMountainIndex are same, largest in array
    //         int start = 0;
    //         int end = arr.length-1;

    //         while(start < end) {
    //             int mid = start + (end - start) / 2;
    //             if(arr[mid] > arr[mid +1]) {
    //                 return mid;
    //             } else if(arr[mid] > arr[end]) { 
    //                 start = mid + 1;
    //             } else {
    //                 end = mid;
    //             }
    //         }
    //         return start;
    //     }


    // public static int binarySearch(int[] nums, int target, int start, int end)  {
    //         while(start<=end) {
    //             int mid = start + (end - start) / 2;
    //             if(target < nums[mid]) {
    //                 end = mid - 1;
    //             } else if(target > nums[mid]) {
    //                 start = mid + 1;
    //             } else {
    //                 return mid;
    //             }
    //         }
    //         return -1;
    //     }

//PROGRAM-10 // SPLIT ARRAY LARGEST SUM
    // public static int splitArray(int[] arr, int m) {
    //     int start = 0;
    //     int end = 0;

    //     //linear search
    //     for(int i = 0; i< arr.length; i++) {
    //         start = Math.max(start, arr[i]);
    //         end += arr[i];
    //     }

    //     //binary search
    //     while(start < end) {
    //         int mid = start + (end - start) / 2;

    //         int sum = 0;
    //         int pieces = 1;
    //         for(int num : arr) {
    //             if(sum + num > mid) {
    //                 sum = num;
    //                 pieces++;
    //             } else {
    //                 sum +=num;
    //             }
    //         }
    //         if(pieces > m) {
    //             start = mid+ 1;
    //         } else {
    //             end = mid;
    //         }

    //     }

    //     return end; // start == end
    // }

        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//PROGRAM-1 // BINARY SEARCH // FIND IF THE KEY EXISTS IN THE ARRAY // ASCENDING OR DESCENDING
    // int numbers[] = {90, 75, 18, 12, 8, 6, 4, 3, 1};
    // int numbers[] = {1, 4, 6, 7, 8, 9, 10, 15, 20};
    // int key = 7;
    // int binarySearch = binarySearch(numbers, key);
    // System.out.println(binarySearch);

//PROGRAM-2 // CEILING OF A NUMBER // SMALLEST NUMBER >= TARGET ELEMENT
    // int[] arr = {2, 3, 5, 9, 14, 16, 18};
    // int target = 15;
    // int ceiling = ceiling(arr, target);
    // System.out.println(ceiling);

//PROGRAM-3 // FLOOR OF A NUMBER // BIGGEST NUMBER <= TARGET NUMBER
    // int[] arr = {2, 3, 5, 9, 14, 16, 18};
    // int target = 15;
    // int floor = floor(arr, target);
    // System.out.println(floor);

//PROGRAM-4 // SMALLEST LETTER > TARGET LETTER
    // char[] letters = {'c', 'f', 'j', 'l', 'n', 'p'};
    // char target = 'n';
    // char characters = characters(letters, target);
    // System.out.println(characters);

 //PROGRAM-5 // FIND FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY
    // int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
    // int target = 7;
    // int[] result = searchRange(nums, target);

    // System.out.println("First Position: " + result[0]);
    // System.out.println("Last Position: " + result[1]);

//PROGRAM-6 // POSITION OF AN ELEMENT IN AN INFINITE SORTED ARRAY
    // int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
    // int target = 24;
    // int ans = ans(nums, target);
    // System.out.println(ans);

//PROGRAM-7 // PEAK INDEX IN MOUNTAIN ARRAY
    // int[] arr = {2, 4, 8, 15, 7, 3, 1};
    // System.out.println(peakIndexInMountainArray(arr));

//PROGRAM-8 // TARGET ELEMENT IN MOUNTAIN ARRAY
    // int[] arr = {0, 1, 2, 3, 4, 5, 3, 1};
    // System.out.println(search(arr, 3));

//PROGRAM-9 // SEARCH IN ROTATED SORTED ARRAY
    // int[] arr = {4, 5, 6, 7, 8, 0, 1, 3, 9};
    // System.out.println(search(arr, 3));

//PROGRAM-10 // SPLIT ARRAY LARGEST SUM
    // int[] arr = {7, 2, 5, 8, 10};
    // System.out.println(splitArray(arr, 2));


   
     







    }   
}
