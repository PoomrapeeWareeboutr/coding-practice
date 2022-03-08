class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode cur = head;
        while (cur != null) {
            if (cur.next != null) {
                int temp = cur.val;
                cur.val = cur.next.val;
                cur.next.val = temp;
                cur = cur.next.next;
            } else {
                break;
            }
        }
        
        return head;
    }
}
