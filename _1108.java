package LeetCode;

public class _1108 {
    public static String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            char temp = address.charAt(i);
            if (temp == '.') {
                sb.append("[.]");
            } else {
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
