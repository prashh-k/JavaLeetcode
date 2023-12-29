
public class _287_Duplicate_number {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        System.out.println(duplicate_number(arr));
    }

    public static int duplicate_number(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,correct,i);
            }else{
                i++;
            }
        }

        return arr[arr.length-1];
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
