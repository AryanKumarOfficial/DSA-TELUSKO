package DATA_STRUCTURES.LINKEDLIST;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(51);
        list.insert(1);
        list.insert(10);
        list.insertAtStart(301);
        list.insert(302);
        list.insertAt(0, 102);
        list.show();
    }
}
