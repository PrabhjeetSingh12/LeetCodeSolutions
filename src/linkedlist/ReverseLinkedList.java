package linkedlist;

public class ReverseLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert at the beginning
    public Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Function to reverse the linked list
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Save next node
            current.next = prev;  // Reverse current node's pointer
            prev = current;       // Move prev and current one step forward
            current = next;
        }
        head = prev;  // Update head to new first element
        return head;
    }

    // Helper function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        Node head = null;

        // Insert values at the beginning
        head = list.insertAtBeginning(head, 10);
        head = list.insertAtBeginning(head, 20);
        head = list.insertAtBeginning(head, 30);

        // Print the original list
        System.out.println("Original List:");
        list.printList(head);

        // Reverse the list
        head = list.reverseList(head);

        // Print the reversed list
        System.out.println("Reversed List:");
        list.printList(head);
    }
}
