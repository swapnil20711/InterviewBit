package LeetCode.LinkedLists;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode f = new ListNode(2);
        ListNode s = new ListNode(3);
        head.next = f;
        f.next = s;
        System.out.println(reverseList(head).data);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode currentNode = head;
        ListNode forward;
        while (currentNode != null) {
            forward = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = forward;
        }
        return prev;
    }
}
