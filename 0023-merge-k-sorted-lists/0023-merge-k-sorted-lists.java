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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q= new PriorityQueue<>((a,b)->a.val-b.val);
        if(lists.length==0) return null;
        for(int i=0; i<lists.length;i++){
            ListNode head= lists[i];
            if(head!= null){
                q.offer(head);
            }
        }
        ListNode dummy= new ListNode(0);
        ListNode head=dummy;
        while(!q.isEmpty()){
            ListNode min= q.poll();
            head.next=min;
            if(min.next != null){
                q.offer(min.next);
            }     
            head=head.next;
        }
        return dummy.next;
    }
}