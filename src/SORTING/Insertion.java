package SORTING;

public class Insertion {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Array before sorting: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        insertionSorting(nums);

        System.out.println("Array after sorting: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

    }

    public static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
