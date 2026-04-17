import java.util.*;

class ReverseArrayElement{
    ReverseArrayElement(int[] array){
        System.out.println("The elements of the array in reverse order are: ");
        for(int i=0; i<array.length/2; i++){
            int tp=array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tp;
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}


public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int nums = sc.nextInt();
        int[] array = new int[nums];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        ReverseArrayElement rae = new ReverseArrayElement(array);
        sc.close();
    }
}
