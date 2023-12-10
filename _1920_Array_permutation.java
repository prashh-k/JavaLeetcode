package Assignments.Lec_4_Array_ArrayList;

import java.util.Arrays;

public class _1920_Array_permutation {
    public static void main(String[] args) {
        int[] arr  = {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));
    }

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i] =  nums[nums[i]];
        }

        return ans;
    }
}
