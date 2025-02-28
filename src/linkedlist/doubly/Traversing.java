package linkedlist.doubly;

// Define the Node class
class Node {
    int data; // Data stored in the node
    Node next; // Pointer to the next node
    Node prev; // Pointer to the previous node

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Class to manage the doubly linked list
class Traversing {

    // Function to traverse the doubly linked list
    // in forward direction
    static void forwardTraversal(Node head) {

        // Start traversal from the head of the list
        Node curr = head;

        // Continue until the current node is
        // null (end of the list)
        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the next node
            curr = curr.next;
        }

        // Print newline after traversal
        System.out.println();
    }

    // Function to traverse the doubly linked list
    //in backward direction
    static void backwardTraversal(Node tail) {

        // Start traversal from the tail of the list
        Node curr = tail;

        // Continue until the current node is
        // null (end of the list)
        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the previous node
            curr = curr.prev;
        }

        // Print newline after traversal
        System.out.println();
    }

    public static void main(String[] args) {

        // Sample usage of the doubly linked
        // list and traversal functions
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Forward Traversal:");
        forwardTraversal(head);

        System.out.println("Backward Traversal:");
        backwardTraversal(third);
    }
}
