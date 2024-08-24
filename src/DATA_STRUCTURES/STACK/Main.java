package DATA_STRUCTURES.STACK;


public class Main {
    public static void main(String[] args) {
        DynamicStack nums = new DynamicStack();
        System.out.println(nums.isEmpty());
        nums.push(15);
        nums.show();
        nums.push(32);
        nums.show();
        nums.push(6);
        nums.show();
        nums.push(11);
        nums.show();
        nums.push(19);
        nums.show();
        nums.push(191);
        nums.show();


        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();

    }
}
