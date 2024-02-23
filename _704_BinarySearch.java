package Assignments.Lec_9_Recursion;

public class _704_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5};

        System.out.println(BS(arr,5,0,arr.length-1));
    }

    static public int BS(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + ( e - s ) / 2;

        if(target == arr[m]){
            return m;
        }

        if(target <= arr[m]) {
            return BS(arr,target,s,m-1);
        }
        else{
            return BS(arr,target,m+1,e);
        }
    }
}
