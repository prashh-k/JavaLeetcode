import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       ArrayList <Boolean> arr = new ArrayList<>();   //arraylist declaration
    int max = candies[0];    //finding max element in the given array
    for(int i=0;i<candies.length;i++){
        if(candies[i] > max){
            max = candies[i];
        }
    }
	//adding extras and check max or not and add list true or false accordingly
    for(int i=0;i<candies.length;i++){ 
        if((candies[i]+extraCandies)>= max){
            arr.add(true);
        }
        else{
            arr.add(false);
        }
    }
   // System.out.println(arr);
    return arr;
    
    
}
}