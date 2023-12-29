
import java.util.ArrayList;
import java.util.Arrays;

public class _448_number_disappeared {
    public static void main(String[] args) {
        int[] arr = { 1,1 };

//        findDisappearedNumbers(arr);
 //       System.out.println(Arrays.toString(arr));

        System.out.println(findDisappearedNumbers(arr));
    }


    public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;

        while(i< arr.length){
            int correct = arr[i] -1 ;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for(int j =0; j< arr.length; j++){
            if( j != arr[j] - 1 ){
                ans.add(j+1);
            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
