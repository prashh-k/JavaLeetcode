package Assignments.Lec_7_strings;

public class _1616_split_two_string_to_palindrome {
    public static void main(String[] args) {
        String a = "xbdef";
        String b = "xecab";

        String s ="ulacfd";
        String sub = s.substring(0, 6);
        String remainder = s.substring(2);

//        System.out.println(sub);

        System.out.println(checkPalindromeFormation(a,b));

    }

    public static boolean checkPalindromeFormation(String a, String b) {

        String a_pre = "";
        String a_suf = "";
        String b_pre = "";
        String b_suf = "";
        String c1;
        String c2;

        for(int i=0; i<a.length();i++){
            a_pre = a.substring(0,i);
            a_suf = a.substring(i);
            b_pre = b.substring(0,i);
            b_suf = b.substring(i);
            c1 = a_pre + b_suf;
            c2 = b_pre + a_suf;

            if (palindrome(c1) == true){
                return true;
            } else if (palindrome(c2)==true) {
                return true;
            }

        }
        return false;

    }


    public static boolean palindrome(String str){
        boolean palin =true;

        for(int i=0; i<= str.length() /2 ;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                palin = false;
            }
        }
        return palin;

    }



//    public boolean checkPalindromeFormation(String a, String b) {
//
//        if(a.length() == 1){
//            return true;
//        }
//
//        String w1 = a+ b;
//        String w2 = b+ a;
//
//        if(palindrome(w1) || palindrome(w2)){
//            return true;
//        }
//        return false;
//
//    }
//
//    public static boolean palindrome(String str){
//
//        if(str.charAt(0)==str.charAt(str.length()-1)){
//            return true;
//        }
//
//
//        return false;
//
//    }
}
