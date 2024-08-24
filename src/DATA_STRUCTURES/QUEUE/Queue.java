package DATA_STRUCTURES.QUEUE;

public class Queue {
    private final int[] queue = new int[6];
    private int size;
    private int front;
    private int rear;


    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = (front + 1) % 5;
            size--;
        } else {
            System.out.println("Queue is empty");
        }
        return data;
    }

    public void show() {
        System.out.print("Elements :");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
        for (int num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == 5;
    }

}
