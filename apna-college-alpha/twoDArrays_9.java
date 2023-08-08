import java.util.Arrays;
import java.util.Scanner;

//------------2D ARRAYS-------------//

//---------QUESTIONS IN THIS FILE-----------//

//PROGRAM-1 - INPUT IN 2D ARRAY
//PROGRAM-2 - TARGET ELEMENT IN 2D ARRAY
//PROGRAM-3 - MINIMUM AND MAXIMUM IN 2D ARRAY
//PROGRAM-4 - SPIRAL MATRIX
//PROGRAM-5 - DIAGONAL SUM
//PROGRAM-6 - SEARCH IN SORTED MATRIX

//----------------PRACTICE QUESTIONS----------------//

//PROGRAM-1 - PRINT THE NUMBERS OF 7's that are in 2D array
//PROGRAM-2 - PRINT THE SUM OF THE NUMBERS IN THE SECOND ROW OF THE "nums" array
//PROGRAM-3 - WAP TO FIND THE TRANSPOSE OF A MATRIX





public class twoDArrays_9 {

    //PROGRAM-2 - TARGET ELEMENT IN 2D ARRAY
        // public static boolean search(int[][] matrix, int key) {
        //     for (int i = 0; i < matrix.length; i++) {
        //         for(int j=0; j<matrix.length; j++) {
        //             if(matrix[i][j] == key) {
        //                 System.out.print(key + " found in matrix at (" + i + "," + j + ") : ");
        //                 return true;
        //             }
        //         }
        //     } 
        //     return false;
        // }

    //PROGRAM-3 - MINIMUM AND MAXIMUM IN 2D ARRAY
        // public static void minMax(int[][] matrix) {
        //     int max = Integer.MIN_VALUE;
        //     int min = Integer.MAX_VALUE;

        //     for (int i = 0; i < matrix.length; i++) {
        //         for(int j=0; j<matrix[0].length; j++) {
        //              if(matrix[i][j] < min) {
        //                 min = matrix[i][j];
        //             }
        //             if(matrix[i][j] > max) {
        //                 max = matrix[i][j];
        //             }    
        //         }   
        //     }
        //     System.out.println("Min = " + min);
        //     System.out.println("Max = " + max);
        // }

        //PROGRAM-4 - SPIRAL MATRIX
            // public static void spiralMatrix(int[][] matrix) {
            //     int startRow = 0;
            //     int endRow = matrix.length-1;
            //     int startCol = 0;
            //     int endCol = matrix.length-1;

            //     while(startRow<=endRow && startCol <= endCol) {

            //         //top
            //         for(int j=startCol; j<=endCol; j++) {
            //             System.out.print(matrix[startRow][j] + " ");
            //         }

            //         //right
            //         for(int i=startRow+1; i<=endRow; i++) {
            //             System.out.print(matrix[i][endCol] + " ");
            //         }

            //         //bottom
            //         for(int j=endCol-1; j>=startCol; j--) {
            //             if(startRow == endRow) {
            //                 break;
            //             }
            //             System.out.print(matrix[endRow][j] + " ");
            //         }

            //         //left
            //         for(int i=endRow-1; i>=startRow+1; i--) {
            //              if(startCol == endCol) {
            //                 break;
            //             }
            //             System.out.print(matrix[i][startCol] + " ");
            //         }

            //         startCol++;
            //         startRow++;
            //         endCol--;
            //         endRow--;
            //     } 
            //     System.out.println();
            // }

    //PROGRAM-5 - DIAGONAL SUM
        // public static int diagonalSum(int[][] matrix) {
        //     int sum = 0;

        //     //brute force
        //         // for(int i=0; i<matrix.length; i++){
        //         //     for(int j=0; j<matrix.length; j++) {
        //         //         if(i == j) {
        //         //             sum+= matrix[i][j];
        //         //         }
        //         //         else if(i+j == matrix.length-1) {
        //         //             sum+= matrix[i][j];
        //         //         } 
        //         //     }
        //         // }

        //     //optimized approach
        //         // for(int i=0; i<matrix.length; i++) {
        //         //     //primary diagonal
        //         //     sum+= matrix[i][i];
        //         //     //secondary diagonal
        //         //     if(i != matrix.length-1-i) {
        //         //         sum+= matrix[i][matrix.length-i-1];
        //         //     }
        //         // } 

        //     return sum;
        // }

    //PROGRAM-6 - SEARCH IN SORTED MATRIX
        // public static boolean staircaseSearch(int[][] matrix, int target) {
        //     int row = 0;
        //     int col = matrix.length - 1;

        //     while(row < matrix.length &&  col >= 0) {
        //         if(matrix[row][col] == target) {
        //             System.out.println("found key at (" + row + "," + col + ")");
        //             return true;
        //         } else if (target < matrix[row][col]) {
        //             col--;
        //         } else {
        //             row++;
        //         }

        //     }
        //     System.out.println("key not found");
        //     return false;

        // }

//----------------PRACTICE QUESTIONS----------------//

        //PROGRAM-1 - PRINT THE NUMBERS OF 7's that are in 2D array
            // public static int totalNubers(int[][] nums, int target) {
            //     int sum = 0;

            //     for(int i=0; i<nums.length; i++) {
            //         for(int j=0; j<nums[i].length; j++) {
            //             if(nums[i][j] == target) {
            //             sum++;
            //             }
            //         } 
            //     }
            //     return sum;
            // }

        //PROGRAM-2 - PRINT THE SUM OF THE NUMBERS IN THE SECOND ROW OF THE "nums" array
            // public static void sumOfSecondRow(int[][] nums) {
            //     int sum = 0;
            //     if(nums.length > 1) {
            //         for(int j=0; j<nums[1].length; j++) {
            //             sum += nums[1][j];
            //         }
            //         System.out.println(sum);
            //     } else {
            //         System.out.println("Array Doesnt have second row");
            //     }

            // }
                   
                
        //PROGRAM-3 - WAP TO FIND THE TRANSPOSE OF A MATRIX
            // public static void transposeOfMatrix(int[][] matrix, int row, int col) {
            //     int[][] transpose = new int[col][row];

            //     for(int i=0; i<row; i++) {
            //         for(int j=0; j<col; j++) {
            //           transpose[j][i] = matrix[i][j];
            //         }
            //     }

            //     System.out.println(Arrays.deepToString(transpose));
            // }
     



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //PROGRAM-1 - INPUT IN 2D ARRAY
        // int[][] matrix = new int[3][3];                            

        // //input 2d array
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix.length; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // //print 2d rray
        // for (int i = 0; i < matrix.length; i++) {
        //     System.out.println(Arrays.toString(matrix[i]));
        // }

    //PROGRAM-2 - TARGET ELEMENT IN 2D ARRAY
        //System.err.println(search(matrix, 5));

    //PROGRAM-3 - MINIMUM AND MAXIMUM IN 2D ARRAY
        //minMax(matrix);

    //PROGRAM-4 - SPIRAL MATRIX
        // int[][] matrix = {{1, 2, 3, 4},
        //                     {5, 6, 7, 8}, 
        //                     {9, 10, 11, 12}, 
        //                     {13, 14, 15, 16}};
            
        // spiralMatrix(matrix);

    //PROGRAM-5 - DIAGONAL SUM
        // int[][] matrix = {{1, 2, 3, 4},
        //                     {5, 6, 7, 8}, 
        //                     {9, 10, 11, 12}, 
        //                     {13, 14, 15, 16}};
                
        // System.out.println(diagonalSum(matrix));

    //PROGRAM-6 - SEARCH IN SORTED MATRIX
        // int[][] matrix = {{10, 20, 30, 40}, 
        //                 {15, 25, 35, 45}, 
        //                 {27, 29, 37, 48}, 
        //                 {32, 33, 39, 50}};
            
        // int target = 33;
        // staircaseSearch(matrix, target);



//----------------PRACTICE QUESTIONS----------------//

        //PROGRAM-1 - PRINT THE NUMBERS OF 7's that are in 2D array
            // int[][] nums = {{4, 7, 8}, 
            //                 {8, 8, 7}};

            // int target = 7;
            // System.out.println(totalNubers(nums, target));

        //PROGRAM-2 - PRINT THE SUM OF THE NUMBERS IN THE SECOND ROW OF THE "nums" array
            // int[][] nums = {{1, 4, 9}, 
            //                 {11, 4, 3}, 
            //                 {2, 2, 3}};
            // sumOfSecondRow(nums);

            
        //PROGRAM-3 - WAP TO FIND THE TRANSPOSE OF A MATRIX
            // int[][] matrix = {{1, 2, 3}, 
            //                 {4, 5, 6}};
            // int row = 2;
            // int col = 3; 
            // transposeOfMatrix(matrix, row, col);

    
 






        
    }    
}
