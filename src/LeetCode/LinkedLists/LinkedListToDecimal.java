package LeetCode.LinkedLists;

public class LinkedListToDecimal {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode f = new ListNode(1);
        ListNode s = new ListNode(1);
        head.next = f;
        f.next = s;
        System.out.println(getDecimalValue(head));
    }

    /*
     * Time complexity O(2N) APPROXIMATELY*/
    public static int getDecimalValue(ListNode head) {
        ListNode currentNode = head;
        int count = 0, decimal = 0;
        while (currentNode != null && currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }
        ListNode temp = head;
        while (temp != null) {
            decimal += Math.pow(2, count) * temp.data;
            count--;
            temp = temp.next;
        }
        return decimal;
    }

    /*
     * Time complexity:O(N)
     * */
    public static int secondMethod(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 2 + head.data;
            head = head.next;
        }
        return sum;
    }
}