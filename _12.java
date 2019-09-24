package LeetCode;
import	java.util.HashMap;

import java.util.Map;

public class _12 {
    public static String intToRoman(int num) {
        //贪心算法,先使用大的"面额" 否则算法不成立
        //例如1001,掏一千块再掏一个一元就好了,很方便
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++){
            while (num >= nums[i]) {
                stringBuilder.append(keys[i]);
                num -= nums[i];//一次减去一个当前节点的值
            }//每一轮结束num的值都会变为比当前nums[i]小的一个接近值
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(12343));
    }
}
