public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println();
        System.out.println("phan tu dc lay ra: " + queue.dequeue().key);
    }
}
