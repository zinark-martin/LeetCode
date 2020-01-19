//import javax.imageio.stream.ImageInputStream;
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import	java.util.List;
//
//
//
//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);//将返回带有结果的列表
//        return res;
//    }
//
//    public void helper(TreeNode root, List < Integer > res) {
//        if (root != null) {
//
//            if (root.left != null) {
//                helper(root.left, res);
//            }
//            res.add(root.val);//中序的体现
//            if (root.right != null) {
//                helper(root.right, res);
//            }
//
//        }
//    }
//}
//
