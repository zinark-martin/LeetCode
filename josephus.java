package LeetCode;
import	java.util.Scanner;
import java.util.ArrayList;
public class josephus {
    public static void in(int totalNum, int countNum) {
        ArrayList<Integer> start = new ArrayList<>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        int k = 0;//从第一个人开始计数
        while (start.size() > 0) {
            k = k + countNum;
            k = k % (start.size()) - 1;
            //因为索引是从0开始，进行取余是因为防止k大于圈中人的总数
            //判断是否到队尾，即k的大小为start的大小，此时k为-1
            if (k < 0) {
                System.out.print(start.get(start.size() - 1) + " ");
                start.remove(start.size() - 1);
                k = 0;
            } else {//否则，直接输出k对应的元素
                System.out.print("清除" + start.get(k) + " ");
                start.remove(k);
            }

        }
    }

    public static void main(String[] args) {
        int i, j;
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        j = in.nextInt();
        in(i, j);
    }
}

