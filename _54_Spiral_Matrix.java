package Assignments.Lec_4_Array_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _54_Spiral_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] num = new int[5 ][4];

        System.out.println(num.length);     // For the no of rows

        for (int row = 0; row < num.length; row++) {

            for (int col = 0; col < num[row].length; col++) {
                num[row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(spiralOrder(num));
    }


    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
//        ArrayList<Integer> max = new ArrayList<Integer>();

//        for (int i = 0; i < matrix[0].length; i++) {
//            max.add(matrix[0][i]);
//        }
//
//        for (int i = 1; i < matrix.length; i++) {
//            max.add(matrix[i][matrix[i].length - 1]);
//        }
//
//        for (int i = matrix[matrix.length - 1].length - 2; i >= 0; i--) {
//            max.add(matrix[matrix.length - 1][i]);
//        }
//
//        for (int i = matrix.length - 2; i >= 1; i--) {
//            max.add(matrix[i][0]);
//        }
//
//
//        for (int i = 1; i < matrix[1].length - 1; i++) {
//            max.add(matrix[1][i]);
//        }
//
//        for (int i = 2; i < matrix.length - 1; i++) {
//            max.add(matrix[i][matrix[i].length - 2]);
//        }
//
//        for (int i = matrix[matrix.length - 2].length - 3; i >= 1; i--) {
//            max.add(matrix[matrix.length -2][i]);
//        }
//
//

//        for (int i = 0; i < matrix.length - matrix.length/4  ; i++){
//            for (int j = i ; j< matrix[i].length - i  ;j++){
//                max.add(matrix[0][j]);
//            }
//
//            for (int j =1 +i ; j< matrix.length - i ;j++){
//                max.add(matrix[j][matrix[j].length-1-i]);
//            }
//
//            for (int j= matrix[matrix.length-1 - i].length - 2 -i  ; j >= i ;j--){
//                max.add(matrix[matrix.length-1-i][j]);
//            }
//
//            for (int j = matrix.length - 2 -i ; j >= i  ;j--){
//                max.add(matrix[j][0 - i]);
//            }
//        }

//        return max;
        ArrayList<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
    }
