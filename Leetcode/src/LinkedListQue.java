public class LinkedListQue {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode DummyHead=new ListNode();
        ListNode tail=DummyHead;
        int sum=0;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int digit1=l1!=null?l1.val:0;
            int digit2=l2!=null?l2.val:0;
            int s=digit1+digit2+carry;
            sum=s%10;
            carry=s/10;
            ListNode node=new ListNode(sum);
            tail.next=node;
            tail=tail.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return DummyHead.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=Next;
            Next=Next.next;
            head=prev;
        }
        return head;
    }
}
