public class RangeSumQuery {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 1};
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int sum = prefix[3] - prefix[0];
        System.out.println("Sum of index 1 to 3 is: " + sum);
    }
}
