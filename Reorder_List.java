public class Reorder_List {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode sec = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (sec != null) {
            ListNode next = sec.next;
            sec.next = prev;
            prev = sec;
            sec = next;
        }

        ListNode first = head;
        sec = prev;

        while (sec != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = sec.next;

            first.next = sec;
            sec.next = temp1;

            first = temp1;
            sec = temp2;
        }
    }
}
