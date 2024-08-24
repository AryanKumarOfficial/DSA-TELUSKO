package DATA_STRUCTURES.STACK;


public class Main {
    public static void main(String[] args) {
        Stack nums = new Stack(5);
        System.out.println(nums.isEmpty());
        nums.push(15);
        nums.push(32);
        nums.push(6);
        nums.push(11);
        nums.push(19);
        nums.push(191);


        nums.show();


        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();

    }
}
