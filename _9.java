package LeetCode;
//回文数
public class _9 {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int flag = x;
        int carry = 0, y = 0;
        while(x!=0){
            carry = x%10;
            x = x/10;
            y = carry + y*10;
        }
        if (flag==y) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
