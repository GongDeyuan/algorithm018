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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(-1);
        ListNode pro = newNode;
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                pro.next = l1;
                l1 = l1.next;
            }else{
                pro.next = l2;
                l2 = l2.next;
            }
            pro = pro.next;
        }
        pro.next = l1==null?l2:l1;
        return newNode.next;
    }
}