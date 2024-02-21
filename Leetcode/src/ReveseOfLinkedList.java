public class ReveseOfLinkedList {
    int val;
    ReveseOfLinkedList next;
    ReveseOfLinkedList() {
    }

    ReveseOfLinkedList(int val) {
        this.val = val;
    }

    ReveseOfLinkedList(int val, ReveseOfLinkedList next) {
        this.val = val;
        this.next = next;
    }

    class Solution {
        public ReveseOfLinkedList reverseList(ReveseOfLinkedList head) {
            ReveseOfLinkedList prev = null;
            ReveseOfLinkedList present= head;
            ReveseOfLinkedList Next=present.next;
            if (head == null || head.next == null) {
                return head;
            } else {
                while (present != null) {
                    present.next=prev;
                    prev=present;
                    present=Next;
                    if(Next!=null){
                        Next=Next.next;
                    }
                }
            }
            return prev;
        }
    }
}