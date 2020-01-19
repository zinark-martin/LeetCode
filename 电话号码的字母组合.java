import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 电话号码的字母组合 {

    Map<String,String> numbers = new HashMap<>() {{
        //两者都使用String串来表示,方便遍历于分割子串
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
}};
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

        if (digits.length() != 0)//非空
            backtrack("", digits);
        return result;
    }
    public void backtrack(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            result.add(combination);//递归出口, 将这一组组合加入List集合
        }
        else {
            String digit = next_digits.substring(0, 1);
            int length = numbers.get(digit).length();
            for (int i = 0; i < length; i++) {
                String letter = numbers.get(digit).substring(i, i + 1);
                //拿着一个字母连接上组合,进行下一个数字的递归
                backtrack(combination + letter, next_digits.substring(1));//从第一个字符往后的串
            }
        }
    }
}
