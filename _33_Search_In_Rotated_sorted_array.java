package Lectures.Lec_8_BS_Questions;

public class _33_Search_In_Rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int target = 1;

        System.out.println(search(arr,target));

    }

    public static int search(int[] nums, int target) {

        if(nums.length == 1 && nums[0]== target){
            return 0;
        }else if(nums.length == 1 && nums[0]!= target){
            return -1;
        }

//        if(nums.length == 2) {
//            if (nums[0] == target) {
//                return 0;
//            } else if (nums[1] == target) {
//                return 1;
//            } else {
//                return  -1;
//            }
//        }


        int start = 0;
        int end = nums.length - 1;

        if(nums[start] > nums[end]) {

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < end && nums[mid] > nums[mid + 1]) {
                    start = mid;
                    break;
                }
                if (mid > start && nums[mid] < nums[mid-1]){
                    start = mid -1;
                    break;
                }
                if (nums[mid] < nums[start]  && nums[mid] < nums[mid + 1]) {
                    end = mid - 1;
                } else if (nums[mid] < nums[mid + 1] ) {
                    start = mid + 1;
                }
            }

            int result = binarySearch(nums, target, 0, start);
            if (result == -1) {
                result = binarySearch(nums, target, start + 1, nums.length - 1);
            }
            return result;
        }
        else {
            int result = binarySearch(nums, target,0, nums.length-1);
            return result;
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}