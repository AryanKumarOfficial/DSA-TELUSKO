package SORTING;

public class Main {
    public static void main(String[] args) {

        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int temp = 0;
        int steps = 0;
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // logic for sorting
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                steps++;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }


        System.out.println();
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("steps by bubble sort: " + steps);

    }
}
