class Solution:

    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        length = self.size(head)
        
        if length == n:
            return head.next
            
        cur = head
        index = length - n
        for _ in range(index - 1):
            cur = cur.next
        
        cur.next = cur.next.next
        
        return head
        

    def size(self, head: ListNode) -> int:

        length = 0
        cur = head
        while cur:
            length += 1
            cur = cur.next

        return length
