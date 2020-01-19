public class onehundred_fiftytwo {
//    //乘积最大子序列
//    //必须是相邻的两个数
//    public int maxProduct(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        if (nums.length == 2) {
//            int product = nums[0] * nums[1];
//            return Math.max(product,Math.max(nums[0],nums[1]));
//        }
//
//        int one = nums[0], two = nums[1];
//
//        for (int i = 2; i < nums.length; i++) {
//            int product = one*two;
//            int three = nums[i];
//            if (two*three > product) {
//                one = two; two = three;
//            }
//        }
//        return one*two;
//    }

    /*这样做有个问题, 就是题目需要的结果其实可以是一个数,一个比乘积都大的数 所以此算法无法解决,需要改装*/
    public static void main(String[] args) {

    }

}
