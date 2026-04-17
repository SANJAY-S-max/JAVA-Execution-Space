import java.util.Scanner;

class Kadane {
    public static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: "); 
        int nums = sc.nextInt();
        int[] arr = new int[nums];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = Kadane.maxSubArray(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}