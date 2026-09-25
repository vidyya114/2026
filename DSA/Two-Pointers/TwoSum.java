public class TwoSum {
    public static int[] findTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) return new int[]{left, right};
            else if (currentSum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 10};
        int target = 14;
        int[] res = findTwoSum(nums, target);
        if (res[0] != -1) System.out.println("Found at indices: " + res[0] + ", " + res[1]);
        else System.out.println("No pair found.");
    }
}
