package LeetCode;
import java.util.ArrayList;
import	java.util.List;
//两数之和 #1
public class _1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                int value = nums [i] + nums[j];
                if(value == target){
                    int [] targetArray = new int [2];
                    targetArray [0] = i;
                    targetArray [1] = j;
                    return targetArray;
                }
            }
        }
        return null;
    }
}
