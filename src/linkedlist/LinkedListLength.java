package linkedlist;

// Definition for singly-linked list node
 class Node {
    int data;
    Nodee next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class LinkedListLength {

    // Function to find the length of the linked list
    public int findLength(Nodee head) {
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
        Nodee head = new Nodee(1);
        head.next = new Nodee(2);
        head.next.next = new Nodee(3);
        head.next.next.next = new Nodee(4);
        head.next.next.next.next = new Nodee(5);

        // Calculate and print the length of the linked list
        LinkedListLength solution = new LinkedListLength();
        int length = solution.findLength(head);
        System.out.println("Length of the linked list: " + length);
    }
}
