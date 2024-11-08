// Definition for singly-linked list node
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListLength {

    // Function to find the length of the linked list
    public int findLength(Node head) {
        int length = 0;

        // Traverse the list using head directly
        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Calculate and print the length of the linked list
        LinkedListLength solution = new LinkedListLength();
        int length = solution.findLength(head);
        System.out.println("Length of the linked list: " + length);
    }
}
