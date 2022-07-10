# Queue-Linked-List

**QUEUE (FIFO)**

Queue → abstract data type with the following operations:
enqueue(key) → adds key to collection
dequeue() → removes and returns least recently-added key
Empty → are there any elements?
Implement it with Linked List by adding new elements to the ListNode tail, and popping elements from ListNode head.

Enqueue → List.PushBack();
Dequeue → List.PopFront();

Each queue operation is O(1) → enqueue, dequeue, empty.

```
ENQUEUE: 1 2 3 4 5 
DEQUEUE VALUE: 1
DEQUEUE: 2 3 4 5 
DEQUEUE VALUE: 2
DEQUEUE: 3 4 5 
DEQUEUE VALUE: 3
DEQUEUE: 4 5 
DEQUEUE VALUE: 4
DEQUEUE: 5 
DEQUEUE VALUE: 5
DEQUEUE: QUEUE IS EMPTY!
DEQUEUE VALUE: -1
DEQUEUE: QUEUE IS EMPTY!
```
