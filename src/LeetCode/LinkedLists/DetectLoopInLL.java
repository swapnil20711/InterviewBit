package LeetCode.LinkedLists;

import java.util.HashSet;

public class DetectLoopInLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = null;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while (head != null) {
            if (set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
