import java.util.Arrays;

public class ShuffleArray {
  public static void main(String[] args) {
    int[] nums = {1,1,2,2};
    int n = nums.length / 2;
    int[] res = shuffle(nums, n);

    System.out.print(Arrays.toString(res));
  }

  public static int[] shuffle(int[] nums, int n){
    int k=0;
    int j=1;
    int[] result = new int[2*n];
    // System.out.println(Arrays.toString(nums));
    // System.out.println(Arrays.toString(result));

    for (int i=0; i<2*n; i++) {
      if (i%2 == 0) {
        result[i] = nums[i-k];
        k++;
      } else {
        result[i] = nums[n-1+j];
        j++;
      }
    }
    return result;
  }
}
