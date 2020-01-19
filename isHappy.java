import java.util.ArrayList;
import java.util.Arrays;

/*一个“快乐数”定义为：对于一个正整数，
每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。

示例:

输入: 19
输出: true
解释:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

/*
- 拆分整数,返回数组(有坑)

  ​	这里面遇到的问题就是它这个, 数组的内容不能有无意义的0因为下面要每个元素平方

  ​	获取长度要使用String把整数包装然后获得长度,输出要先使用Array包装

- 使用循环判断(有坑)

  ​	这个平方的加和是不是目标数1,如果不是就使用工具类继续更新数组,

  ​	并和上一次的拟目标数比对,如果一样说明进行了无尽循环,返回假

  ​	否则保存当前的拟目标数,准备下一轮的比对

- 填坑

  ​	这个工具类被传进去的参数可以是个位数,这样的话% /法就不适用了,就得对个位参数处理

  ​	比对的话它只能限制是一个数循环,有可能是一组数循环, 所以改成了List判断其中有没有当前的拟目标数字,如果没有就存放每次的拟目标数字
* */
class isHappy {
    public static void main(String[] args) {
        isHappy iH = new isHappy();
        System.out.println(iH.isHappy(2));
    }
    public boolean isHappy(int n) {
        int[] arr = helper(n);
        int current = 0;
        ArrayList<Object> objects = new ArrayList<>();
        while (current != 1) {
            current = 0;
            for (int i = 0; i < arr.length; i++) {
                current += Math.pow(arr[i], 2);
            }
            if (objects.contains(current)) return false;
            objects.add(current);
            arr = helper(current);
        }return true;
    }
    private int[] helper(int n) {
        int len = String.valueOf(n).length();
        int[] arr = new int[len];
        int i;
        if (len == 1) {
            arr[0] = n;
            return arr;
        }
        for (i = 0; n >= 10; i++) {
            arr[i] = n%10;
            n = n/10;
        }
        arr[i] = n;
        return arr;
    }
}