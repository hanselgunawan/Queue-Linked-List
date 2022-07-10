class QueueLinkedList {

    static class ListNode {
        int item;
        ListNode next;
        ListNode(int item) {
            this.item = item;
        }
    }

    static class MyQueue {
        ListNode head;
        ListNode tail;
        int size = 0;

        public void show() {
            if (size == 0) {
                System.out.print("QUEUE IS EMPTY!");
            }
            ListNode iterator;
            iterator = head;

            while (iterator != null) {
                System.out.print(iterator.item + " ");
                iterator = iterator.next;
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void enqueue(int item) {
            ListNode node = new ListNode(item);
            if (head == null && tail == null) {
                head = node;
                tail = node;
                size++;
                return;
            }

            tail.next = node;
            tail = node;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) return -1;
            int val = head.item;

            ListNode curr = head;
            curr = curr.next;
            head.next = null;
            head = curr;
            size--;

            if (isEmpty()) tail = null;
            return val;
        }
    }

    public static void main(String[] args) throws Exception {
        MyQueue queue = new MyQueue();

        // ENQUEUE
        System.out.print("ENQUEUE: ");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.show();
        System.out.println("");

        // DEQUEUE
        System.out.println("DEQUEUE VALUE: " + queue.dequeue());

        System.out.print("DEQUEUE: ");
        queue.show();
        System.out.println("");

        System.out.println("DEQUEUE VALUE: " + queue.dequeue());
        System.out.print("DEQUEUE: ");
        queue.show();
        System.out.println("");

        System.out.println("DEQUEUE VALUE: " + queue.dequeue());
        System.out.print("DEQUEUE: ");
        queue.show();
        System.out.println("");

        System.out.println("DEQUEUE VALUE: " + queue.dequeue());
        System.out.print("DEQUEUE: ");
        queue.show();
        System.out.println("");

        System.out.println("DEQUEUE VALUE: " + queue.dequeue());
        System.out.print("DEQUEUE: ");
        queue.show();
        System.out.println("");

        System.out.println("DEQUEUE VALUE: " + queue.dequeue());
        System.out.print("DEQUEUE: ");
        queue.show();
        System.out.println("");

        queue.enqueue(5);
        queue.show();

    }
}
