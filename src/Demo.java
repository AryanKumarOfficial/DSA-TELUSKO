import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        int[] nums = new int[10000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(0, 10000);
        }
        int target = 9000;
//        int result1 = linearSearch(nums, target);
//        int result = binarySearch(nums, target);
        int result = binarySearch(nums, target, 0, nums.length - 1); // using recursion
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;

        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by linear search: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear search: " + steps);
        return -1;
    }

//    public static int binarySearch(int[] nums, int target) {
//        int steps = 0;
//        int start = 0;
//        int end = nums.length - 1;
//        while (start <= end) {
//            steps++;
//            int mid = (start + end) / 2;
//            if (nums[mid] == target) {
//                {
//                    System.out.println("steps taken by binary search: " + steps);
//                    return mid;
//                }
//            } else if (nums[mid] > target)
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//
//        System.out.println("steps taken by binary search: " + steps);
//        return -1;
//
//    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                binarySearch(nums, target, 0, mid - 1);
            else
                binarySearch(nums, target, mid + 1, 0);
        }


        return -1;

    }
}
