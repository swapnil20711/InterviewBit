package LeetCode.LinkedLists;

public class ReverseLL {
    static ListNode head = new ListNode(1);

    public static void main(String[] args) {
        ListNode firstNode = new ListNode(2);
        ListNode secondNode = new ListNode(3);
        head.next = firstNode;
        firstNode.next = secondNode;
        reverseLL();
        traverse();
    }

    public static void traverse() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void reverseLL() {
        ListNode currentNode = head;
        ListNode prev = null;
        ListNode forward;
        while (currentNode != null) {
            forward = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = forward;
            head = prev;
        }
    }
}
