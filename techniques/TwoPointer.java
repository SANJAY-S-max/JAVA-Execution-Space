import java.util.Scanner;

class TargetSum {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // Return -1 if no solution is found
    }
}


public class TwoPointer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int nums = sc.nextInt();
        int[] array = new int[nums];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        TargetSum ts = new TargetSum();
        int[] result = ts.twoSum(array, target);
        if (result[0] != -1) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }
}
