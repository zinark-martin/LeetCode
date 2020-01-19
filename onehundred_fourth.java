public class onehundred_fourth {
}

class TreeNode104 {
      int val;
      TreeNode104 left;
      TreeNode104 right;
      TreeNode104(int x) { val = x; }
  }
class Solution104 {
    public int maxDepth(TreeNode104 root) {
        if (root == null)
            return 0;
        //充分利用函数的int型返回值
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1; //代表一层遍历完了 加上一层并回到上一层
    }
}