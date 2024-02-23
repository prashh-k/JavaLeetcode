package Assignments.Lec_7_strings;

public class _1678_Goal_parser {
    public static void main(String[] args) {
        String command = "G()(al)";

        System.out.println(GoalParser(command));

    }
    public static String GoalParser(String command){
        String ans = command.replace("()", "o").replace("(al)", "al");
        return ans;
    }
}
