import java.util.Scanner;

public class MaxSumSubarrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input window size
        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        int result = maxSum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " = " + result);
    }

    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];       // add next element
            windowSum -= arr[i - k];   // remove first element

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}