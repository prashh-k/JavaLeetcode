package Assignments.Lec_4_Array_ArrayList;

import java.util.Arrays;

public class _1470_Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};

        System.out.println(Arrays.toString(shuffle(arr)));
    }

    public static int[] shuffle(int[] nums){
        int[] ans = new int[nums.length];
        int ni = nums.length/2 ;

        for(int i =0; i < ni;i++){

                ans[2*i] = nums[i] ;
            ans[2*i + 1] = nums[ni+i] ;
        }
    return ans;
    }
}
