import java.util.Scanner;

class KadaneSubArray {
    public void maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Max Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class KadaneSubArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: "); 
        int nums = sc.nextInt();
        int[] arr = new int[nums];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums; i++) {
            arr[i] = sc.nextInt();
        }
        KadaneSubArray kadane = new KadaneSubArray();
        kadane.maxSubArray(arr);
    }
}