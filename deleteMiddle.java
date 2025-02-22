class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode d=new ListNode(0);
        ListNode curr=d;
        
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            curr.next=new ListNode(slow.val);
            curr=curr.next;
            slow=slow.next;
            
        }
        slow=slow.next;
      while(slow!=null){
         curr.next=new ListNode(slow.val);
         curr=curr.next;
        slow=slow.next;
      }
      return  d.next;
      
        
    }
}