public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode greaterDum = new ListNode(0);
        ListNode lessDum = new ListNode(0);

        ListNode great = greaterDum;
        ListNode less = lessDum;

        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                great.next = head;
                great = great.next;
            }

            head = head.next;
        }

        great.next = null;

        less.next = greaterDum.next;

        return lessDum.next;
    }
}
