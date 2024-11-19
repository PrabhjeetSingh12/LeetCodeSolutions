package linkedlist;


public class LinkedListLength {

    public int findLength(Node head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        LinkedListLength solution = new LinkedListLength();
        int length = solution.findLength(head);
        System.out.println("Length of the linked list: " + length);
    }
}
