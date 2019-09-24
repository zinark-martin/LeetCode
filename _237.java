package LeetCode;

//删除链表中(非表尾的节点)
//此方法将下一个节点的值赋给当前节点, 再将当前节点指向下下一个节点
//删除替身

public class _237 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
