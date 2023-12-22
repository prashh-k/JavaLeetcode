package Lectures.Lec_8_BS_Questions;

public class _744_Smalletest_letter {
    public static void main(String[] args) {
        char[] nums = {'c','f','j'};
        char target = 'a';

        System.out.println(ceiling(nums,target));
    }


    // Ceiling Number = Smallest number greater than Target number.
    public static char ceiling(char[] letters, int target){
        int start = 0 ;
        int end = letters.length -1;

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
