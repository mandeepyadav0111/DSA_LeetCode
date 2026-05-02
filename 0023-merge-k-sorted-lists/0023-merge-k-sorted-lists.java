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
            while(head!=null){
                q.add(head);
                head=head.next;
            }
        }
        ListNode dummy= new ListNode(0);
        ListNode head=dummy;
        while(!q.isEmpty()){
            head.next= q.poll();
            head=head.next;
        }
        return dummy.next;
    }
}