package SORTING;

public class Selection {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int temp;
        int midIndex;
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        // logic for sorting

        for (int i = 0; i < size - 1; i++) {
            midIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[midIndex] > nums[j]) {
                    midIndex = j;
                }
            }
            temp = nums[midIndex];
            nums[midIndex] = nums[i];
            nums[i] = temp;

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

    }
}
