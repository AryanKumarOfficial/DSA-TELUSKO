package DATA_STRUCTURES.STACK;

public class Stack {
    private final int[] stack;
    private int top = 0;

    public Stack(int limit) {
        stack = new int[limit];
    }

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        int data;
        data = stack[--top];
        return data;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
    }
}
