package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class _771 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));//要把String的一个一个字符add进去
        }                        //.charAt方法可以做到索引处的字符
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))){
                ans++;
            }
        }
        return ans;
    }
}