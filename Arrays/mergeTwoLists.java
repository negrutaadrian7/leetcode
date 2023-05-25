package Arrays;

public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode finalList = new ListNode(0); // for the final result
        ListNode current = finalList;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;

        }
        // we know that the lists are sorted
        current.next = l1 == null ? l2 : l1; // if l1 == null then l2, else l1;
        return finalList.next;
    }
}
