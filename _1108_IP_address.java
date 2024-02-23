package Assignments.Lec_7_strings;

public class _1108_IP_address {
    public static void main(String[] args) {
        String add = "1.1.1.1.1";

        System.out.println(IpAddress(add));
    }
    public static String  IpAddress(String address){
        String ans = address.replace(".","[.]");
        return ans ;
    }
}
