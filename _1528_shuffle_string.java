package Assignments.Lec_7_strings;

public class _1528_shuffle_string {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(shuffleString(s,indices));
    }
    public static String shuffleString(String s, int[] indices){
        String ans = "";

        for(int i=0; i< indices.length;i++){
            for(int j=0; j< indices.length ;j++){
                if(indices[j]==i){
                    ans = ans + s.charAt(j);
                    break;
                }
            }
        }
        return ans;
    }
}
