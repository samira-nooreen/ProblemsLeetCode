
/* 138. Copy List with Random Pointer*/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Make copy nodes and insert them next to originals
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers to copies
        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        // Step 3: Separate the two lists
        curr = head;
        Node newHead = head.next;
        Node temp = newHead;

        while (curr != null) {
            curr.next = curr.next.next;
            if (temp.next != null)
                temp.next = temp.next.next;
            curr = curr.next;
            temp = temp.next;
        }

        return newHead;
    }
}
