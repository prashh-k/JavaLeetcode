package Assignments.Lec_4_Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class _1480_Sum_of_1D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5] ;
        for (int i =0; i< arr.length ; i++ ){
            arr[i] = in.nextInt();
        }

        int[] res = max(arr);
        System.out.println(Arrays.toString(res));

    }
    static int[] max(int[] num){
        int[] max = new int[5];
        max[0] = num[0];
        for(int i= 1;i < num.length;i++){
            max[i] = num[i] + max[i-1];
        }
        return max;
    }
}

