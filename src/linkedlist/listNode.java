package linkedlist;

import java.util.PriorityQueue;

class MergeKSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null)
                heap.add(node);
        }

        ListNode head = new ListNode(0);
        ListNode current = head;

        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            current.next = node;
            current = current.next;

            if (node.next != null) {
                heap.add(node.next);
            }
        }

        return head.next;
    }

    public static void main(String[] args) {
        // Creating test linked lists
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        // Array of linked lists to merge
        ListNode[] lists = {list1, list2, list3};

        // Merging the lists
        MergeKSortedLists merger = new MergeKSortedLists();
        ListNode mergedList = merger.mergeKLists(lists);

        // Printing the merged list
        printList(mergedList);
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
