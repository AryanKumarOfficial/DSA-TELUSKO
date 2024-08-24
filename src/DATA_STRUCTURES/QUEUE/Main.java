package DATA_STRUCTURES.QUEUE;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.enQueue(10);
        queue.enQueue(30);
        queue.enQueue(20);
        queue.enQueue(7);
        queue.enQueue(36);

        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.isFull());

        queue.enQueue(9);
        queue.enQueue(22);
//        queue.enQueue(222);
//        queue.enQueue(52);

        queue.show();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.getSize());
    }
}
