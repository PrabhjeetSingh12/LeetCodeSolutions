package linkedlist;
class Nodee {
    int data;
    Nodee next;

    // Constructor to create a new node
    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    // Function to remove the last node of the linked list
    static Nodee removeLastNode(Nodee head) {
        // If the list is empty, return null
        if (head == null)
            return null;

        // If the list has only one node, delete it and return null
        if (head.next == null) {
            return null;
        }

        // Find the second last node
        Nodee second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Remove the last node
        second_last.next = null;

        // Return the modified list
        return head;
    }

    // Function to print the linked list
    static void printList(Nodee head) {
        Nodee temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        Nodee head = new Nodee(1);
        head.next = new Nodee(2);
        head.next.next = new Nodee(3);
        head.next.next.next = new Nodee(4);

        System.out.println("Original list:");
        printList(head);

        // Remove the last node
        head = removeLastNode(head);

        System.out.println("After removing the last node:");
        printList(head);

        // Test case: Removing nodes until the list is empty
        head = removeLastNode(head);
        printList(head);
        head = removeLastNode(head);
        printList(head);
        head = removeLastNode(head);
        printList(head);
    }
}

