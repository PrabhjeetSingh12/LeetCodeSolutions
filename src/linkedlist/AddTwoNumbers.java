package linkedlist;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {

    // Function to add two numbers represented as linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Placeholder node
        ListNode curr = dummyHead;           // Pointer to build the result list
        int carry = 0;                       // Initialize carry to 0

        // Loop until both lists are exhausted and there's no carry
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0; // Value from l1 or 0 if null
            int y = (l2 != null) ? l2.val : 0; // Value from l2 or 0 if null
            int sum = carry + x + y;           // Sum of values and carry
            carry = sum / 10;                  // Update carry
            curr.next = new ListNode(sum % 10); // Create a new node with sum % 10
            curr = curr.next;                  // Move the pointer forward

            if (l1 != null) l1 = l1.next;      // Move l1 forward
            if (l2 != null) l2 = l2.next;      // Move l2 forward
        }

        return dummyHead.next;                 // Return the result list
    }

    // Utility function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example linked list: l1 = [2, 4, 3]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Example linked list: l2 = [5, 6, 4]
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Create an instance of the Solution class
        AddTwoNumbers solution = new AddTwoNumbers();

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.println("Resultant Linked List:");
        printList(result);
    }
}
