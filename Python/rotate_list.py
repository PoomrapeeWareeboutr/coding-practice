class Solution:

    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if not head or not head.next:
            return head
        if k == 0:
            return head
        
        deque = []
        cur = head
        while cur:
            deque.append(cur.val)
            cur = cur.next
        
        k = k % len(deque)
        while k > 0:
             deque.insert(0, deque.pop())
             k -= 1

        cur = head
        while cur:
            cur.val = deque.pop(0)
            cur = cur.next
            
        return head
