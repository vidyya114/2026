public class FindMax {
    public static void main(String[] args) {
        int arr[] = {12, 56, 89, 354};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("The greatest number is " + max);
    }
}
