import java.util.*;
class FindElement{
    FindElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find: ");
        int element = sc.nextInt();
        for(int i=0; i<array.length; i++){
            if(array[i] == element){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}

public class LinearSearchArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int nums = sc.nextInt();
        int[] array = new int[nums];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        FindElement fe = new FindElement(array);
        sc.close();
    }
}