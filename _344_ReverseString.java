package Assignments.Lec_9_Recursion;

public class _344_ReverseString {
    public void reverseString(char[] s) {
        revString(s,0,s.length-1);
    }

    public void revString(char[] arr,int s, int e){
        if(s >= e){
            return;
        }

        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        revString(arr,s+1,e-1);
    }
}
