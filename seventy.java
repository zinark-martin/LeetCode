//class Solution70 {
//    public int climbStairs(int n) {
//        int ways = 0;
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        ways = climbStairs(n-1) + climbStairs(n-2);
//        return ways;
//    }
//}
/*使用递归会直接超出时间限制*/

/*动态规划*/
class Solution70 {
    public int climbStairs(int n) {
        if (n==0) return 0;
        if (n==1) return 1;

        int [] ways = new int[n+1];
        ways[1] = 1; ways[2] = 2;
        //数组元素从3开始就是空了，所以从3开始使用方程相加
        for (int i = 3;i<=n;i++) {
            ways[i] = ways[i-1] + ways[i-2];//动态方程 （其实是个斐波那契）
        }
        return ways[n];
    }
}

//斐波那契 （非递归的）
class Fib{
    public int climbFib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int one = 1;
        int two = 2;
        for (int i = 3; i <= n ; i++) {
            int three = one + two;
            one = two;
            two = three;
            //1,2进行前驱， 2总是最前也就是最新的结果所以返回2，3每次负载加和的值
        }
        return two;
    }
}
