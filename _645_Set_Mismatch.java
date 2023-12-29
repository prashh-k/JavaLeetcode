
import java.util.Arrays;

public class _645_Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        System.out.println(Arrays.toString(misMatch(arr)));
    }

    public static int[] misMatch(int[] arr){

        int[] ans = new int[2];

        int i =0;
        while(i< arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for(int j= 0; j< arr.length;j++){
            if(j != arr[j] - 1){
                ans[1] = j + 1;
                ans[0] = arr[j];
            }
        }




//        for(int j =0; j< arr.length-1;j++){
//            if(arr[j] == arr[j+1]){
//                ans[0] = arr[j];
//                ans[1] = arr[j] + 1;
//            }
//        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
