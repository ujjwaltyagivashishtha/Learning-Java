
public class Q852 {

    public static void main(String[] args) {
        int[] arr = {
            1, 3, 5, 7, 9, 12, 15, 18, 22, 27,
            31, 36, 40, 45, 50, 55, 47, 43, 38, 34, 29,
            24, 19, 14, 8, 2
        };

        int result = peakIndexInMountainArray(arr);
        System.out.println(result);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
              end = mid;
            } else{
              start = mid + 1;
            }
        }

        return arr[end];
    }
}
