package LeetCode.LinkedLists;

public class InsertInLL {
    static ListNode head;

    public static void main(String[] args) {
        head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        head.next = first;
        first.next = second;
        second.next = null;
        insertNode(45, 3);
        traverse();
        deleteNode(2);
        traverse();
    }

    public static void traverse() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void insertNode(int data, int pos) {
        ListNode toAdd = new ListNode(data);
        if (pos == 0) {
            /*
             * The data is added to head*/
            toAdd.next = head;
            head = toAdd;
            return;
        }
        ListNode currentNode = head;
        for (int i = 0; i < pos - 1; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null)
            System.out.println("Cannot insert element");
        else {
            toAdd.next = currentNode.next;
            currentNode.next = toAdd;
        }

    }

    public static void deleteNode(int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        ListNode currentNode = head;
        for (int i = 0; i < pos - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }
}
