import java.util.List;
/*使用递归完成:
* 首先设置好金字塔的下限,即最后一行为递归出口
* 然后每一次递归都向下一行,由于每个元素有且只
* 有两个子元素,所以右路递归时候要加一,左不加
* 当前递归结束时的左右子元素中小的那个加上当
* 前元素的值就是此次递归结果的返回值, 以此类
* 推加到栈顶为最终答案. 但是会直接超时!*/
public class onehundred_twenty {
    public int minimumTotal (List<List<Integer>> triangle) {
       return helper(0,0,triangle);
    }

    private int helper(int level, int num, List<List<Integer>> triangle) {
        if (level == triangle.size() -1 ) {
            return triangle.get(level).get(num);//这里return给的是上次层的helper
        }
        int left = helper(level+1,num,triangle);
        int right = helper(level+1,num+1,triangle);
        return Math.min(right, left)+triangle.get(level).get(num);
    }
}

class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] min = new int[row+1];
        for (int level = row-1; level >= 0; level--) {
            for (int i=0;i<=level;i++){
                //第一次也就是最底行开始时min都是null，也就是相当于执行了一次给最底行填值
                min[i] = Math.min(min[i],min[i+1]) + triangle.get(level).get(i);
                //每一次循环对数组的操作相当于是“更新” 所以一维数组足够 所以返回的是min[0]也就是顶峰数
            }
        }
        return min[0];
    }
}
