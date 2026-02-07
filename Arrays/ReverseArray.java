
import java.util.Arrays;


public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = ArrayUtility.arrInp();

        reverse(arr);

    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
        System.out.println("Array is " + Arrays.toString(arr));
    }
}
