class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode current = head;

        while (current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public void printList(ListNode head){
        ListNode curr = head;
        while (curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ReverseLinkedList solution = new ReverseLinkedList();

        solution.printList(head);

        ListNode reversed = solution.reverseList(head);

        solution.printList(reversed);
    }

}


