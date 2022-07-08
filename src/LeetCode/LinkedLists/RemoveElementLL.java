package LeetCode.LinkedLists;

public class RemoveElementLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode f = new ListNode(2);
        ListNode s = new ListNode(2);
        ListNode t = new ListNode(2);
        ListNode th = new ListNode(2);
        ListNode six = new ListNode(2);
        head.next = f;
        f.next = s;
        s.next = t;
        t.next = th;
        th.next = six;
        System.out.println(removeElements(head, 0));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode tail = prev;
        while (tail != null && tail.next != null) {
            if (tail.next.data == val) {
                ListNode temp = tail.next;
                tail.next = temp.next;
            } else {
                tail = tail.next;
            }
        }
        return prev.next;
    }
}
