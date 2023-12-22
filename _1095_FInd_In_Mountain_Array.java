package Lectures.Lec_8_BS_Questions;

public class _1095_FInd_In_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};

        int result = findInMountainArray(arr, 3);
        System.out.println(result);
    }

    public static int findInMountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1] ) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int ans = binarySearch(arr, target, 0, start);
        if (ans == -1 ){
            ans = binarySearch(arr,target,start, 0);
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


