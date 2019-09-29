package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class fortysixth_46 {
    int count = 0;
    public void backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> result, int flag) {
        System.out.println(count++);
        if (flag == n)
            //溯回次数到达数字长度后,就存进去一组组合数
            System.out.println(nums);
            result.add(new ArrayList<Integer>(nums));

        for (int i = flag; i < n; i++) {
            Collections.swap(nums, flag, i);
            backtrack(n, nums, result, flag + 1);//往前走一步,共走n次
            //将交换过的nums传给递归, 然后再换回来
            Collections.swap(nums, flag, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        for (int num : nums)
            carry.add(num);
        int n = nums.length;
        //存入初始数字后进行溯回
        backtrack(n, carry, result, 0);
        return result;
    }

    public static void main(String[] args) {
         fortysixth_46  test = new fortysixth_46();
         int [] nums = {1,2,3};
        System.out.println(test.permute(nums));
    }
}
