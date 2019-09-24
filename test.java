package LeetCode;

import java.util.Arrays;

public class test {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int[] carry = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {//若二串长度短, 则会多次进入for循环
                int n2 = num2.charAt(j) - '0';
                int sum = (carry[i + j + 1] + n1 * n2);
                carry[i + j + 1] = sum % 10;//进位或不进位逻辑一样
                carry[i + j] += sum / 10; //最后可能会留下一位零
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < carry.length; i++) {
            if (i == 0 && carry[i] == 0) continue;//判断首位去零
            result.append(carry[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123","456"));
    }
}