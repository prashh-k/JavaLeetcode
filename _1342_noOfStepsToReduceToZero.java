package Lectures.Lec_16_Recursion.Lec_20_EasyQuestions;

public class _1342_noOfStepsToReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }

    public static int numberOfSteps(int num){
        return helper(num,0);
    }

    public static int helper(int num,int count){

        if(num == 0){
            return count;
        }

        if( num % 2 == 0){
            num /= 2 ;
        }
        else{
            num -= 1;
        }

        return helper(num,count+1);
    }
}
