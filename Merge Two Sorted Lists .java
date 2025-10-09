/*21. Merge Two Sorted Lists */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode ptr = null;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Initialize head and ptr
        if (list1.val < list2.val) {
            head = ptr = list1;
            list1 = list1.next;
        } else {
            head = ptr = list2;
            list2 = list2.next;
        }

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }

        // Attach remaining nodes
        if (list1 != null) ptr.next = list1;
        else ptr.next = list2;

        return head;
    }
}
