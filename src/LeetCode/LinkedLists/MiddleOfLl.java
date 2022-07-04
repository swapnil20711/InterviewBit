package LeetCode.LinkedLists;

public class MiddleOfLl {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode f = new ListNode(2);
        ListNode s = new ListNode(3);
        ListNode t = new ListNode(4);
        ListNode th = new ListNode(5);
        ListNode six = new ListNode(6);
        head.next = f;
        f.next = s;
        s.next = t;
        t.next = th;
        th.next = six;
        System.out.println(middleNode(head).data);
    }

    public static ListNode middleNode(ListNode head) {
        int numberOfNodes = 0, counter = 0;
        ListNode temp = head;
        while (temp != null) {
            numberOfNodes++;
            temp = temp.next;
        }
        ListNode currentNode = head;
        while (currentNode != null) {
            if (counter == Math.ceil((numberOfNodes) / 2)) {
                return currentNode;
            }
            counter++;
            currentNode = currentNode.next;
        }
        return null;
    }

    public static ListNode secondMethod(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
