package LeetCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//大概先想了一个思路 就叫思路一吧
/*因为题目要求是不能重复的字母 那就先一个个字符地读取进list,
每一轮循环起始地地方做一个判断, 是否当前的list中包含现在的字母元素, 若包含就跳出循环
返回list的长度*/
//然后我就发现了一个问题: 如果该返回时后面还存在比前面长的字符串呢
/*于是将逻辑改为: 每次遇到重复的就记录当前长度,然后清空,
对当前长度和上一轮清空前的长度进行比对,始终更新大的值,重新再add字符*/
/*public int lengthOfLongestSubstring(String s){
        if (s.isEmpty()) return 0;
        else if (s.length()==1) return 1;
        else if (s.length()==2) {
        if (s.charAt(0) == s.charAt(1)) return 1;
        return 2;
        }
        int carry = 0, flag = 0;
        List list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
        if (list.contains(s.charAt(i))) {
        flag = list.size();
        if (flag >= carry) carry = flag;
        if ((char)list.get(list.size()-1) == s.charAt(i)) list.clear();
        for (int j = 0; j < list.size()-1 ;j++) list.remove(j);
        }
        list.add(s.charAt(i));
        flag = list.size();
        if (flag > carry) carry = flag;
        }
        return carry;
        }*/
//但是这样写并不好, 代码量效太低, 而且有显著漏洞----最长的是在前一组和后一组重叠部分呢?
// (像abcdxbc , asdsbkjlfh) 显然需要执行某种从首缩减当前容器的步骤
// 看了别人的思路后更新算法
/*设置两个箭头,一个前驱,一个永远指向最首位的元素, 每一次遇到重复字符就
从容器第一个元素开始砍,直到不包含当前重复元素了*
在进行前箭头的前驱
* */
class Test1 {
    public static int lengthOfLongestSubString(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int carry = 0, i = 0, j = 0;
        while (i < n && j < n) {
            //j是前节点 i是后节点 差值就是长度
            //循环的目的时找到[i, j]的长度
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));//必须j++ 这样j保证是实时长度值而不是实时下标值
                carry = Math.max(carry, j - i);//对比当前carry和这一轮录入的长度
            }
            else {
                set.remove(s.charAt(i++));//只
            }
        }
        return carry;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubString("anviaj") + "    " + lengthOfLongestSubString("pwwkew"));
    }
}