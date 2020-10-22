/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead  = new ListNode(0);
        dummyHead.next = head;
        ListNode node = dummyHead;
        while(node.next != null && node.next.next != null){
            //保存1节点
            ListNode node1 = node.next;
            //保存2节点
            ListNode node2 = node.next.next;
            //头节点指向2节点
            node.next = node2;
            //1节点指向3节点
            node1.next = node2.next;
            //2节点指向1节点
            node2.next = node1;
            node = node1;
        }
        return dummyHead.next;
    }
}

