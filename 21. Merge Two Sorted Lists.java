// 21. Merge Two Sorted Lists
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null, ptr = null;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (list1 != null && list2 != null) {
            if (head == null) {
                if (list1.val < list2.val) {
                    ptr = head = list1;
                    list1 = list1.next;
                } else {
                    ptr = head = list2;
                    list2 = list2.next;
                }
                continue;
            }
            if (list1.val < list2.val) {
                ptr.next = list1;
                ptr = ptr.next;  // Move ptr forward
                list1 = list1.next;
            } else {
                ptr.next = list2;
                ptr = ptr.next;  // Corrected from ptr = list2
                list2 = list2.next;
            }
        }

        // Attach remaining nodes
        if (list1 != null)
            ptr.next = list1;
        else
            ptr.next = list2;

        return head;
    }
}
