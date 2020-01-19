import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class onehundred_nd {
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  class Solution {
    List <List<Integer>> levels = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return levels;
        ex(root, 0);
        return levels;
    }
    //无参数返回, 方法只对levelOrder List进行操作
      public void ex (TreeNode node, int level) {
          if (levels.size() == level)//新的一层 需要新的一个数组
              levels.add(new ArrayList<Integer>());
          levels.get(level).add(node.val);//每一层对应的List是固定的
          if (node.left!=null)
              ex(node.left,level+1);//每一次遍历都是更深层遍历
          if (node.right!=null)
              ex(node.right,level+1);
      }//先序遍历 但是是每一层的存入它这一层的(下标)的List中
  }