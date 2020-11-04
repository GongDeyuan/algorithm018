//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 链表 
// 👍 69 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        loop(list,head);
        int[] result = new int[list.size()];
        for(int i = 0;i< list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
    public void loop(List list,ListNode node){
        if(node == null)
            return;
        loop(list,node.next);
        list.add(node.val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
