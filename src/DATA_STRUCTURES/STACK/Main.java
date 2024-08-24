package DATA_STRUCTURES.STACK;


public class Main {
    public static void main(String[] args) {
        Stack nums = new Stack(5);
        nums.push(15);
        nums.push(32);
        nums.push(6);
        nums.push(11);
        nums.push(19);

        System.out.println(nums.pop());
        System.out.println(nums.peek());
        nums.show();
    }
}
