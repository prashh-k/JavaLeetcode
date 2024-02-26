/**
 * _1752_CheckArraySortedAndRotated
 */
public class _1752_CheckArraySortedAndRotated {

    public boolean check(int[] nums) {
        boolean sorted = false;
        boolean rotated = false;
        int max = 0;

        if(nums.length == 2){
            return true;
        }
        if(nums.length == 1){
            return true;
        }

        for(int i =0; i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]){
                sorted = true;
            }else{
                sorted = false;
                max = i;
                break;
            }
        }

        for(int j=max+1;j<nums.length-1;j++){
        
            if(nums[j] <= nums[j+1]){
                rotated = true;
            }
            else{
                rotated = false;
                break;
            }
        }
        if(max+1 == nums.length-1){
                rotated = true;
            }

        if(nums[nums.length-1] > nums[0] && sorted == false){
            return false;
        }

        return rotated;
    }
}