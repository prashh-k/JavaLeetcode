package Assignments.Lec_4_Array_ArrayList;

public class _1672_Richest_customer_wealth {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,2,1}};

        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] accounts) {

        int max= 0 ;
        int maxc =0;

        for (int i=0 ; i < accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                max = max + accounts[i][j];
                if(j == accounts[i].length - 1 ){
                    if (maxc < max){
                        maxc = max ;
                    }
                    max = 0 ;
                }
            }
        }
        return maxc ;
    }
}
