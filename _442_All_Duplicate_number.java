
import java.util.ArrayList;

public class _442_All_Duplicate_number {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(allDuplicatenumber(arr));
    }

    public static ArrayList<Integer> allDuplicatenumber(int[] arr) {
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
                ans.add(arr[j]);
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

