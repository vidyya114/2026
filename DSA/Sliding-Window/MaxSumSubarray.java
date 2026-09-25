public class MaxSumSubarray {
    public static int findMaxSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        int currentSum = 0;
        for (int i = 0; i < k; i++) currentSum += arr[i];
        int maxSum = currentSum;
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println("Max Sum: " + findMaxSum(arr, 3));
    }
}
