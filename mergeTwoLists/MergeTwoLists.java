package mergeTwoLists;

public class MergeTwoLists {


    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * <p>
     * 输入：l1 = [1,2,4], l2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
     * 示例 2：
     * <p>
     * 输入：l1 = [], l2 = []
     * 输出：[]
     * 示例 3：
     * <p>
     * 输入：l1 = [], l2 = [0]
     * 输出：[0]
     * <p>
     * <p>
     * 提示：
     * <p>
     * 两个链表的节点数目范围是 [0, 50]
     * -100 <= Node.val <= 100
     * l1 和 l2 均按 非递减顺序 排列
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/merge-two-sorted-lists
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param list1
     * @param list2
     * @return
     */

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 定义一个 root 节点
        ListNode root = new ListNode(-1);
        ListNode temp = root;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = list1 == null ? list2 : list1;
        return root.next;
    }

    public static void main(String[] args) {
        ListNode left = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode right = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(left, right));
    }
}

