import java.util.HashSet;
import java.util.Set;

public class 无重复字符的最长字串 {
    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int carry = 0, i = 0, j = 0;
        while (i < n && j < n) {
            //j是前节点 i是后节点 差值就是长度
            //循环的目的时找到[i, j]的长度
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));//必须j++ 这样j保证是实时长度值而不是实时下标值
                carry = Math.max(carry, j - i);
            }
            /*重点在于j,当存在重复字符的时候j是固定不动的
            * 直到重复字符和重复字符之前的子串全被删除为止'*/
            else {
                set.remove(s.charAt(i++));//只
            }
        }
        return carry;
    }
}
