package Assignments.Lec_7_strings;

public class _1662_equivalent_string_array {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        for (int i =0; i< word1.length;i++){
            w1 = w1 + word1[i];
        }
        String w2 = "";
        for (int i =0; i< word2.length;i++){
            w2 = w2 + word2[i];
        }

        if(w1.equals(w2)) {
            return true;
        }
        return false;

    }
}
