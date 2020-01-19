public class sixty_nine {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int lift = 1, right = x, res = 0;//res 从函数中传递mid的值
        while (lift <= right) {
            int mid = (lift + right) / 2;
            if (mid == x / mid)//要防止出现特别大的数导致mid*mid越界，当然也可以将参数全改成long
            {
                return mid;
            }else if (mid > x /mid) {
                right = mid - 1;
            } else {
                lift = mid + 1;
                res = mid;
            }
        }
        return res;
    }
}
