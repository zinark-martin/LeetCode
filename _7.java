package LeetCode;

import java.util.Arrays;

//整数反转
//class Solution {
//    public int reverse(int x) {
//        Integer it = x;
//        String st = it.toString();
//        int[] nums = new int[st.length()];
//        for (int i = nums.length - 1; i >= 0; i--) {
//            char c = st.charAt(i);
//            nums[i] = Integer.parseInt(Character.toString(c));
//        }
//    }
//}
class Soluuution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop; //上一个进一位, 加上新个位数
        }
        return rev;
    }
}