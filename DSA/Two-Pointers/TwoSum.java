public class TwoSum {
    public static int[] findTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // Not found
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 10};
        int target = 14;
        int[] result = findTwoSum(nums, target);
        if (result[0] != -1) {
            System.out.println("Found at indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}
