public class FirstNonnegative {
    public static void main(String[] args) {
        int arr[] = {-1, -4, -7, 0, 9};
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result = arr[i];
                break;
            }
        }
        if (result != -1) System.out.println("Non negative number is " + result);
        else System.out.println("No non-negative number found.");
    }
}
