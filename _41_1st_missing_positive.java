
import java.util.Arrays;

public class _41_1st_missing_positive {
    public static void main(String[] args) {
        int[] arr = {2,1};

        firstPositive(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(firstPositive(arr));
    }

    public static int firstPositive(int[] arr){

        if(arr.length == 1 && arr[0] == 1){
            return 2;
        }
        if(arr.length == 1 && (arr[0]>1 || arr[0]<1)){
            return 1;
        }

        int i =0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[correct]  ){
                swap(arr,i,correct);

            }else {
                i++;
            }
        }


        int max = arr[0];
        for(int j = 0; j<arr.length ;j++){
            if(arr[j] > max){
                max = arr[j];
            }
            if(arr[j] != j+1 ){
                return j+1 ;
            }
        }

        return max+1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
