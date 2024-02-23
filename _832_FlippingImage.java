package Lectures.Lec_18_BitwiseOperator;

import java.util.Arrays;

public class _832_FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{0,1,1},{1,0,1},{1,1,0}};

        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }
    static public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image) {
            // reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
