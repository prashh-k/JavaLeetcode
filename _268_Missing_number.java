package Lectures.Lec_13_cyclic_Sort;

import java.util.Arrays;

public class _268_Missing_number {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
