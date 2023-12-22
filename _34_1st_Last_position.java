package Lectures.Lec_8_BS_Questions;

import java.util.Arrays;

public class _34_1st_Last_position {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,4,5,5,5,6,6,7,7,8,8,8};
        int target = 5;

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }


    // Ceiling Number = Smallest number greater than Target number.
    public static int[] searchRange(int[] arr, int target){
        int[] ans = new int[2];

        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] arr, int target, boolean firstIndexof){
        int start = 0 ;
        int end = arr.length -1;
        int ans = -1;

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                  ans =  mid;
                  if(firstIndexof){
                      end = mid - 1;
                  } else {
                      start = mid +1;
                  }

            }
        }
        return ans;

    }
}
