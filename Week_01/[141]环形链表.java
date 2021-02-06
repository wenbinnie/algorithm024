/**
 * 时间复杂度 O（n）
 * 空间复杂度 O(n)
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

/**
 * 快慢指针
 * 时间复杂度O（n）
 * 空间复杂度 O(1)
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
