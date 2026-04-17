import java.util.*;
class RemoveDuplicates {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        return slow + 1;
    }
}
public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int nums = sc.nextInt();
        int[] array = new int[nums];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums; i++) {
            array[i] = sc.nextInt();
        }
        RemoveDuplicates rd = new RemoveDuplicates();
        int newLength = rd.removeDuplicates(array);
        System.out.println("The length of the array after removing duplicates is: " + newLength);
    }
}